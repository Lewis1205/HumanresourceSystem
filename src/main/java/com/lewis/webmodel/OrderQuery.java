package com.lewis.webmodel;

public class OrderQuery {
	private String orderNum;
	private String keyword;

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "OrderQuery [orderNum=" + orderNum + ", keyword=" + keyword
				+ "]";
	}	
}
