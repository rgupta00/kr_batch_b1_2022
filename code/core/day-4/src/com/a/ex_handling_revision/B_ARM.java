package com.a.ex_handling_revision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class B_ARM {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int a, b, c;

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
		}
		System.out.println("hello");
	}
}
