package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_HelloWorldConnectingAndLoggingById {
	
	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver=DriverFactory.getWebDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().window().maximize();
		sleep(1000);
		driver.close();
		
	}

	private static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {}
	}

}
