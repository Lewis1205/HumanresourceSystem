package com.lewis.webmodel;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SalaryModel {

	private String standardNum;
	private String standardName;
	private String standardTotal; // 薪酬总额
	private String compiler;
	private String register;
	private Date registerTime;
	private Double totalsalary;
	private List<DetailModel> items;

	public Double getTotalsalary() {
		return totalsalary;
	}

	public void setTotalsalary(Double totalsalary) {
		this.totalsalary = totalsalary;
	}

	public String getStandardNum() {
		return standardNum;
	}

	public void setStandardNum(String standardNum) {
		this.standardNum = standardNum;
	}

	public String getStandardName() {
		return standardName;
	}

	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

	public String getStandardTotal() {
		return standardTotal;
	}

	public void setStandardTotal(String standardTotal) {
		this.standardTotal = standardTotal;
	}

	public String getCompiler() {
		return compiler;
	}

	public void setCompiler(String compiler) {
		this.compiler = compiler;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	// 取日期格式
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public List<DetailModel> getItems() {
		return items;
	}

	public void setItems(List<DetailModel> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "SalaryModel [standardNum=" + standardNum + ", standardName="
				+ standardName + ", standardTotal=" + standardTotal
				+ ", compiler=" + compiler + ", register=" + register
				+ ", registerTime=" + registerTime + ", items=" + items + "]";
	}

}
