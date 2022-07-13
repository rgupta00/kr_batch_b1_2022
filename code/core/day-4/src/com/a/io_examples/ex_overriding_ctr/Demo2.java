package com.a.io_examples.ex_overriding_ctr;
class X{
	void foo() {
		System.out.println("foo method of class X");
	}
}
class Y extends X{
	void foo() {
		System.out.println("foo method of class Y overriden");
	}
}

public class Demo2 {
	
	public static void main(String[] args) {
		
		X x=new Y();
		
	}

}
