package com.a.object_class.clone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoClone {

	
	public static void main(String[] args) throws CloneNotSupportedException, ParseException {
		SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");
		
		Date date=fmt.parse("11/11/1977");
		
		Employee employee=new Employee(1, "raj", 56000, date);
		
		//Employee employee2=new Employee(employee);
		
		Employee employee2=(Employee) employee.clone();
		
		System.out.println(employee);
		System.out.println(employee2);
		
		employee.getDate().setDate(16);
		employee.setName("rajesh");
		
		System.out.println("------------------------");
		System.out.println(employee);
		System.out.println(employee2);
		
	}
}
