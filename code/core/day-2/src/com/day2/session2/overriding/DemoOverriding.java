package com.day2.session2.overriding;

import java.util.Scanner;

class A {
	public void print() {
		System.out.println("original method");
	}
}

class B extends A {
	@Override // annoation: is aka of meta data
	public void print() {
		System.out.println("overriden method by B");
	}
}

class C extends A {
	@Override // annoation: is aka of meta data
	public void print() {
		System.out.println("overriden method by C");
	}
}

public class DemoOverriding {

	public static void main(String[] args) {

		// due to overriding we have polymorpic behavior at run time
		// which method is going to be called is not decided by type of pointer /ref
		// but it is resolve at run time

		System.out.println("PE ur choice 1. for B 2. for C");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		A a = null;
		if (choice == 1)
			a = new B();
		if (choice == 2)
			a = new C();
		if (a != null)
			a.print();
		else
			System.out.println("wrong choice");
	}

}
