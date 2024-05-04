package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By proceedToCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	private By productName = By.cssSelector("p.product-name");
	private By apply = By.className("promoBtn");
	private By placeOrder = By.xpath("//button[text()='Place Order']");
	
	
	public void proceedToCheckout() {
		driver.findElement(proceedToCheckout).click();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public boolean seeApply() {
		return driver.findElement(apply).isDisplayed();
	}
	
	public boolean seePlaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}
}
