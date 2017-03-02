package com.loving.quandl.mapper;

import com.loving.quandl.bean.Userinfo;
import com.loving.quandl.bean.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserinfoMapper {
    int countByExample(UserinfoExample example);

    int deleteByExample(UserinfoExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    List<Userinfo> selectByExample(UserinfoExample example);

    Userinfo selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    
    /**
	 * 根据用户名、密码查找用户信息
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
	 * 验证用户名是否存在
	 * @param username
	 * @return
	 */
	int checkUsername(String username);
	
	/**
	 * 用户注册
	 * @param userinfo
	 * @return
	 */
	void registerUser(Userinfo userinfo);
}