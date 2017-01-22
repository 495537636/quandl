package com.loving.quandl.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.loving.quandl.base.BaseController;
import com.loving.quandl.util.GenerateIDUtil;
import com.loving.quandl.util.OSSUtil;

/**
 * UploadController.java
 * Description: TODO
 * Author: lmg
 * Date: 2017年1月20日 上午11:11:22
 */
@Controller
@RequestMapping("/upload")
public class UploadController extends BaseController {
	
	/**
	 * 上传登录页面的广告图片
	 * Title: loginPage
	 * Description: TODO
	 * Author: lmg
	 * Date: 2017年1月20日 上午11:18:25
	 */
	@RequestMapping("/loginPage")
	public void loginPage(
			@RequestParam(value = "uploadFile", required = true) MultipartFile file,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			String fileName = file.getOriginalFilename();
			String fileType = fileName.substring(fileName.lastIndexOf("."));
			InputStream inputStream = file.getInputStream();
			String uuid = GenerateIDUtil.generateID();
			String key = LOGIN_PAGE_PATH + uuid + fileType;
			boolean flag = OSSUtil.putObjectByStream(key, inputStream);
			JSONObject json = new JSONObject();
			String message = null;
			if (flag) {
				message = "上传成功";
			} else {
				message = "上传失败";
			}
			json.put("message", message);
			this.printJsonMessage(response, json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
