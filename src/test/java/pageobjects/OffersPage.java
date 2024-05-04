package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	private WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By offersLink = By.cssSelector("[href*=offers]");
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.xpath("//td[1]");
	
	public void clickOffersLink() {
		driver.findElement(offersLink).click();
	}
	
	public void searchForShortNameOffersPage(String shortName) {
		driver.findElement(search).sendKeys(shortName);
	}
	
	public String getProductNameOffersPage() {
		return driver.findElement(productName).getText();
	}
}
