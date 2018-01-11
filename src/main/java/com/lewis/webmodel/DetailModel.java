package com.lewis.webmodel;

public class DetailModel {
	private String item;// 薪酬项名
	private Double salary;// 薪酬金额

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "DetailModel [item=" + item + ", salary=" + salary + "]";
	}

}
