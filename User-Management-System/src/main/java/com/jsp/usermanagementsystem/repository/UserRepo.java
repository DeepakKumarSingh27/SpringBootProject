package com.jsp.usermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.usermanagementsystem.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
