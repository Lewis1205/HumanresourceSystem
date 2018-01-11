package com.lewis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewis.mapper.DepartmentMapper;
import com.lewis.pojo.Department;
import com.lewis.pojo.DepartmentExample;
import com.lewis.pojo.DepartmentExample.Criteria;
import com.lewis.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {

	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> getAllPrinciples() {
		DepartmentExample example = new DepartmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentDeptEqualTo(0);
		List<Department> depts = departmentMapper.selectByExample(example);
		return depts;
	}

	@Override
	public List<Department> getDeptByParent(int parent) {
		DepartmentExample example = new DepartmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentDeptEqualTo(parent);
		List<Department> list = departmentMapper.selectByExample(example);
		return list;
	}

	@Override
	public Department getDeptById(Integer id) {
		Department department = departmentMapper.selectByPrimaryKey(id);
		return department;
	}

}
