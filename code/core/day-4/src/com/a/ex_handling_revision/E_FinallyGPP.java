package com.a.ex_handling_revision;

public class E_FinallyGPP {

	public static void main(String[] args) {
		// never ever return the value from finally block
		// ...........throws ex .......................

		try {
			myMethod();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	static int myMethod() {
		try {
			if (1 == 1)
				throw new NullPointerException();
		} finally {
			throw new ArithmeticException();
		}

	}

}
