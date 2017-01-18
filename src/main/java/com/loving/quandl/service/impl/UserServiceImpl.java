package com.loving.quandl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.loving.quandl.bean.Userinfo;
import com.loving.quandl.dao.UserDao;
import com.loving.quandl.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public Userinfo findUser(String username, String password) {
		return userDao.findUser(username, password);
	}

	@Override
	public boolean checkUsername(String username) {
		int count = userDao.checkUsername(username);
		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

}
