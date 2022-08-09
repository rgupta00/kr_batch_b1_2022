package com.empapp.dao;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//when i want to do testing of dao layer
@DataJpaTest
class EmployeeDaoTest {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	//Add an employee
	@Test
	void givenEmployeeObject_whenSave_thenReturnEmployeeObject() {
		//given 
		Employee employee=new Employee("amit", 6000);
		
		//when
		Employee savedEmployeeOb=  employeeDao.save(employee);
		
		//then verify
		assertThat(savedEmployeeOb.getId()).isGreaterThan(0);
		assertThat(savedEmployeeOb).isNotNull();
		
	}
	
	//get all employee
	@Test
	void givenEmployeeList_whenSaveFindAll_thenReturnEmployeeList() {
		//given 
		Employee employee1=new Employee("amit", 6000);
		Employee employee2=new Employee("amit", 6000);
		
		employeeDao.save(employee1);
		employeeDao.save(employee2);
		
		//when
		List<Employee> getEmployees=employeeDao.findAll();
		
		
		//then verify
		assertThat(getEmployees).isNotNull();
		assertThat(getEmployees.size()).isEqualTo(2);
		
	}
	
	//delete
	@Test
	void givenEmployeeObject_whenDelete_thenEmployeeDeleted() {
			//given 
			Employee employee1=new Employee("amit", 6000);
			
			employeeDao.save(employee1);
			
			
			//when
			employeeDao.delete(employee1);
			
			
			//then verify
			Optional<Employee> empOpt = employeeDao.findById(employee1.getId());
			
			assertThat(empOpt).isEmpty();

		}
	

	@AfterEach
	void tearDown() throws Exception {
		//employeeDao=null;
	}

}






