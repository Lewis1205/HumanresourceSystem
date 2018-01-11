package com.lewis.util;

public class ResultJson {

	// 响应消息
	private String msg;
	// 响应中的数据
	private Object data;

	public ResultJson() {

	}

	public ResultJson(String msg) {
		this.msg = msg;
	}

	public ResultJson(String msg, Object data) {
		this.msg = msg;
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
