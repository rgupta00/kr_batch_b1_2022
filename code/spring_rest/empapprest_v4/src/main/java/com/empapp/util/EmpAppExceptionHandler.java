package com.empapp.util;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//as soon as some ex is thrown from rest api control should transfer here

import com.empapp.dto.ErrorInfo;
import com.empapp.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class EmpAppExceptionHandler {

	//now u need to declare ex handler 
	@ResponseStatus(code =HttpStatus.NOT_FOUND )
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ErrorInfo handle404(EmployeeNotFoundException e) {
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		errorInfo.setToContact("ukg@taskforce.com");
		errorInfo.setDetails(e.getMessage());
		return errorInfo;
	}
	
	@ResponseStatus(code =HttpStatus.INTERNAL_SERVER_ERROR )
	@ExceptionHandler(Exception.class)
	public ErrorInfo handle500(Exception e) {
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		errorInfo.setToContact("ukg@taskforce.com");
		errorInfo.setDetails("pls try after some time");
		return errorInfo;
	}
}




