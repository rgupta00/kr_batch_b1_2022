package com.a.io_examples.ex_overriding_ctr;
class A{
	void foo() {
		System.out.println("foo method of class A");
	}
}
class B extends A{
	void foo() {
		System.out.println("foo method of class B overriden");
	}
}

public class Demo {
	
	public static void main(String[] args) {
		
		A a=new B();
		a.foo();
	}

}
