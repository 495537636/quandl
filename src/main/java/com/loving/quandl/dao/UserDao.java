package com.loving.quandl.dao;

import org.springframework.stereotype.Repository;
import com.loving.quandl.bean.Userinfo;

@Repository
public interface UserDao {
	
	/**
	 * 根据用户名、密码查找用户信息
	 * @param username
	 * @param password
	 * @return
	 */
	Userinfo findUser(String username, String password);
	
	/**
	 * 验证用户名是否存在
	 * @param username
	 * @return
	 */
	int checkUsername(String username);

}
