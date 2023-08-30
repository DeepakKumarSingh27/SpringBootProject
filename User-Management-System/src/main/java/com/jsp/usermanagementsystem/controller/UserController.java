package com.jsp.usermanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.usermanagementsystem.dto.UserRequest;
import com.jsp.usermanagementsystem.dto.UserResponse;
import com.jsp.usermanagementsystem.entity.User;
import com.jsp.usermanagementsystem.service.UserService;
import com.jsp.usermanagementsystem.util.ResponseStructure;

@RestController // Controller + ResponseBody
// ResponseBody - pointing towards the Body of the Response Object (httpServletResponse)
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/users")
	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(@RequestBody UserRequest userRequest) {
		return service.saveUser(userRequest);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user, @RequestParam int userId) {
		return service.updateUser(user, userId);
	}

}
