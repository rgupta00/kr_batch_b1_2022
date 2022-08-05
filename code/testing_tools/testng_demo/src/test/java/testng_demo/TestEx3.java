package testng_demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestEx3 {


  private Cal cal = null;

  @BeforeMethod
  public void beforeMethod() {
	  cal=new Cal();
  }
  
  @Test(dataProvider = "calDataProvider")
  public void testAddWithDataProviders(int n1, int n2, int result) {
	  System.out.println(n1+" "+ n2+" "+result+" done");
	  	Assert.assertEquals(result, cal.add(n1, n2));
  }
  
  @DataProvider
  public Object[][] calDataProvider() {
    return new Object[][] {
      new Object[] { 1, 2,3 },
      new Object[] { 2,3,5 },
      new Object[] { 20,30,50 }
    };
  }
  
  @AfterMethod
  public void afterMethod() {
	 cal=null;
  }
	
}
