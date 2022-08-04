package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloConnectToGoogle {

	public static void main(String[] args) {
		// i need to configure browser driver
		// webdriver.chrome.driver
		//System.setProperty("webdriver.chrome.driver", "/home/raj/Desktop/selenium_session/drivers/chromedriver");

		//System.out.println("chromedriver is loaded");
		
		System.setProperty("webdriver.gecko.driver", "/home/raj/Desktop/selenium_session/drivers/geckodriver");
     //	System.out.println("webdriver.gecko.driver is loaded");
		
     	WebDriver driver= new FirefoxDriver();//FirefoxDriver vs ChromeDriver
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		driver.close();//close vs quit
		
		//driver.close();//close vs quit
		
		// webdriver.gecko.driver
//		System.setProperty("webdriver.gecko.driver", "/home/raj/Desktop/selenium_session/drivers/geckodriver");
//		System.out.println("webdriver.gecko.driver is loaded");
	}

}
