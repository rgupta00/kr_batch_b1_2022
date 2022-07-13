package com.a.mcq.q2;
//static method dont support overriding " shadowing"
class A {
	int i=55;
	public  void foo() {
		System.out.println("foo of A");
	}
}

class B extends  A {
	int i=555;
	public  void foo() {
		System.out.println("foo of B"+ super.i);
	}
}

public class Q2 {

	public static void main(String[] args) {
		B a=new B();
		a.foo();
	}
}
