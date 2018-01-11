package com.lewis.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lewis.pojo.Department;
import com.lewis.pojo.Staff;
import com.lewis.pojo.StaffExample;
import com.lewis.pojo.StaffExt;
import com.lewis.pojo.StaffExample.Criteria;
import com.lewis.pojo.StaffQuery;
import com.lewis.pojo.StaffWithBLOBs;
import com.lewis.service.IDeptService;
import com.lewis.service.IStaffService;
import com.lewis.util.ResultJson;

@RequestMapping("/staff")
@Controller
public class StaffController {

	@Autowired
	private IStaffService staffService;
	@Autowired
	private IDeptService deptService;

	@ResponseBody
	@RequestMapping("/add")
	public ResultJson registerStaff(StaffWithBLOBs staff) {
		staffService.addStaff(staff);
		ResultJson json = new ResultJson("success");
		return json;
	}

	@ResponseBody
	@RequestMapping("/unchecked")
	public List<Staff> getUncheckedStaff() {
		List<Staff> uncheckedList = staffService.selectUnchecked();

		return uncheckedList;
	}

	@RequestMapping("/{staffId}/staffInfo")
	public String getStaffIn(@PathVariable("staffId") Integer staffId,
			Model model) {
		StaffWithBLOBs staff = staffService.selectStaffById(staffId);
		model.addAttribute("staff", staff);
		return "staffInfo";
	}

	@ResponseBody
	@RequestMapping(value = "/searchStaff", method = RequestMethod.POST)
	public List<StaffWithBLOBs> getStaffByCondition(StaffQuery staffQuery,
			Model model) {

		StaffExample example = new StaffExample();
		Criteria criteria = example.createCriteria();
		if (!staffQuery.getPrincipleDept().equals("")) {
			criteria.andPrincipleDeptEqualTo(staffQuery.getPrincipleDept());
		}
		if (!staffQuery.getSeniorDept().equals("")) {
			criteria.andSeniorDeptEqualTo(staffQuery.getSeniorDept());
		}
		if (!staffQuery.getJuniorDept().equals("")) {
			criteria.andJuniorDeptEqualTo(staffQuery.getJuniorDept());
		}
		if (staffQuery.getPosCategory() != null
				&& !staffQuery.getPosCategory().equals("")) {
			criteria.andPosCategoryEqualTo(staffQuery.getPosCategory());
		}
		if (staffQuery.getPosName() != null
				&& !staffQuery.getPosName().equals("")) {
			criteria.andPosNameEqualTo(staffQuery.getPosName());
		}
		if (staffQuery.getFromRegisterTime() != null
				&& staffQuery.getToRegisterTime() != null) {
			criteria.andRegisterTimeBetween(staffQuery.getFromRegisterTime(),
					staffQuery.getToRegisterTime());
		}

		List<StaffWithBLOBs> list = staffService.selectByCondition(example);
		// response.setContentType("text/html");
		System.out.println(list);
		// model.addAttribute("staffs", list);
		return list;
	}

	@ResponseBody
	@RequestMapping("{staffId}/delete")
	public ResultJson deleteStaffById(@PathVariable("staffId") Integer staffId) {

		try {
			staffService.deleteStaffById(staffId);
			return new ResultJson("success");
		} catch (Exception e) {
			return new ResultJson("error", e);
		}

	}

	@RequiresPermissions(value="StManager")
	@ResponseBody
	@RequestMapping(value = "{staffId}/update", method = RequestMethod.POST)
	public ResultJson updateStaff(@PathVariable("staffId") Integer staffId,
			StaffWithBLOBs staff) {
		System.out.println(staffId);
		try {
			staffService.updateStaff(staff);
			return new ResultJson("success");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultJson("error", e);
		}

	}

	@ResponseBody
	@RequestMapping("/checked")
	public List<Staff> getCheckedStaff() {
		List<Staff> list = staffService.selectChecked();
		return list;
	}

	
}
