package utils;

import org.openqa.selenium.WebDriver;

public class Utils {
	
	public WebDriver driver;
	
	public Utils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchToAnotherWindow() {
		for(String windowHandle : driver.getWindowHandles()) {
	    	if(!getOriginalWindow().contentEquals(windowHandle)) {
	    		driver.switchTo().window(windowHandle);
	    	}
	    }
	}
	
	public String getOriginalWindow() {
		String originalWindow = driver.getWindowHandle();
		return originalWindow;
	}
}
