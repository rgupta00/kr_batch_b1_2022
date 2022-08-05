package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver = null;
	public static Properties prop = null;
	public static Properties loc = null;

	@BeforeMethod
	public void setUp() throws IOException {
		if (driver == null) {
			String driverType = null;
			String url = null;

			try {
				prop = new Properties();
				String BASE_URL = System.getProperty("user.dir");
				// src/test/resources/configfiles/driver_info.properties
				String FILE_URL = BASE_URL + "/src/test/resources/configfiles/driver_info.properties";

				loc = new Properties();

				String LOC_URL = System.getProperty("user.dir") + "/src/test/resources/configfiles/locators.properties";

				InputStream is = new FileInputStream(FILE_URL);

				InputStream isLoc = new FileInputStream(LOC_URL);

				prop.load(is);

				loc.load(isLoc);
				// now onward loc have infor about all the locators

				driverType = prop.getProperty("driver");

				url = prop.getProperty("url");

			} catch (IOException ex) {
				ex.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			if (driverType.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(url);
			} else if (driverType.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.get(url);
			} else if (driverType.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				driver.get(url);
			} else {
				throw new RuntimeException("no driver is found");
			}

		}
	}

	@AfterMethod
	public void tearDown() throws IOException {
		driver = null;
	}

}
