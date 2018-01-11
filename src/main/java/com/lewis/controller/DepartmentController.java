package com.lewis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lewis.pojo.Department;
import com.lewis.service.IDeptService;

@RequestMapping("/dept")
@Controller
public class DepartmentController {

	@Autowired
	private IDeptService deptService;

	@ResponseBody
	@RequestMapping(value = "/principles", method = RequestMethod.GET)
	public List<Department> getPrinciples() {
		return deptService.getAllPrinciples();
	}

	@ResponseBody
	@RequestMapping(value = "/childDept/{parentId}", method = RequestMethod.GET)
	public List<Department> getDeptByParentId(@PathVariable("parentId") Integer parentId) {
		return deptService.getDeptByParent(parentId);
	}
}
