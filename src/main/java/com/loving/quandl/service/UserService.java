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
	 * 根据用户名查询用户
	 * Title: findUserByLoginName
	 * Description: TODO
	 * Author: lmg
	 * Date: 2017年2月16日 下午3:06:17
	 */
	Userinfo findUserByLoginName(String username);
	
	/**
	 * 验证用户是否存在
	 * @param username
	 * @return
	 */
	boolean checkUsername(String username);
	
	/**
	 * 用户注册
	 * @param userinfo
	 * @return
	 */
	boolean registerUser(Userinfo userinfo);
	
}
