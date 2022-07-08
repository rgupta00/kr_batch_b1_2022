package com.day2.session2;

class Cal {
//	public double add (int a, double b) {
//		return a+b;
//	}
//	
//	public double add (double a, int b) {
//		return a+b;
//	}

	public int add(int a, int b) {
		System.out.println("public int add (int a, int b)");
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// public int add (Object ...a) ?

	// java 5: varaible arg method ...
	public int add(int... a) {
		System.out.println("public int add (int ...a)");
		int sum = 0;
		for (int temp : a) {
			sum += temp;
		}
		return sum;
	}
}

public class DemoOverloading {

	public static void main(String[] args) {
		Cal cal = new Cal();

		int sum = cal.add(44, 44,66,77);

		System.out.println(sum);
	}

}
