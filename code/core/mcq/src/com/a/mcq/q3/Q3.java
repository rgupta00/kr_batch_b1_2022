package com.a.mcq.q3;
class X{
	
}
class Y extends X{
	
}
class A {
	public X foo() {
		System.out.println("foo of A");
		return new X();
	}
}

class B extends  A {
	//java 1.5: co-varient return type
	@Override
	public  Y foo() {
		System.out.println("foo of B");
		return new Y();
	}
}

public class Q3 {

	public static void main(String[] args) {
		B a=new B();
		a.foo();
	}
}
