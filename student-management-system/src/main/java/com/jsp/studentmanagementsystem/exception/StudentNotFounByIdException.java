package com.jsp.studentmanagementsystem.exception;

public class StudentNotFounByIdException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;

	public StudentNotFounByIdException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
