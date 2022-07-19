package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class CalculatorTest {
	
	private Calculator calculator = null;

	@BeforeEach
	public void beforeEachMethod() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {

		Assertions.assertEquals(23, calculator.add(20, 3));
	}

	@Test
	public void divideTest() {
		Assertions.assertEquals(5, calculator.divide(10, 2));
	}

	@Test
	public void divideWithExceptionTest() {
		Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "divide by zero!!!!");

	}

	@AfterEach
	public void afterEachMethod() {
		calculator = null;
	}

}
