package com.loving.quandl.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.loving.quandl.bean.Userinfo;
import com.loving.quandl.service.UserService;
import com.loving.quandl.util.CipherUtil;

/**
 * 自定义shiro验证源
 * MyShiroRealm.java
 * Description: TODO
 * Author: lmg
 * Date: 2017年2月16日 下午2:57:00
 */
public class MyShiroRealm extends AuthorizingRealm {
	
	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection collection) {
		
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String username = token.getUsername();
		Userinfo userinfo = userService.findUserByLoginName(username);
		if (userinfo != null) {
			return new SimpleAuthenticationInfo(userinfo.getUsername(), CipherUtil.generatePassword(userinfo.getPassword()), getName());
		} else {
			throw new AuthenticationException();
		}
	}

}
