package com.empapp.controller;
import java.util.*;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		
//		List<Employee> employees=employeeService.getAll();
//		
//		employees.forEach(e-> System.out.println(e));
		
//		Employee employee=new Employee("foo", 70900);
//		Employee empAdded= employeeService.addEmployee(employee);
		
		//System.out.println(empAdded);
		
		//employeeService.updateEmployee(3, 99900);
		//System.out.println("--------------------");
		
		employeeService.deleteEmployee(3);
		
	}

}
