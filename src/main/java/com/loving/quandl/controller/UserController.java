package com.loving.quandl.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.fastjson.JSONObject;
import com.loving.quandl.base.BaseController;
import com.loving.quandl.bean.Userinfo;
import com.loving.quandl.service.UserService;
import com.loving.quandl.util.CipherUtil;
import com.loving.quandl.util.GenerateIDUtil;
import com.loving.quandl.util.OSSUtil;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@Resource
	private UserService userService;

	@RequestMapping("/toLogin")
	public String toLogin(Model model) {
		List<String> urlList = OSSUtil.getObjectsUrlByDir(LOGIN_PAGE_PATH);
		model.addAttribute("urlList", urlList);
		return "user/login";
	}
	
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.err.println("username=" + username + ";password=" + password);
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Subject subject = SecurityUtils.getSubject();
		JSONObject json = new JSONObject();
		try {
			subject.login(token);
		} catch (Exception e) {
			json.put("message", "用户名或密码错误");
		}
//		Userinfo userinfo = userService.findUser(username, password);
//		
//		if (null != userinfo) {
//			//登录成功
//		} else {
//			
//		}
		this.printJsonMessage(response, json.toString());
	}
	
	/**
	 * 验证用户名是否存在
	 */
	@RequestMapping("/checkUsername")
	public void checkUsername(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		JSONObject json = new JSONObject();
		String message = null;
		if (null == username || "".equals(username)) {
			message = "用户名不能为空";
		} else {
			boolean isExist = userService.checkUsername(username);
			if (isExist) {
				message = "用户名已存在";
			}
		}
		json.put("message", message);
		this.printJsonMessage(response, json.toString());
	}
	
	@RequestMapping("/register")
	public void test(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		Userinfo userinfo = new Userinfo();
		userinfo.setUserid(GenerateIDUtil.generateID());
		userinfo.setUsername(username);
		userinfo.setPassword(CipherUtil.generatePassword(password));
		userinfo.setEmail(email);
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = dateFormat.format(new Date());*/
        userinfo.setCreatetime(new Date());
        userinfo.setUserflag(new Integer(1));
		boolean flag = userService.registerUser(userinfo);
		JSONObject json = new JSONObject();
		boolean registerFlag = false;
		String message = null;
		if(flag){
			//注册成功
			registerFlag = true;
			message = "注册成功";
		}else{
			//注册失败
			registerFlag = false;
			message = "注册失败";
		}
		json.put("flag", registerFlag);
		json.put("message", message);
		this.printJsonMessage(response, json.toString());
	}
	
}
