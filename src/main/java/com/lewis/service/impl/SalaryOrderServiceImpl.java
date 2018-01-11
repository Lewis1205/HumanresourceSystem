package com.lewis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewis.mapper.SalaryOrderMapper;
import com.lewis.mapper.StaffMapper;
import com.lewis.pojo.SalaryOrder;
import com.lewis.pojo.SalaryOrderExample;
import com.lewis.service.ISalaryOrderService;
import com.lewis.webmodel.OrderQuery;

@Service
public class SalaryOrderServiceImpl implements ISalaryOrderService {

	@Autowired
	private SalaryOrderMapper soMapper;

	@Autowired
	private StaffMapper staffMapper;

	@Override
	public List<SalaryOrder> selectOrders() {

		SalaryOrderExample example = new SalaryOrderExample();
		List<SalaryOrder> list = soMapper.selectByExample(example);
		return list;
	}

	@Override
	public void createOrders(SalaryOrder order) {

	}

	@Override
	public SalaryOrder selectOderById(Integer orderId) {
		SalaryOrder salaryOrder = soMapper.selectByPrimaryKey(orderId);
		return salaryOrder;
	}

	@Override
	public List<SalaryOrder> selectOrdersByCondition(OrderQuery orderQuery) {

		List<SalaryOrder> list = soMapper.selectByConditions(orderQuery);
		return list;
	}

}
