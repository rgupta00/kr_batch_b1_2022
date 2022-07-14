package com.f.generics.stack;

import com.a.collections.common.Employee;

public class I_GenericsStack {
	public static void main(String[] args) {
		Stack<Employee> stack = new Stack<Employee>(Employee.class);
		Employee e1=  new Employee(1, "raj", 8000000);
		Employee e2=  new Employee(1, "ekta", 980000);
		Employee e3=  new Employee(1, "gunika", 890000);

		stack.push(e1);
		stack.push(e2);
		stack.push(e3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
		
	//	Stack<Integer> stack = new Stack<Integer>(Integer.class);
//
//		stack.push(33);
//		stack.push(3);
//		stack.push(303);
//		stack.push(93);
//		stack.push(37);
//
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());

	}
}
