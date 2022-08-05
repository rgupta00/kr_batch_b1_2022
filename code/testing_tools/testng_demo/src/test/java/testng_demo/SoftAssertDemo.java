package testng_demo;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	private Cal cal = null;

	@BeforeMethod
	public void beforeMethod() {
		cal = new Cal();
	}

	@Test
	public void addTest() {
		SoftAssert softAssert=new SoftAssert();
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		softAssert.assertEquals(4, cal.add(3, 3));
		System.out.println("********************");
		softAssert.assertEquals(4, cal.add(3, 1));
		System.out.println("-------------------");
		softAssert.assertAll();
		
	}

	@AfterTest
	public void afterTest() {
		cal = null;
	}

}






