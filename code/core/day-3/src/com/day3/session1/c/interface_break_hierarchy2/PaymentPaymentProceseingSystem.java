package com.day3.session1.c.interface_break_hierarchy2;

public class PaymentPaymentProceseingSystem {

	// old code
//	public static void employeePaymentProceseingSystem(Employee employee) {
//		System.out.println("payment processing system");
//		System.out.println(employee.getPay());
//		//db processing ...
//	}
	
	//new code
	public static void employeePaymentProceseingSystem(Payable payable) {
		System.out.println("payment processing system");
		System.out.println(payable.getPay());
		System.out.println(payable.toString());
	}
}
