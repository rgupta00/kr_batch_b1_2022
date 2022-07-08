package com.day2.session2;

class A {
	private int a;

	public A(int a) {
		this.a = a;
	}

	public void print() {
		System.out.println("a: " + a);
	}
}
//inhance provide code resu...
class B extends A {
	private int b;

	B(int a, int b) {
		super(a);
		this.b = b;
	}
	//Overriding
	public void print() {
		System.out.println("b: " + b);
		super.print();
	}
}


public class DemoInheritance {

	public static void main(String[] args) {

		B b=new B(44,77);
		
		b.print();
		
	}

}
