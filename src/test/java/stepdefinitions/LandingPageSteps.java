package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import pageobjects.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageSteps {
	TestContextSetup textContextSetup;
	PageObjectManager pageObjectManager;
	LandingPage landingPage;
	
	public LandingPageSteps(TestContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
		landingPage = textContextSetup.pageObjectManager.getLandingPage();
	}
	
	@Given("user is on greenKart landing page")
	public void user_is_on_green_kart_landing_page() {
		
	}
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		//landingPage = textContextSetup.pageObjectManager.getLandingPage();
		
		landingPage.searchForShortNameLandingPage(shortName);
	    Thread.sleep(3000);
	    textContextSetup.productName = landingPage.getProductNameLandingPage().split("-")[0].trim();
	    System.out.println(textContextSetup.productName);
	}
	
	@When("user searched with {string} and order three units of this product")
	public void user_searched_with_and_order_three_units_of_this_product(String shortName) {
	    //landingPage = textContextSetup.pageObjectManager.getLandingPage();
	    landingPage.searchForShortNameLandingPage(shortName);
	    textContextSetup.productName = landingPage.getProductNameLandingPage().split("-")[0].trim();
	    System.out.println(textContextSetup.productName);
	    landingPage.addThreeProducts();
	    landingPage.addToCart();
	    landingPage.seeCart();
	}
	
}
