package com.jsp.usermanagementsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jsp.usermanagementsystem.dto.UserRequest;
import com.jsp.usermanagementsystem.dto.UserResponse;
import com.jsp.usermanagementsystem.entity.User;
import com.jsp.usermanagementsystem.util.ResponseStructure;

public interface UserService {
	
	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(UserRequest userRequest);
	
	public User updateUser(User user, int userId);
	
	public User deleteUser(int userId);
	
	public User findUserById(int userId);
	
	public List<User> findAllUsers();

}
