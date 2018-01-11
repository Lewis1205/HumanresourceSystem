package com.lewis.pojo;

import java.util.List;

public class StaffExt extends Staff {


	
	private Double bonus;// 奖励
	private Double deduction;// 扣除
	private List<SalaryDetail> details;

	// private String standard_id;
	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Double getDeduction() {
		return deduction;
	}

	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}

	public List<SalaryDetail> getDetails() {
		return details;
	}

	public void setDetails(List<SalaryDetail> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "StaffExt [bonus=" + bonus + ", deduction=" + deduction
				+ ", details=" + details + "]";
	}

}
