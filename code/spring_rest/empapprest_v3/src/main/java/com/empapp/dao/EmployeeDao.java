package com.empapp.dao;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	//u can declare a method like that spring data : define it for you :)
	public List<Employee> findByName(String name);
	
	//@Query("")
	
}
