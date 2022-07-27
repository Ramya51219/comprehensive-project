package com.example.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeAlreadyExistsException extends RuntimeException {
	
	private String msg;

	public EmployeeAlreadyExistsException() {}
	public EmployeeAlreadyExistsException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		this.msg=msg;
	}

	public String getMsg() {
		// TODO Auto-generated method stub
		return "Employee Already Present in database";
	}




}
