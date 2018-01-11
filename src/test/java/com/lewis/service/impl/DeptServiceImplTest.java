package com.lewis.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lewis.pojo.Department;
import com.lewis.pojo.Staff;
import com.lewis.pojo.StaffExample;
import com.lewis.pojo.StaffExample.Criteria;
import com.lewis.pojo.StaffWithBLOBs;
import com.lewis.service.IDeptService;
import com.lewis.service.IStaffService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DeptServiceImplTest {

	@Autowired
	private IDeptService departServie;

	@Autowired
	private IStaffService staffService;

	@Test
	public void test() {
		// List<Department> list = departServie.getAllPrinciples();
		// List<Department> list = departServie.getDeptByParent(1);
		// System.out.println(list);
		StaffWithBLOBs staff = new StaffWithBLOBs();
		staff.setPrincipleDept("集团");
		staff.setSeniorDept("财务部");
		staff.setJuniorDept("财务综合室");
		String staffNum = staffService.getStaffNum(staff);
		System.out.println(staffNum);

	}

	@Test
	public void test1() {
		List<Staff> unchecked = staffService.selectUnchecked();
		System.out.println(unchecked.size());
	}

	@Test
	public void test2() {

		StaffWithBLOBs bs = staffService.selectStaffById(2);
		bs.setNum("201701020302");
		staffService.updateStaff(bs);
		// System.out.println(bs);

	}

	@Test
	public void test3() {

		StaffExample example = new StaffExample();
		Criteria criteria = example.createCriteria();
		// criteria.andPrincipleDeptEqualTo(null);
		criteria.andSeniorDeptEqualTo("技术部");
		criteria.andPosCategoryEqualTo("架构师");
		List<StaffWithBLOBs> list = staffService.selectByCondition(example);
		for (StaffWithBLOBs staffWithBLOBs : list) {
			System.out.println(staffWithBLOBs.getName());
		}
	}

	@Test
	public void test4() {
		List<Staff> list = staffService.selectChecked();
		System.out.println(list.size());
	}

}
