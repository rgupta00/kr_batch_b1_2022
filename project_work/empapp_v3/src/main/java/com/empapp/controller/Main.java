package com.empapp.controller;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empapp.config.AppConfig;
import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		EmployeeService employeeService=ctx.getBean("employeeService", EmployeeService.class);
		
		
		
		List<Employee> employees=employeeService.getAll();
//		
		employees.forEach(e-> System.out.println(e));
		
//		Employee employee=new Employee("foo", 70900);
//		Employee empAdded= employeeService.addEmployee(employee);
		
		//System.out.println(empAdded);
		
		//employeeService.updateEmployee(3, 99900);
		//System.out.println("--------------------");
		
//		employeeService.deleteEmployee(3);
		
	}

}
