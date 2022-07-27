package com.empapp.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.findAll();
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		Employee empToUpdate = getById(id);
		empToUpdate.setSalary(salary);
		employeeDao.save(empToUpdate);// REMEBER : FOR UPDATE AND ADD SAME METHOD : save()
		return empToUpdate;
	}

	@Override
	public Employee getById(int id) {
		Employee emp = employeeDao.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("emp with id " + id + " is not found"));
		return emp;
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee empToDelete = getById(id);
		employeeDao.delete(empToDelete);
		return empToDelete;
	}

	@Override
	public List<Employee> getByName(String name) {
		return employeeDao.findByName(name);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;

	}

}
