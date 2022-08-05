package testng_demo;

import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalTest {

//	
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//  }
//  
//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }

//  
//  @BeforeMethod
//  public void beforeMethod() {
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//  }

//	 @BeforeClass
//	  public void beforeClass() {
//	  }
//
//	  @AfterClass
//	  public void afterClass() {
//	  }

	@BeforeTest
	public void beforeTest() {
		cal=new Cal();
	}

	private Cal cal = null;

	@Test
	public void addTest() {
		AssertJUnit.assertEquals(4, cal.add(3, 1));
	}

	
	@Test//(enabled = false)
	public void mulTest() {
		System.out.println("Im in skip exception");
		throw new SkipException("Skipping this exception");
	}
	
	@AfterTest
	public void afterTest() {
		cal=null;
	}

}
