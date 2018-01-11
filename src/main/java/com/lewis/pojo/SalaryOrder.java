package com.lewis.pojo;

public class SalaryOrder {
	private Integer orderId;

	private String orderNum;

	private String principleDept;

	private String seniorDept;

	private String juniorDept;

	private Integer people;

	private Double baseTotal;

	private Boolean status;

	@Override
	public String toString() {
		return "SalaryOrder [orderId=" + orderId + ", orderNum=" + orderNum
				+ ", principleDept=" + principleDept + ", seniorDept="
				+ seniorDept + ", juniorDept=" + juniorDept + ", people="
				+ people + ", baseTotal=" + baseTotal + ", status=" + status
				+ "]";
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum == null ? null : orderNum.trim();
	}

	public String getPrincipleDept() {
		return principleDept;
	}

	public void setPrincipleDept(String principleDept) {
		this.principleDept = principleDept == null ? null : principleDept
				.trim();
	}

	public String getSeniorDept() {
		return seniorDept;
	}

	public void setSeniorDept(String seniorDept) {
		this.seniorDept = seniorDept == null ? null : seniorDept.trim();
	}

	public String getJuniorDept() {
		return juniorDept;
	}

	public void setJuniorDept(String juniorDept) {
		this.juniorDept = juniorDept == null ? null : juniorDept.trim();
	}

	public Integer getPeople() {
		return people;
	}

	public void setPeople(Integer people) {
		this.people = people;
	}

	public Double getBaseTotal() {
		return baseTotal;
	}

	public void setBaseTotal(Double baseTotal) {
		this.baseTotal = baseTotal;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}