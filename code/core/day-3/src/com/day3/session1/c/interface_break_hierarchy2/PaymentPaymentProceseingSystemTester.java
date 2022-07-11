package com.day3.session1.c.interface_break_hierarchy2;

public class PaymentPaymentProceseingSystemTester {

	public static void main(String[] args) {
		//Employee employee=new FullTimeEmployee(2, "raj", 700000);
		
		Payable employee=new PartTimeEmployee(2, "ravi", 7000,10,20);
		
		Payable invoice=new Invoice("raj", 30000, 30);
		
		
		PaymentPaymentProceseingSystem
		.employeePaymentProceseingSystem(employee);

		

	}

}
