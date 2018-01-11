package com.lewis.service.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.lewis.mapper.SalaryQueryMapper;
import com.lewis.mapper.SalaryStandardMapper;
import com.lewis.pojo.SalaryDetail;
import com.lewis.pojo.SalaryOrder;
import com.lewis.pojo.SalaryStandard;
import com.lewis.service.ISalaryOrderService;
import com.lewis.service.ISalaryService;
import com.lewis.webmodel.SalaryQuery;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class SalaryServiceImplTest {

	@Autowired
	private ISalaryService salaryService;

	@Autowired
	private SalaryStandardMapper ssMapper;

	@Autowired
	private SalaryQueryMapper sqMapper;

	@Autowired
	private ISalaryOrderService soservice;
	
	@Test
	public void test() {
		List<SalaryStandard> list = salaryService.getSalaryStandards();
		System.out.println(list);
	}

	@Test
	public void test1() {
		List<SalaryDetail> list = salaryService.getDetailsById(1);

		System.out.println(list);
	}

	@Test
	public void test2() {

		SalaryStandard standard = new SalaryStandard();
		standard.setStatus(false);
		standard.setName("前端工程师");
		standard.setRegister("admin");
		standard.setRegisterTime(new Date());
		standard.setCompiler("姜丹尼尔");
		standard.setNum("10008");

		salaryService.addStandard(standard);
	}

	@Test
	public void test3() {
		SalaryDetail detail = new SalaryDetail();
		detail.setItem("基本工资");
		detail.setSalary(6000.0);
		detail.setStandardId(3);
		ArrayList<SalaryDetail> list = new ArrayList<SalaryDetail>();
		list.add(detail);
		salaryService.addDetail(list);

	}

	@Test
	public void test4() {
		SalaryStandard standard = new SalaryStandard();
		standard.setCompiler("wannaone");
		standard.setName("量化分析师");
		standard.setNum("10000");
		standard.setRegister("李四");
		standard.setRegisterTime(new Date());
		ssMapper.insert(standard);
		Integer id = standard.getStandardId();
		System.out.println(id);

	}

	@Test
	public void test5() {
		SalaryQuery query = new SalaryQuery();
		query.setSalaryNum("1512463004205");
		List<SalaryStandard> list = salaryService.queryByConditions(query);
		System.out.println(list);

	}

	@Test
	public void test6() {
		SalaryQuery query = new SalaryQuery();
		// query.setSalaryNum("1512463004205");
		query.setKeyword("张三");

		Date from = new Date();
		from.setYear(117);
		from.setMonth(11);
		from.setDate(3);
		String fromDate = from.toLocaleString();
		Date to = new Date();
		to.setYear(117);
		to.setMonth(11);
		to.setDate(6);
		String toDate = to.toLocaleString();

		query.setFromRegisterTime(from);
		query.setToRegisterTime(to);
		List<SalaryStandard> list = sqMapper.selectByConditions(query);
		System.out.println(list);

	}

	@Test
	public void test7() {

		Date from = new Date();
		from.setYear(117);
		from.setMonth(11);
		from.setDate(3);
		String fromDate = from.toLocaleString();
		System.out.println(fromDate);
		Date to = new Date();
		to.setYear(117);
		to.setMonth(11);
		to.setDate(6);
		String toDate = to.toLocaleString();
		System.out.println(toDate);
	}

	@Test
	public void test8() {
		SalaryStandard salaryStandard = salaryService.getStandardById(11);
		System.out.println(salaryStandard);
		List<SalaryDetail> list = salaryService.getDetailsById(11);
		System.out.println(list.size());
	}

	@Test
	public void test9() {
		SalaryQuery query = new SalaryQuery();
		List<SalaryStandard> list = salaryService.queryByConditions(query);
		System.out.println(list.size());
	}

	

	@Test
	public void test10() {
		SalaryOrder salaryOrder = soservice.selectOderById(2);
		System.out.println(salaryOrder);
	}
}
