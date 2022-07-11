package com.day3.session2.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExceptionHandling {

	public static void main(String[] args) {

		Scanner scanner = null;
		try {
			int a, b, c;
			scanner = new Scanner(System.in);
			System.out.println("PE value of a");
			a = scanner.nextInt();

			System.out.println("PE value of b");
			b = scanner.nextInt();

			c = a / b;

			System.out.println(c);

		} catch (ArithmeticException e) {
			System.out.println("dont put deno zero");
		} catch (InputMismatchException e) {
			System.out.println("pls enter int only");
		}finally {
			scanner.close();
		}
		//every body is easy! Java 7: ARM: automcatic reso mgt: AutoClosable
		System.out.println("hello");
	}
}
