package com.a.basics_oo.e;

public class EmployeePaymentProceseingSystemTester {

	public static void main(String[] args) {
		Employee employee=new FullTimeEmployee(2, "raj", 700000);
		
		EmployeePaymentProceseingSystem employeePaymentProceseingSystem=
				new EmployeePaymentProceseingSystem();
		
		employeePaymentProceseingSystem.employeePaymentProceseingSystem(employee);

		

	}

}
