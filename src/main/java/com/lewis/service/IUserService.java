package com.lewis.service;

import com.lewis.pojo.Users;

public interface IUserService {

	public void createUser(Users users);
	
	public Users selectByUsername(String username);
}
