package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;

@SpringBootApplication
public class EmpappV4Application implements CommandLineRunner {

	@Autowired
	private EmployeeDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpappV4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dao.save(new Employee("raj", 6000));
		dao.save(new Employee("ekta", 6000));
		
	}

}
