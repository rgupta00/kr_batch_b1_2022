package com.empapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;

//@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class EmployeeApi {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeApi(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping(path = "employees")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	
	@GetMapping(path = "employees/{id}")
	public Employee getAnEmployee(@PathVariable(name = "id") int id) {
		return employeeService.getById(id);
	}

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping(path = "employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping(path = "employees/{id}")
	public Employee updateEmployee(@PathVariable(name = "id") int id, @RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@DeleteMapping(path = "employees/{id}")
	public void deleteAnEmployee(@PathVariable(name = "id") int id) {
		 employeeService.deleteEmployee(id);
	}
}
