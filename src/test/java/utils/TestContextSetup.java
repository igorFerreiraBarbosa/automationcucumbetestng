package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String productName;
	public PageObjectManager pageObjectManager;
	public BaseTest baseTest;
	public Utils utils;
	
	public TestContextSetup() throws IOException {
		baseTest = new BaseTest();
		utils = new Utils(baseTest.WebDriverManager());
		pageObjectManager = new PageObjectManager(baseTest.WebDriverManager());
	}

}
