package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
//i want to check is my dao connection is working ok or not
@SpringBootApplication
public class EmpappRepoApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpappRepoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//run some code... sb give u gurantee to run this as soon as it started...
		//it is very simple way to init some data
		
		employeeDao.save(new Employee("raj", 4500));
		employeeDao.save(new Employee("ekta", 5500));
		System.out.println("----------added--------");
		
	}

}
