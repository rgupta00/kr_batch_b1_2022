package com.empapp.providers;

import java.time.LocalDateTime;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.empapp.dto.ErrorInfo;
import com.empapp.exception.EmployeeNotFoundException;
@Provider
public class EmpNotFoundExHandler implements ExceptionMapper<EmployeeNotFoundException>{

	@Override
	public Response toResponse(EmployeeNotFoundException exception) {
		System.out.println("------------------------------------------------------");
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setStatus(Status.NOT_FOUND.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		errorInfo.setDetails(exception.getMessage());
		errorInfo.setToContact("ukg@info.com");
		
		return Response.status(Status.NOT_FOUND).entity(errorInfo).build();
	}

}
