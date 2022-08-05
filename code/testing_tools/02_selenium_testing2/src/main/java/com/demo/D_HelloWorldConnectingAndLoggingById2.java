package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_HelloWorldConnectingAndLoggingById2 {
	
	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver=DriverFactory.getWebDriver();
		
		driver.get("https://www.saucedemo.com/");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//abst path 															vs  relative path
		///html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input			
		
		//		//*[@id="user-name"]
		
		//		//input[@name='user-name']
		/*
		 * 
		 Xpath=//input[@type='text']				
		Xpath=	//label[@id='message23']
		Xpath=	//input[@value='RESET']
		Xpath=//*[@class='barone']
		Xpath=//a[@href='http://demo.guru99.com/']
		Xpath= //img[@src='//guru99.com/images/home/java.png']
		
		 */
		//		//input[starts-with(@name ,"pass")]
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		// //input[contains(@name ,"password")]
		// //input[contains(@name ,'password')]
		//driver.findElement(By.xpath("//input[contains(@name ,'password')]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[starts-with(@name ,'pass')]")).sendKeys("secret_sauce");

		//driver.findElement(By.id("login-button")).click();
		////*[@type='submit' and @name='login-button']
		
		driver.findElement(By.xpath("//*[@type='submit' and @name='login-button']")).click();
		
		driver.manage().window().maximize();
		
		sleep(1000);
	     Navigation navigate = driver.navigate();
		
		navigate.back();
		
		sleep(1000);
		driver.close();
		
	}

	private static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {}
	}

}
