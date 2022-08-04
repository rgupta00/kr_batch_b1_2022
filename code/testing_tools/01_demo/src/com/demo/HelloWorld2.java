package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/raj/Desktop/selenium_session/drivers/chromedriver");
		//i want to use chrome brower
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.manage().window().maximize();
	
		
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		driver.close();
		
	}
}
