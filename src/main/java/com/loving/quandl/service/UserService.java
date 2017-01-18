package com.loving.quandl.service;

import com.loving.quandl.bean.Userinfo;

public interface UserService {

	/**
	 * 查询用户信息
	 * @param username
	 * @param password
	 * @return
	 */
	Userinfo findUser(String username, String password);
	
	/**
	 * 验证用户是否存在
	 * @param username
	 * @return
	 */
	boolean checkUsername(String username);
	
}
