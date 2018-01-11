package com.lewis.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lewis.mapper.DepartmentMapper;
import com.lewis.mapper.SalaryOrderMapper;
import com.lewis.mapper.SalaryStandardMapper;
import com.lewis.mapper.StaffMapper;
import com.lewis.pojo.SalaryOrder;
import com.lewis.pojo.SalaryOrderExample;
import com.lewis.pojo.SalaryStandard;
import com.lewis.pojo.Staff;
import com.lewis.pojo.StaffExample;
import com.lewis.pojo.StaffExample.Criteria;
import com.lewis.pojo.StaffExt;
import com.lewis.pojo.StaffWithBLOBs;
import com.lewis.service.IStaffService;

@Service
public class StaffServiceImpl implements IStaffService {

	@Autowired
	private StaffMapper staffMapper;
	@Autowired
	private DepartmentMapper deptMapper;
	@Autowired
	private SalaryOrderMapper soMapper;
	@Autowired
	private SalaryStandardMapper sdMapper;

	@Transactional
	@Override
	public void addStaff(StaffWithBLOBs staff) {

		getStaffNum(staff);

		// staff.setNum(num + "");
		String staffNum = getStaffNum(staff);
		staff.setNum(staffNum);
		staff.setStatus(0);
		staffMapper.insert(staff);

		// 在薪酬发放单加基本工资总的
		Integer standardId = staff.getStandardId();
		SalaryStandard standard = sdMapper.selectByPrimaryKey(standardId);
		Double baseSalary = standard.getTotalsalary();

		// 在薪酬发放单根据三级机构，人数加一
		String juniorDept = staff.getJuniorDept();
		SalaryOrderExample example = new SalaryOrderExample();
		com.lewis.pojo.SalaryOrderExample.Criteria criteria = example
				.createCriteria();
		criteria.andJuniorDeptEqualTo(juniorDept);
		List<SalaryOrder> list = soMapper.selectByExample(example);
		if (list != null && list.size() != 0) {
			SalaryOrder salaryOrder = list.get(0);
			salaryOrder.setPeople(salaryOrder.getPeople() + 1);// 加人数
			if (salaryOrder.getBaseTotal() == null) {
				salaryOrder.setBaseTotal(0d);
			}
			salaryOrder.setBaseTotal(salaryOrder.getBaseTotal() + baseSalary);// 加总的基本工资
			soMapper.updateByPrimaryKey(salaryOrder);
		}

	}

	public String getStaffNum(StaffWithBLOBs staff) {

		Calendar calendar = Calendar.getInstance();
		int year = calendar.getWeekYear();

		String principleDept = staff.getPrincipleDept();
		String seniorDept = staff.getSeniorDept();
		String juniorDept = staff.getJuniorDept();

		String pNum = deptMapper.selectDeptNumByName(principleDept);
		String sNum = deptMapper.selectDeptNumByName(seniorDept);
		String jNum = deptMapper.selectDeptNumByName(juniorDept);

		StaffExample example = new StaffExample();
		int num = staffMapper.countByExample(example) + 1;

		String numString = year + pNum + sNum + jNum + num;
		return numString;
	}

	@Override
	public List<Staff> selectUnchecked() {

		StaffExample example = new StaffExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(0);
		List<Staff> list = staffMapper.selectByExample(example);

		return list;
	}

	@Override
	public StaffWithBLOBs selectStaffById(int id) {

		StaffWithBLOBs bloBs = staffMapper.selectByPrimaryKey(id);
		return bloBs;
	}

	@Override
	public void updateStaff(StaffWithBLOBs staff) {
		staff.setStatus(1);
		staffMapper.updateByPrimaryKey(staff);
	}

	@Override
	public List<StaffWithBLOBs> selectByCondition(StaffExample example) {
		List<StaffWithBLOBs> list = staffMapper
				.selectByExampleWithBLOBs(example);
		return list;
	}

	@Override
	public void deleteStaffById(int id) {
		staffMapper.deleteStaffById(id);
	}

	@Override
	public List<Staff> selectChecked() {
		StaffExample example = new StaffExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(1);
		return staffMapper.selectByExample(example);
	}

	@Override
	public List<Staff> selectByJuniorDept(String junior) {

		StaffExample example = new StaffExample();
		Criteria criteria = example.createCriteria();
		criteria.andJuniorDeptEqualTo(junior);
		List<Staff> list = staffMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<StaffExt> selectStaffAndDetailsByJunior(String junior) {
		List<StaffExt> list = staffMapper.selectStaffAndDetails(junior);
		return list;
	}

}
