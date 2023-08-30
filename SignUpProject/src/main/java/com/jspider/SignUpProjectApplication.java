package com.jspider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages = {"com.jspider.controller","com.jspider.entity"})
//@SpringBootApplication
public class SignUpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignUpProjectApplication.class, args);
	}

}
