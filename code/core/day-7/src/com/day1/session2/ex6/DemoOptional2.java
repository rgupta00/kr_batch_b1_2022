package com.day1.session2.ex6;

import java.util.Optional;

public class DemoOptional2 {

	public static void main(String[] args) {
		Optional<String> nameOpt=EmpApi.getEmpName(11);
	
		//System.out.println(nameOpt.orElse("name is not found"));
		System.out.println(nameOpt.orElseThrow(()-> new EmployeeNotFoundException("emp not found")));
	}
	

}
