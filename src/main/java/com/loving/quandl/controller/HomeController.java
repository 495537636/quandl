package com.loving.quandl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.loving.quandl.base.BaseController;

@Controller
@RequestMapping("home")
public class HomeController extends BaseController {

	@RequestMapping("/toHomePage")
	public String toHomePage(HttpServletRequest request, HttpServletResponse response) {
		return "home/home";
	}
	
}
