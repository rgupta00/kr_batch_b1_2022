package com.demo.backup.b1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.demo.Calculator;

class CalculatorTest {
	private Calculator calculator = null;

	@BeforeAll
	public static  void beforeAllMethod() {
		System.out.println("-------@BeforeAll------");
	}

	
	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("-------@BeforeEach------");
		calculator = new Calculator();
	}

	@Test
	public void addTest(TestInfo info) {
		//System.out.println(info.getTestMethod().toString());
		System.out.println("------addTest------");
		Assertions.assertEquals(23, calculator.add(20, 3));
	}

	@Test
	public void divideTest() {
		System.out.println("-------divideTest------");
		Assertions.assertEquals(5, calculator.divide(10, 2));
	}

	@Test
	public void divideWithExceptionTest() {
		System.out.println("-------divideWithExceptionTest-----");
		// Assertions.assertEquals(5, calculator.divide(10,0));

		Assertions.assertThrows(ArithmeticException.class, 
				() -> calculator.divide(10, 0), "divide by zero!!!!");

	}

	@AfterEach
	public void afterEachMethod() {
		System.out.println("-------@AfterEach------");
		calculator = null;
	}
//
	@AfterAll
	public static void afterAllMethod() {
		System.out.println("-------@AfterAll------");
	}
//	
}
