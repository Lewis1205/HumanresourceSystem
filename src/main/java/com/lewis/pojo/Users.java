package com.lewis.pojo;

public class Users {
	private Integer userId;

	private String username;

	private String password;

	private String priviledge;

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username
				+ ", password=" + password + ", priviledge=" + priviledge + "]";
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getPriviledge() {
		return priviledge;
	}

	public void setPriviledge(String priviledge) {
		this.priviledge = priviledge == null ? null : priviledge.trim();
	}
}