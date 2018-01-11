package com.lewis.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lewis.pojo.PosCategory;
import com.lewis.service.IDeptService;
import com.lewis.service.IPositionService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class PositionServiceImplTest {
	@Autowired
	private IPositionService posServie;
	@Test
	public void test() {
		List<PosCategory> list = posServie.getCategories();
		System.out.println(list);
	}

}
