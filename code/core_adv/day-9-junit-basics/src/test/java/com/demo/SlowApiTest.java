package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SlowApiTest {

	private SlowApi slowApi;
	
	@BeforeEach
	void setUp() throws Exception {
		slowApi=new SlowApi();
	}
	

	@Test
	void cityNameTest() {
		//aka performance test : 2sec ...>fail
		Assertions.assertTimeout(Duration.ofSeconds(2), ()-> slowApi.cityName(333));
	}
	

	@AfterEach
	void tearDown() throws Exception {
		slowApi=null;
	}

}
