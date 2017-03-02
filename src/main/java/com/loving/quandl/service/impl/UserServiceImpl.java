package com.loving.quandl.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.loving.quandl.bean.Userinfo;
import com.loving.quandl.mapper.UserinfoMapper;
import com.loving.quandl.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserinfoMapper userinfoMapper;

	@Override
	public Userinfo findUser(String username, String password) {
		return userinfoMapper.findUser(username, password);
	}

	@Override
	public boolean checkUsername(String username) {
		int count = userinfoMapper.checkUsername(username);
		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean registerUser(Userinfo userinfo) {
		boolean registerFlag = false;
		try {
			userinfoMapper.registerUser(userinfo);
			registerFlag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerFlag;
	}

	@Override
	public Userinfo findUserByLoginName(String username) {
		return userinfoMapper.findUserByLoginName(username);
	}

}
