package com.jsp.usermanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.usermanagementsystem.util.ErrorStructure;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorStructure> userNotFoundById(UserNotFoundByIdException ex) {
		ErrorStructure structure = new ErrorStructure();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMessage(ex.getMessage());
		structure.setRootCause("No User Found with the requested Id!!");
		return new ResponseEntity<ErrorStructure>(structure, HttpStatus.NOT_FOUND);
	}

}
