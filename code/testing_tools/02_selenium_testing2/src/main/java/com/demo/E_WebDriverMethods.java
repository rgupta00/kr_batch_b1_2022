package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_WebDriverMethods {
	
	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver=DriverFactory.getWebDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Options manage = driver.manage();
		//manage.
//		String url= driver.getCurrentUrl();
//		System.out.println(url);
		
//		String title= driver.getTitle();
//		System.out.println(title);

//		String getpageSource= driver.getPageSource();
//		System.out.println(getpageSource);

		Navigation navigate = driver.navigate();
		
		navigate.back();
		
		driver.close();
		
	}

	private static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {}
	}

}
