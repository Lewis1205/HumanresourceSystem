package com.lewis.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewis.pojo.Users;
import com.lewis.service.IUserService;


public class MyRealm extends AuthorizingRealm {

	@Autowired
	private IUserService userService;

	/**
	 * 授权方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		// 从数据库获取权限
		Users user = (Users) principals.getPrimaryPrincipal(); // 登录的用户对象
		String priviledge = user.getPriviledge();
		System.out.println(priviledge);
		if (priviledge.equals("staff")) {
			info.addStringPermission("staff");// 授予staff权限
		}
		if (priviledge.equals("StManager")) {
			info.addStringPermission("staff");
			info.addStringPermission("StManager");// 授予人事经理权限
		}
		if (priviledge.equals("salary")) {
			info.addStringPermission("salary");// 授予薪酬专员权限
		}
		if (priviledge.equals("SaManager")) {
			info.addStringPermission("salary");
			info.addStringPermission("SaManager"); // 授予薪酬经理权限
		}
		return info;
	}

	/**
	 * 认证方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		System.out.println("认证方法。。。");
		UsernamePasswordToken uptoken = (UsernamePasswordToken) token;//
		String username = uptoken.getUsername();// 从令牌中获取username
		Users dbUser = userService.selectByUsername(username);
		if (dbUser == null) {
			return null;
		} else {
			String password = dbUser.getPassword();
			// 创建简单认证信息对象
			/***
			 * 参数一：签名，程序可以在任意位置获取当前放入的对象 参数二：从数据库中查询出的密码 参数三：当前realm的名称
			 */
			SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
					dbUser, password, this.getClass().getSimpleName());
			return info;
		}

	}

}
