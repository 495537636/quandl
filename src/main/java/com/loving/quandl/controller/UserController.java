package com.loving.quandl.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.alibaba.fastjson.JSONObject;
import com.loving.quandl.base.BaseController;
import com.loving.quandl.bean.Userinfo;
import com.loving.quandl.service.UserService;
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
		Userinfo userinfo = userService.findUser(username, password);
		JSONObject json = new JSONObject();
		if (null != userinfo) {
			//登录成功
		} else {
			json.put("message", "用户名或密码错误");
		}
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
	public String test(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		return "test";
	}
	
}
