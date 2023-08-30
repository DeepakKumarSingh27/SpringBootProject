package com.jspider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.jspider.Entity.UserEntity;

// way 1-
public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {
//	@Repository      // no need to add @Repository ,bcz by DEFAULT is avaible     / else u can -then u hav eto give extra affert
	//   WAY 2---
//	public interface UserEntityRepo extends CrudRepository<UserEntity, Integer>
	
	// all the abstract method will inheritance here 
	
	

}
