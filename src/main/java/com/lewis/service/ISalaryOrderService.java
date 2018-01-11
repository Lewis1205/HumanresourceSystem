package com.lewis.service;

import java.util.List;

import com.lewis.pojo.SalaryOrder;
import com.lewis.webmodel.OrderQuery;

public interface ISalaryOrderService {
	public List<SalaryOrder> selectOrders();
	
	public void createOrders(SalaryOrder order);
	
	public SalaryOrder selectOderById(Integer orderId);
	
	public List<SalaryOrder> selectOrdersByCondition(OrderQuery orderQuery);
}
