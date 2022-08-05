package testng_demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestEx2 {
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod is called");
  }

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest is called");
	}


	@Test(priority = 1, description = "test for add emp")
	public void m1() {
		System.out.println("-------------------------------");
		System.out.println("test for emp are added to db");
		System.out.println("-------------------------------");
	}


	@Test(priority = 3, description = "test for del emp")
	public void m2() {
		System.out.println("-------------------------------");
		System.out.println("test for emp delete from db");
		System.out.println("-------------------------------");
	}
	
	@Test(priority = 2, description = "test for get emp")
	public void m3() {
		System.out.println("-------------------------------");
		System.out.println("test for getting emp from db");
		System.out.println("-------------------------------");
	}
	

	@AfterTest
	public void afterTest() {
		System.out.println("after test is called");
	}

	
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod is called");
  }
	
	
	

}
