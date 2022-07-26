package com.empapp.api;
import java.util.*;
// api/employees

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
@RequestMapping(path = "api")
@RestController
public class EmployeeApi {

	public EmployeeService employeeService;

	@Autowired
	public EmployeeApi(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	@GetMapping(path = "employees")
	public List<Employee> getAll(){
		return  employeeService.getAll();
	}
	
}
