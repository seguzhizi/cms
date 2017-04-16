package com.paic.cms.userinfo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.paic.cms.userinfo.dto.UserInfo;
import com.paic.cms.userinfo.service.IUserInfoService;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	Logger logger = Logger.getRootLogger().getLogger(getClass());
	
	@Autowired
	private IUserInfoService userInfoService;

	@RequestMapping("/getUserListByPage.do")
	public void index2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		String str = "ssss111222444422a---";
		UserInfo userInfo = userInfoService.getUserListByPage();
		String jsonUser = JSONObject.toJSONString(userInfo);
		logger.info(jsonUser);
		writer.write(jsonUser);
		writer.flush();
		writer.close();
	}
	
	@RequestMapping("/addUser.do")
	public void addUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		String str = "ssss111222444422a---";
		System.out.println(str);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	@RequestMapping("/updateUser.do")
	public void updateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		String str = "ssss111222444422a---";
		System.out.println(str);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	@RequestMapping("/deleteUser.do")
	public void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		String str = "ssss111222444422a---";
		System.out.println(str);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
}
