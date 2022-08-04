package com.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/home/raj/Desktop/selenium_session/drivers/chromedriver");
		//i want to use chrome brower
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		driver.close();
		
	}
}
