package com.lewis.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lewis.pojo.SalaryOrder;
import com.lewis.pojo.StaffExt;
import com.lewis.service.ISalaryOrderService;
import com.lewis.service.IStaffService;
import com.lewis.webmodel.OrderQuery;

@Controller
@RequestMapping("/order")
public class SalaryOrderController {

	@Autowired
	private ISalaryOrderService salaryOrderService;

	@Autowired
	private IStaffService staffService;

	@ResponseBody
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	private List<SalaryOrder> getAllOrders(Model model) {
		List<SalaryOrder> orders = salaryOrderService.selectOrders();
		// model.addAttribute(orders);
		return orders;
	}

	@RequestMapping(value = "{orderId}/staffAndDetail")
	public String getStaffAndDetails(@PathVariable("orderId") Integer orderId,
			Model model, HttpServletResponse response) {

		try {
			SalaryOrder salaryOrder = salaryOrderService
					.selectOderById(orderId);
			String juniorDept = salaryOrder.getJuniorDept();
			List<StaffExt> staffDetails = staffService
					.selectStaffAndDetailsByJunior(juniorDept);
			// System.out.println(staffDetails);
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(staffDetails);
			model.addAttribute("staffDetails", json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "salaryDetail";
	}
	
	@RequestMapping(value = "{orderId}/querystaffAndDetail")
	public String queryStaffAndDetails(@PathVariable("orderId") Integer orderId,
			Model model, HttpServletResponse response) {

		try {
			SalaryOrder salaryOrder = salaryOrderService
					.selectOderById(orderId);
			String juniorDept = salaryOrder.getJuniorDept();
			List<StaffExt> staffDetails = staffService
					.selectStaffAndDetailsByJunior(juniorDept);
			// System.out.println(staffDetails);
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(staffDetails);
			model.addAttribute("staffDetails", json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "querySalaryDetail";
	}

	@ResponseBody
	@RequestMapping(value = "/query", method = RequestMethod.POST)
	public List<SalaryOrder> selectByConditions(OrderQuery query) {
		List<SalaryOrder> list = salaryOrderService
				.selectOrdersByCondition(query);

		return list;
	}
}
