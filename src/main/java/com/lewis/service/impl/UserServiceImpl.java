package com.lewis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewis.mapper.UsersMapper;
import com.lewis.pojo.Users;
import com.lewis.pojo.UsersExample;
import com.lewis.pojo.UsersExample.Criteria;
import com.lewis.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UsersMapper userMapper;

	@Override
	public void createUser(Users users) {
		// TODO Auto-generated method stub

	}

	@Override
	public Users selectByUsername(String username) {

		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Users> list = userMapper.selectByExample(example);
		if (list != null && list.size() != 0) {
			return list.get(0);
		}
		return null;
	}

}
