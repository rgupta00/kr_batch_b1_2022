package com.empapp.providers;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.empapp.dto.ErrorInfo;
import com.empapp.exception.EmployeeNotFoundException;
@Provider
public class GenericExHandler implements ExceptionMapper<Exception>{

	@Override
	public Response toResponse(Exception exception) {
		System.out.println("------------------------------------------------------");
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setStatus(Status.INTERNAL_SERVER_ERROR.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		errorInfo.setDetails("pls try after some time");
		errorInfo.setToContact("ukg@info.com");
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorInfo).build();
	}

}
