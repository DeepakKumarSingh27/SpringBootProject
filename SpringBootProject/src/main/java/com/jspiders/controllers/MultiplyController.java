package com.jspiders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller

public class MultiplyController {
	@Value("${myProjectName}")
	private String appName;

	@Autowired
    Environment env;

	@RequestMapping("/multiply")

	public ModelAndView sample(HttpServletRequest req, HttpServletResponse res) {
		//		System.out.println("In am inside Controller");
		int a = Integer.parseInt(req.getParameter("A"));
		int b = Integer.parseInt(req.getParameter("B"));

		int c = a * b;
		ModelAndView mav = new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("result", c);
		System.out.println("The name of rhe project is "+appName);
		System.out.println("The name of rhe project is "+env.getProperty("myProjectName"));
		return mav;
	}
}
