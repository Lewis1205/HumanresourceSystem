package com.lewis.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StaffQuery {

	private String principleDept;

	private String seniorDept;

	private String juniorDept;

	private String posCategory;

	private String posName;

	private Date fromRegisterTime;

	private Date toRegisterTime;

	@Override
	public String toString() {
		return "StaffQuery [principleDept=" + principleDept + ", seniorDept="
				+ seniorDept + ", juniorDept=" + juniorDept + ", posCategory="
				+ posCategory + ", posName=" + posName + ", fromRegisterTime="
				+ fromRegisterTime + ", toRegisterTime=" + toRegisterTime + "]";
	}

	public Date getFromRegisterTime() {
		return fromRegisterTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") //取日期格式
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setFromRegisterTime(Date fromRegisterTime) {
		this.fromRegisterTime = fromRegisterTime;
	}

	public Date getToRegisterTime() {
		return toRegisterTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") //取日期格式
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setToRegisterTime(Date toRegisterTime) {
		this.toRegisterTime = toRegisterTime;
	}

	public String getPrincipleDept() {
		return principleDept;
	}

	public void setPrincipleDept(String principleDept) {
		this.principleDept = principleDept;
	}

	public String getSeniorDept() {
		return seniorDept;
	}

	public void setSeniorDept(String seniorDept) {
		this.seniorDept = seniorDept;
	}

	public String getJuniorDept() {
		return juniorDept;
	}

	public void setJuniorDept(String juniorDept) {
		this.juniorDept = juniorDept;
	}

	public String getPosCategory() {
		return posCategory;
	}

	public void setPosCategory(String posCategory) {
		this.posCategory = posCategory;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

}
