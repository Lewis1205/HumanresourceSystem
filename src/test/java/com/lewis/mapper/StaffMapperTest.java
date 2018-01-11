package com.lewis.mapper;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lewis.pojo.Staff;
import com.lewis.pojo.StaffExample;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:SqlMapConfig.xml"})
public class StaffMapperTest {

	@Autowired
	private StaffMapper staffMapper;
	
	@Test
	public void test() {
//		StaffExample example=new StaffExample();
//		List<Staff> list = staffMapper.selectByExample(example);
//		System.out.println(list);
		StaffExample example = new StaffExample();
		int i = staffMapper.countByExample(example);
		System.out.println(i);
		Calendar calendar=Calendar.getInstance();
		int weekYear = calendar.getWeekYear();
		System.out.println(weekYear);
	}

}
