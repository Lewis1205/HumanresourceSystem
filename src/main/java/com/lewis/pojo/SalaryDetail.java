package com.lewis.pojo;

public class SalaryDetail {
	private Integer sdetailId;

	private Integer standardId;

	private String item;

	private Double salary;

	public Integer getSdetailId() {
		return sdetailId;
	}

	public void setSdetailId(Integer sdetailId) {
		this.sdetailId = sdetailId;
	}

	public Integer getStandardId() {
		return standardId;
	}

	public void setStandardId(Integer standardId) {
		this.standardId = standardId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item == null ? null : item.trim();
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryDetail [sdetailId=" + sdetailId + ", standardId="
				+ standardId + ", item=" + item + ", salary=" + salary + "]";
	}

}