package com.loving.quandl.base;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping("/loadHeader")
	public String loadHeader(HttpServletRequest request, HttpServletResponse response, Model model) {
		String operateName = request.getParameter("operateName");
		model.addAttribute("operateName", operateName);
		return "vm/header";
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
