package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {

	private Calculator calculator;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}

	
	
	
	//@EnabledOnOs(OS.LINUX)
	//@EnabledOnJre(JRE.JAVA_11)
	//@Disabled
	@DisplayName("divide with zero must fail")
	@Test
	void divideWithArthmaticTest() {
		//Assertions.assertEquals(6, calculator.divide(12, 0));
		Assertions.assertThrows(ArithmeticException.class, ()-> calculator.divide(12, 0),"divide by zero");
	}
	
	@DisplayName("divide test")
	@Test
	void divideTest() {
		Assertions.assertEquals(6, calculator.divide(12, 2));
	}
	
	@DisplayName("add test")
	@Test
	void addTest() {
		Assertions.assertEquals(4, calculator.add(2, 2));
	}
	
	@DisplayName("mutple method of Assertions")
	@Test
	void addTestAssertion() {
		//Assertions.assertNotNull();
		//Assertions.assertEquals(expected, actual);
		//Assertions.assertNull(actual);
		//Assertions.assertNotNull(actual);
	}


	@DisplayName("add test multiple time")
	@Test
	void addTestMultiple_time() {
		Assertions.assertAll
		(
			()-> Assertions.assertEquals(4, calculator.add(2, 2))
			,()-> Assertions.assertEquals(40, calculator.add(20, 20))
			
		);
	}

	
	
	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

}
