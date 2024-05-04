package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	private WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("h4.product-name");
	private By increment = By.cssSelector("a.increment");
	private By addToCart = By.cssSelector("div.product-action button");
	private By cart = By.cssSelector("a.cart-icon");
	
	
	public void searchForShortNameLandingPage(String shortName) {
		driver.findElement(search).sendKeys(shortName);
	}
	
	public String getProductNameLandingPage() {
		return driver.findElement(productName).getText();
	}
	
	public void addThreeProducts() {
		for(int i = 0; i < 2; i++) {
			driver.findElement(increment).click();
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	
	public void seeCart() {
		driver.findElement(cart).click();
	}
	
}
