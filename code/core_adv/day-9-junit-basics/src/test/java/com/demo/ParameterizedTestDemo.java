package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedTestDemo {
	
	private Calculator calculator = null;

	@BeforeEach
	public void beforeEachMethod() {
		calculator = new Calculator();
	}
	
//	@ParameterizedTest
//	@DisplayName(value = "ParameterizedTest test")
//	@CsvSource({"1,2,3","3,4,7","3,4,7"})
//	public void parameterizedTestDemo(int n1, int n2, int result) {
//		Assertions.assertEquals(result, calculator.add(n1,n2));
//	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
	public void parameterizedTestDemo(int n1, int n2, int result) {
		Assertions.assertEquals(result, calculator.add(n1,n2));
	}

}





