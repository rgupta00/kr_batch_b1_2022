package com.a.excpetion_examples.user_defind;


public class StackMain {
	
	public static void main(String[] args) {
		Stack s=new Stack();
		Emp emp1=new Emp(1, "raj");
		Emp emp2=new Emp(16, "ekta");
		
		s.push(emp1);
		s.push(emp2);
		
		s.pop().print();
		s.pop().print();
		
	}

}
