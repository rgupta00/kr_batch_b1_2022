package com.empapp.api;
// api/employees
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
@RequestMapping(path = "api")

@RestController// @Controller+@ResponseBody
public class EmployeeApi {

	public EmployeeService employeeService;

	@Autowired
	public EmployeeApi(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	//parser: java<--> json jakson
	@GetMapping(path = "employees")
	public List<Employee> getAll(){
//		if(1==1)
//			throw new NullPointerException();
//		
		return  employeeService.getAll();
	}
	//http://localhost:8090/empapp/api/employees/7
	@GetMapping(path = "employees/{id}")
	public Employee getAnEmployee(@PathVariable(name = "id")  int id){
		return  employeeService.getById(id);
	}
	//from postman i will pass json of employee object --> java objet
	//how to tell spring rest to do so @RequestBody
	
	//post : i have to return 1. data + 2. status code
	// i have to ask spring boot to send 2 things wrappend into a object ie object is called 
	//"ResponseEntity" it is bag : data +  status code
	
	@PostMapping(path = "employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody  Employee employee) {
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.addEmployee(employee));
	}
	
//	@PostMapping(path = "employees")
//	public Employee addEmployee(@RequestBody  Employee employee) {
//		return employeeService.addEmployee(employee);
//	}
	//put mapping
	@PutMapping(path = "employees/{id}")
	public Employee updateEmployee(@PathVariable(name = "id") int id,  @RequestBody  Employee employee) {
		return employeeService.addEmployee(employee);
	}
//	@DeleteMapping(path = "employees/{id}")
//	public Employee deleteAnEmployee(@PathVariable(name = "id")  int id){
//		return  employeeService.deleteEmployee(id);
//	}
	
	@DeleteMapping(path = "employees/{id}")
	public ResponseEntity<Void> deleteAnEmployee(@PathVariable(name = "id")  int id){
		  employeeService.deleteEmployee(id);
		  return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}









