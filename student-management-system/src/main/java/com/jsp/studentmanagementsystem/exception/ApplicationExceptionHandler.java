package com.jsp.studentmanagementsystem.exception;

import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jsp.studentmanagementsystem.util.ErrorStructure;


@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler
 public ResponseEntity<ErrorStructure> studentNotFoundById(StudentNotFounByIdException ex) {
		ErrorStructure structure = new ErrorStructure();
		structure.setStatue(HttpStatus.NOT_FOUND.value());
		structure.setMessage(ex.getMessage());
		structure.setRootcause("Student is not present with the required id");
		return new ResponseEntity<ErrorStructure>(structure,HttpStatus.NOT_FOUND);
	}
	protected ResponseEntity<Object> handlemethodArgumentNotvalid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status,WebRequest request)
	{
		
		List<ObjectError> allErrors = ex.getAllErrors();
		Map<String, String> errors = new HashMap<String, String>();
		for(ObjectError error: allErrors) {
			FieldError fieldError = (FieldError) error;
		String message=	fieldError.getDefaultMessage();
		String field = fieldError.getField();
		errors.put(field,message);
		}
		return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
	}
	
 }
