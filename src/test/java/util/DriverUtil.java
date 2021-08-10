package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		
		return driver;
	}

}
