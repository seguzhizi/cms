package com.paic.cms.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public ModelAndView index(@RequestParam(value="username") String username){
    	String ss = "ssss1111";
    	System.out.println(ss);
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("username",username);
    	mav.setViewName("business");
        return mav;
    }
    

    @RequestMapping("/index2")
    public void index2(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	PrintWriter writer = response.getWriter();
    	String str = "ssss111222444422a---";
    	System.out.println(str);
    	writer.write(str);
    	writer.flush();
    	writer.close();
    }
    
}