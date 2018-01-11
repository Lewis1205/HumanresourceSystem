package com.lewis.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lewis.pojo.Users;
import com.lewis.service.IUserService;
import com.lewis.util.ResultJson;

@Controller
public class LoginController {

	@Autowired
	private IUserService userService;

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public
	 * ResultJson toHome(Users user, HttpServletResponse response, Model model)
	 * {
	 * 
	 * Users dbUser = userService.selectByUsername(user.getUsername()); if
	 * (dbUser != null) { if (dbUser.getPassword().equals(user.getPassword())) {
	 * // 登陆成功 Cookie cookie = new Cookie("user",
	 * dbUser.getUsername()+":"+dbUser.getPriviledge());
	 * response.addCookie(cookie); return new ResultJson("success", "home"); }
	 * model.addAttribute("error", "密码错误！"); } model.addAttribute("error",
	 * "用户不存在或密码错误"); return new ResultJson("error", "login");
	 * 
	 * }
	 */

	@RequestMapping("/")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Users user, Model model, HttpServletResponse response) {
		Users dbUser = userService.selectByUsername(user.getUsername());
		if (dbUser != null) {
			if (dbUser.getPassword().equals(user.getPassword())) {

				//获取当前用户对象
				Subject subject = SecurityUtils.getSubject();
				//构造密码令牌
				UsernamePasswordToken token = new UsernamePasswordToken(
						dbUser.getUsername(), dbUser.getPassword());

				subject.login(token);
				// 登陆成功
				Cookie cookie = new Cookie("user", dbUser.getUsername() + ":"
						+ dbUser.getPriviledge());
				response.addCookie(cookie);
				return "home";
			}
			model.addAttribute("error", "密码错误！");
			return "login";
		}
		model.addAttribute("error", "用户不存在！");
		return "login";
	}
}
