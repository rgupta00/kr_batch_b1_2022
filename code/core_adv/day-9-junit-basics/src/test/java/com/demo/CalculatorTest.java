package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class CalculatorTest {

	private Calculator calculator = null;

	@BeforeEach
	public void beforeEachMethod() {
		calculator = new Calculator();
	}

	@Test
	public void dummyToTellAboutAllChoicesInAssertions() {
		// Assertions.assertFalse(Login.checkUser("Raj", "abc"));
		// Assertions.assertTrue(Login.checkUser("Raj", "abc"));
		// Assertions.assertNotNull(actual);
	}

	// @Disabled
	@DisplayName(value = "adding 3 times")
	@Test
	public void addTest3Times() {
		Assertions.assertAll(() -> Assertions.assertEquals(5, calculator.add(2, 3)),
				() -> Assertions.assertEquals(50, calculator.add(20, 30)),
				() -> Assertions.assertEquals(15, calculator.add(5, 10)));
	}

	// i wann to run this test case only if os is linux
	// i wann to run this test case only if jdk version is 1.8
//	@EnabledOnOs(OS.WINDOWS)
	// @EnabledOnJre(JRE.JAVA_13)
	@Order(value = 1)
	@Test
	@DisplayName(value = "adding test")
	public void addTest() {
		System.out.println("----------1------------");
		Assertions.assertEquals(23, calculator.add(20, 3));
	}

//	@Test
//	public void addTest(TestInfo info) {
//		//assert ?
//		System.out.println(info.getTestMethod().toString());
//		Assertions.assertEquals(23, calculator.add(20, 3));
//	}

	@DisplayName(value = "divide test")
	@Order(value = 2)
	@Test
	public void divideTest() {
		System.out.println("----------2-----------");
		Assertions.assertEquals(5, calculator.divide(10, 2));
	}

	@DisplayName(value = "divide test with exceptions")
	@Order(value = 3)
	@Test
	public void divideWithExceptionTest() {
		System.out.println("----------3-----------");
		Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "divide by zero happen");
	}

	@AfterEach
	public void afterEachMethod() {
		calculator = null;
	}

}
