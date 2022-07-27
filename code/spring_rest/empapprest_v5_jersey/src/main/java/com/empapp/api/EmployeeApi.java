package com.empapp.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;

@Path("api")
public class EmployeeApi {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeApi(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// get all the employees
	@GET
	@Produces("application/json")
	@Path("employees")
	public List<Employee> getAll() {
		if(1==1)
			throw new NullPointerException();
		return employeeService.getAll();
	}

	// get all the employees
	//	Jaxrs
	/* @PathParam  and @QueryParam
	 * 
	 * Spring 
	 * @PathVariable		@RequestParam
	 *
	 */
	@GET
	@Produces("application/json")
	@Path("employees/{id}")
	public Employee getAnEmployee(@PathParam("id")int id) {
		return employeeService.getById(id);
	}

	
	@POST
	@Produces("application/json") 
	@Consumes("application/json")
	@Path("employees")
	public Response addAnEmployee(Employee employee) {
		// ResponseEntity vs Response
		Employee emp= employeeService.addEmployee(employee);
		return Response.status(Status.CREATED).entity(emp).build();
	}
	
	@DELETE
	@Path("employees/{id}")
	public void deleteAnEmployee(@PathParam("id")int id) {
		 employeeService.getById(id);
	}
	
	@PUT
	@Produces("application/json") 
	@Consumes("application/json")
	@Path("employees/{id}")
	public Employee updateAnEmployee(@PathParam("id")int id , Employee employee) {
		 return  employeeService.updateEmployee(id, employee.getSalary());
	}
}





