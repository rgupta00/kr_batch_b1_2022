package com.day1.session1.ex0;

//diamnod prob with interface is possible

interface X {
	default void foo() {
		System.out.println("foo method of X interface");
	}
}

interface Y {
	default void foo() {
		System.out.println("foo method of Y interface");
	}
}

class C implements X, Y {

	public void foo() {
		
		X.super.foo();
		Y.super.foo();
		System.out.println("foo method of Y interface");
	}
}

public class C_DiamanodProblem {

	public static void main(String[] args) {

		C c=new C();
		c.foo();
	}

}





