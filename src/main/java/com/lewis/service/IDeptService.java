package com.lewis.service;

import java.util.List;

import com.lewis.pojo.Department;

public interface IDeptService {

	/**
	 * 获取所有一级机构
	 * @return
	 */
	public List<Department> getAllPrinciples();
	
	/**
	 * 根据父机构id获取子机构
	 * @return
	 */
	public List<Department> getDeptByParent(int parent);
	
	public Department getDeptById(Integer id);
}
