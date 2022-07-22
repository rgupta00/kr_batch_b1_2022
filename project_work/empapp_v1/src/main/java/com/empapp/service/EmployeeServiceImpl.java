package com.empapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoJdbcImpl;
import com.empapp.exceptions.EmployeeNotFoundException;

import lombok.extern.slf4j.Slf4j;

//SL =BL= FR+ NFR
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoJdbcImpl();
	}

	@Override
	public List<Employee> getAll() {
		long start = System.nanoTime();
		List<Employee> employees = employeeDao.getAll();

		long end = System.nanoTime();

		log.info("getAll method take " + (end - start) + " ns to execute");
		return employees;
	}

	@Override
	public Employee getById(int id) {
		Employee employee = employeeDao.getById(id);
		if (employee == null) {
			throw new EmployeeNotFoundException("employee " + id + " is not found");
		}
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		return employeeDao.updateEmployee(id, salary);
	}

	@Override
	public Employee deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}

}
