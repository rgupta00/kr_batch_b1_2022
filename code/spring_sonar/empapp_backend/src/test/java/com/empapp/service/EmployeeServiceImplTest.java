package com.empapp.service;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
//i want to do unit testing of my service layer, i dont want to talk to dao layer
//i will use fake dao layer (ie mock object)
@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

	@Mock //we want a dummy dao layer ...
	private EmployeeDao employeeDao;
	
	@InjectMocks //create a actual EmployeeServiceImpl and dont forget to inject a mock of dao layer
	private EmployeeServiceImpl employeeService;
	
	private Employee employee;
	
	@BeforeEach
	void setUp() throws Exception {
		employee=new Employee(11,"raj", 6000);
	}
	

	@DisplayName("save employee test")
	@Test
	void givenEmployeeObject_whenSaveObject_thenReturnEmployeeObject() {
		
		when(employeeDao.save(employee)).thenReturn(employee);
		
		Employee savedEmployee= employeeService.addEmployee(employee);
		
		assertThat(savedEmployee).isNotNull();
		
	}
	
	@DisplayName("get all employees")
	@Test
	void givenEmployeeList_whenGetAllEmployee_thenReturnEmployeeList() {
		
		Employee employee1=new Employee("amit", 6000);
		Employee employee2=new Employee("amit", 6000);
		
		employeeDao.save(employee1);
		employeeDao.save(employee2);
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		
		when(employeeDao.findAll()).thenReturn(employees);
		
		List<Employee> returnedList= employeeService.getAll();
		
		
		
		assertThat(returnedList).isNotNull();
		assertThat(returnedList.size()).isEqualTo(2);
		
		
	}
	
	
	
	@AfterEach
	void tearDown() throws Exception {
		employee=null;
	}

}






