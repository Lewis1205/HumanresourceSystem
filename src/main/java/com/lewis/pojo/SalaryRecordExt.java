package com.lewis.pojo;

import java.util.List;

public class SalaryRecordExt extends SalaryRecord {

	private String staffName;
	private String staffNum;
	private List<SalaryDetail> details;

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffNum() {
		return staffNum;
	}

	public void setStaffNum(String staffNum) {
		this.staffNum = staffNum;
	}

	public List<SalaryDetail> getDetails() {
		return details;
	}

	public void setDetails(List<SalaryDetail> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "StandardRecordExt [staffName=" + staffName + ", staffNum="
				+ staffNum + ", details=" + details + "]";
	}

	
	
}
