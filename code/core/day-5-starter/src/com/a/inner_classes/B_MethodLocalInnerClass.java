package com.a.inner_classes;

class A {
	void foo() {
		int i=6;	//effective final
		class B {
			void fooB() {
				System.out.println("fooB method ..."+ i);
				//i++;//?
			}
		}
		
		B b=new B();
	   b.fooB();
	}
}

public class B_MethodLocalInnerClass {

	public static void main(String[] args) {

	}

}
