package com.lewis.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"classpath:SqlMapConfig.xml" })
public class DepartmentMapperTest {

	@Autowired
	private DepartmentMapper departmentMapper;

	@Test
	public void test() {
		String num = departmentMapper.selectDeptNumByName("价格成本室");
		System.out.println(num);
	}

}
