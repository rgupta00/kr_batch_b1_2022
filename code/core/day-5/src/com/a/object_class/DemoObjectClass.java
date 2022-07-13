package com.a.object_class;

public class DemoObjectClass {

	public static void main(String[] args) {
		//fully qualified name of the class @ hashcode
		//com.a.object_class.Employee     @        1e81f4dc
		Employee employee=new Employee(1, "raj", 56000);
		System.out.println(employee);
		
		Employee employee2=new Employee(1, "raj", 56000);
		System.out.println(employee2);
		
		
		
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		
		//== vs equals
		if(employee.equals(employee2)) {
			System.out.println("are eq");
		}else
			System.out.println("are not eq");
		
		
		
	}
}




