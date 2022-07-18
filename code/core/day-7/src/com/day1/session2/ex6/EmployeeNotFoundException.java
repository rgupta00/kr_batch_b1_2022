package com.day1.session2.ex6;

public class EmployeeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 4193477057467687620L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
