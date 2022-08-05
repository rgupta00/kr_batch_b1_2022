package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest {
	
	@Test(dataProvider = "testdata")
	public void testLogin(String username, String password) {
		
		driver.findElement(By.id(loc.getProperty("username"))).sendKeys(username);
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("loginbtn"))).click();
		
		driver.manage().window().maximize();
		//sleep(1000);
		driver.close();
		
	}

	@Test
	@DataProvider(name = "testdata")
	public Object[][] testData(){
		return new Object[][] {
			{"Admin","admin123"},
			{"Admin","admin123"},
			{"Admin","admin123"}
			
		};
	}
	
	
	private static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {}
	}

}
