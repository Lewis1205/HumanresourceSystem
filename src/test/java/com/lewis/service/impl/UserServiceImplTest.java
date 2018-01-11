package com.lewis.service.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lewis.mapper.SalaryOrderMapper;
import com.lewis.mapper.SalaryRecordMapper;
import com.lewis.mapper.StaffMapper;
import com.lewis.pojo.SalaryDetail;
import com.lewis.pojo.SalaryOrder;
import com.lewis.pojo.SalaryRecord;
import com.lewis.pojo.SalaryRecordExt;
import com.lewis.pojo.StaffExt;
import com.lewis.pojo.Users;
import com.lewis.service.ISalaryRecordService;
import com.lewis.service.IUserService;
import com.lewis.webmodel.OrderQuery;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class UserServiceImplTest {

	@Autowired
	private StaffMapper staffMapper;
	@Autowired
	private IUserService userService;

	@Autowired
	private ISalaryRecordService srService;
	@Autowired
	private SalaryOrderMapper soMapper;

	@Test
	public void test() {
		// Users user = new Users();
		// user.setUsername("第用户22222");
		// user.setPassword("123456");
		// user.setPriviledge("manager" + "");
		// userService.createUser(user);

	}

	@Test
	public void test1() {

		List<SalaryOrder> list = staffMapper.groupByJuniorDept();
		long timeMillis = System.currentTimeMillis();

		for (int i = 0; i < list.size(); i++) {
			SalaryOrder salaryOrder = list.get(i);
			salaryOrder.setStatus(false);
			salaryOrder.setOrderNum(timeMillis + 10 * i + "");
			soMapper.insert(salaryOrder);
		}
	}

	@Test
	public void test2() {
		List<StaffExt> list = staffMapper.selectStaffAndDetails("后台技术部");
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String string = objectMapper.writeValueAsString(list);
			System.out.println(string);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// for (StaffExt staffExt : list) {
		// List<SalaryDetail> details = staffExt.getDetails();
		// // System.out.println(details);
		// // System.out.println("=====");
		// System.out.println(staffExt);
		// //System.out.println(staffExt.getStandardId());
		// }
	}

	@Test
	public void test5() throws JsonProcessingException {
		List<SalaryRecordExt> list = srService.getUnCheckedRecords();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(list);
		System.out.println(json);
	}

	@Test
	public void test6() {
		OrderQuery query = new OrderQuery();
		query.setKeyword("财务部");
		List<SalaryOrder> list = soMapper.selectByConditions(query);
		System.out.println(list);
	}

}
