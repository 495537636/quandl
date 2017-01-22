package com.loving.quandl.base;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/base")
public class BaseController {
	
	protected static String LOGIN_PAGE_PATH = "filestore/loginPage/";
	
	/**
	 * 加载页面头部文件
	 * Title: loadHeader
	 * Description: TODO
	 * Author: lmg
	 * Date: 2017年1月19日 下午6:08:16
	 */
	@RequestMapping("/loadHeader")
	public String loadHeader(HttpServletRequest request, HttpServletResponse response, Model model) {
		String operateName = request.getParameter("operateName");
		model.addAttribute("operateName", operateName);
		return "vm/header";
	}
	
	/**
	 * 加载页面尾部文件
	 * Title: loadFooter
	 * Description: TODO
	 * Author: lmg
	 * Date: 2017年1月19日 下午6:08:29
	 */
	@RequestMapping("/loadFooter")
	public String loadFooter(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "vm/footer";
	}
	
	protected void printJsonMessage(HttpServletResponse response, String message) {
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("text/x-json;charset=UTF-8");
		try {
			message = message==null?"":String.valueOf(message);
			response.getWriter().print(message);
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
