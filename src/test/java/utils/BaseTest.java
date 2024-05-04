package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\application.properties");
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		String url = prop.getProperty("qaurl");
			
		if(driver == null) {
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			
			driver.get(url);
		    driver.manage().window().maximize();
		}
				
	    return driver;
	}
}
