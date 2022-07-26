package com.empapp.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.empapp.dao.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public List<Employee> getAll() {
	
		return Arrays.asList(new Employee(1, "raj",	4999),new Employee(12, "ekta",	4299));
	}

}
