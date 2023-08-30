package com.jspider.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jspider.Entity.UserEntity;
import com.jspider.repository.UserEntityRepo;

@Service
public class UserService {
	@Autowired 
	UserEntityRepo repo;

	@Autowired
	UserEntity user;

	public ResponseEntity<UserEntity> persistUser()
	{
		user.setUserId(1);
		user.setUserName("Roshan");
		user.setUserPassword("123");
		user.setUserConfirmPassword("123");
		repo.save(user);
		
		return ResponseEntity.ok(user);
	}



}
