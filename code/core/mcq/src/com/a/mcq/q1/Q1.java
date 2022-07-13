package com.a.mcq.q1;

interface A{
	int i=44;

	 void foo();
}

abstract class B implements A{
}

final class C extends B{
	public void foo() {
		System.out.println("foo method is overriden");
	}
}
   
public class Q1 {

	public static void main(String[] args) {
		
	}
}
