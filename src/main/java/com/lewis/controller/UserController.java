package com.lewis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lewis.pojo.Users;

@RequestMapping("/user")
@Controller
public class UserController {

	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser(Users user) {
		
		
		return "home";
	}

}
