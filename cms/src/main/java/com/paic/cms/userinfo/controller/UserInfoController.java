package com.paic.cms.userinfo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paic.cms.userinfo.service.IUserInfoService;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	@Autowired
	private IUserInfoService userInfoService;

	@RequestMapping("/getUserListByPage.do")
	public void index2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		String str = "ssss111222444422a---";
		userInfoService.getUserListByPage();
		System.out.println(str);

		System.out.println("this is cms");

		System.out.println("this is cms222");
		
		writer.write(str);
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
