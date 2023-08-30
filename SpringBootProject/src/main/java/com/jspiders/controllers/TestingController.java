package com.jspiders.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestingController {
	@RequestMapping("testing")
public void sampleMethod() {
	System.out.println("Testinh!!!!!");
	//return "index.jsp";
}
}
