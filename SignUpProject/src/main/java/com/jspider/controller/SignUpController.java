package com.jspider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.Entity.UserEntity;
import com.jspider.serivce.UserService;

@RestController

public class SignUpController {
	@Autowired
	private UserEntity user;



	@RequestMapping ( method = RequestMethod.GET,  value="signup")
	//	@ResponseBody
	public String signUp() {
		return "index";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/web/getuser") /// we have to call in browser or post main 
	public ResponseEntity<UserEntity> fetchUserDetails()    /// -- write this   http://localhost:8080/web/getuser
	{
		user.setUserId(101);
		user.setUserName("Rajeev");
		user.setUserPassword("r123");
		user.setUserConfirmPassword("r123");

		return ResponseEntity.ok(user);
	}
	
	@Autowired
	UserService service;

	@RequestMapping(method = RequestMethod.GET, value = "/web/save")
	public ResponseEntity<UserEntity> saveUser()
	{
		ResponseEntity<UserEntity> persistUser=service.persistUser();
		return persistUser;
	}




}
