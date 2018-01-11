package com.lewis.webmodel;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SalaryQuery {

	private String salaryNum;
	private String keyword;
	private Date fromRegisterTime;
	private Date toRegisterTime;

	public String getSalaryNum() {
		return salaryNum;
	}

	public void setSalaryNum(String salaryNum) {
		this.salaryNum = salaryNum;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Date getFromRegisterTime() {
		return fromRegisterTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	// 取日期格式
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	// 存日期的格式
	public void setFromRegisterTime(Date fromRegisterTime) {
		this.fromRegisterTime = fromRegisterTime;
	}

	public Date getToRegisterTime() {
		return toRegisterTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	// 取日期格式
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	// 存日期的格式
	public void setToRegisterTime(Date toRegisterTime) {
		this.toRegisterTime = toRegisterTime;
	}

	@Override
	public String toString() {
		return "SalaryQuery [salaryNum=" + salaryNum + ", keyword=" + keyword
				+ ", fromRegisterTime=" + fromRegisterTime
				+ ", toRegisterTime=" + toRegisterTime + "]";
	}

}
