package com.lewis.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lewis.pojo.SalaryDetail;
import com.lewis.pojo.SalaryStandard;
import com.lewis.service.ISalaryService;
import com.lewis.util.ResultJson;
import com.lewis.webmodel.DetailModel;
import com.lewis.webmodel.SalaryModel;
import com.lewis.webmodel.SalaryQuery;

@RequestMapping("/salary")
@Controller
public class SalaryController {

	@Autowired
	private ISalaryService salaryService;

	@ResponseBody
	@RequestMapping("/standards")
	public List<SalaryStandard> getSalaryStandrds() {
		List<SalaryStandard> list = salaryService.getSalaryStandards();
		return list;
	}

	@ResponseBody
	@RequestMapping(value = "/standard/add", method = RequestMethod.POST)
	public ResultJson addStandard(@RequestBody SalaryModel model) {
		try {
			// 封装standard对象
			SalaryStandard standard = new SalaryStandard();
			standard.setCompiler(model.getCompiler());
			standard.setName(model.getStandardName());
			String num = System.currentTimeMillis() + "";
			standard.setNum(num);
			standard.setRegister(model.getRegister());
			standard.setRegisterTime(model.getRegisterTime());
			standard.setTotalsalary(model.getTotalsalary());
			standard.setStatus(false);
			salaryService.addStandard(standard);
			// 薪酬标准的id
			Integer sId = standard.getStandardId();

			List<DetailModel> items = model.getItems();
			ArrayList<SalaryDetail> list = new ArrayList<SalaryDetail>();
			for (DetailModel detail : items) {
				SalaryDetail salaryDetail = new SalaryDetail();
				salaryDetail.setItem(detail.getItem());
				salaryDetail.setSalary(detail.getSalary());
				salaryDetail.setStandardId(sId);
				list.add(salaryDetail);
			}			
			//添加保险
			List<SalaryDetail> insurance = addInsurance(model.getTotalsalary(),sId);
			list.addAll(insurance);			
			salaryService.addDetail(list);
			ResultJson json = new ResultJson("success");
			return json;

		} catch (Exception e) {
			e.printStackTrace();
			return new ResultJson("error", e);
		}

	}

	private List<SalaryDetail> addInsurance(Double baseSalary, Integer sId) {
		List<SalaryDetail> list = new ArrayList<SalaryDetail>();
		//养老保险
		SalaryDetail pension = new SalaryDetail();
		pension.setItem("养老保险");
		pension.setSalary(baseSalary*0.08);
		pension.setStandardId(sId);
		list.add(pension);
		//医疗保险
		SalaryDetail medical = new SalaryDetail();
		medical.setItem("医疗保险");
		medical.setSalary(baseSalary*0.02+3);
		medical.setStandardId(sId);
		list.add(medical);
		
		//失业保险
		SalaryDetail unemploy=new SalaryDetail();
		unemploy.setItem("失业保险");
		unemploy.setSalary(baseSalary*0.005);
		unemploy.setStandardId(sId);
		list.add(unemploy);
		
		//住房公积金
		SalaryDetail house=new SalaryDetail();
		house.setItem("住房公积金");
		house.setSalary(baseSalary*0.08);
		house.setStandardId(sId);
		list.add(house);
		
		return list;
		
		
	}

	@ResponseBody
	@RequestMapping(value = "/query", method = RequestMethod.POST)
	public List<SalaryStandard> queryStandards(SalaryQuery salaryQuery) {
		List<SalaryStandard> list = salaryService
				.queryByConditions(salaryQuery);
		System.out.println(list);
		return list;
	}

	@RequestMapping(value = "/{standardId}/salaryInfo")
	public String toSalaryInfo(@PathVariable("standardId") Integer standardId,
			Model model) {
		SalaryStandard standard = salaryService.getStandardById(standardId);
		List<SalaryDetail> details = salaryService.getDetailsById(standardId);
		model.addAttribute("standard", standard);
		model.addAttribute("details", details);
		return "standardInfo";
	}

	@ResponseBody
	@RequestMapping(value = "/standard/check", method = RequestMethod.POST)
	public ResultJson checkSalary(SalaryStandard salaryStandard) {
		try {
			salaryService.checkStandard(salaryStandard);
			return new ResultJson("success");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultJson("error", e);
		}

	}
}
