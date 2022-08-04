package com.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	public static WebDriver getWebDriver() {
		String driverType = null;

		try {
			Properties properties = new Properties();
			String BASE_URL = System.getProperty("user.dir");

			String FILE_URL = BASE_URL + "/src/test/resources/config/driver_info.properties";

			InputStream is = new FileInputStream(FILE_URL);

			properties.load(is);

			driverType = properties.getProperty("driver");
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		if (driverType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (driverType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (driverType.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else {
			throw new RuntimeException("no driver is found");
		}
		return driver;
	}

}
