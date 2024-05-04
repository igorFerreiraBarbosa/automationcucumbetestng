package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageobjects.OffersPage;
import utils.TestContextSetup;
public class OffersPageSteps {
	TestContextSetup testContextSetup;
	OffersPage offersPage;
	
	public OffersPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@Then("^user searched for (.+) shortname in offers page to check if product exist$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) {
		offersPage = testContextSetup.pageObjectManager.getOffersPage();
		testContextSetup.utils.getOriginalWindow();
	    offersPage.clickOffersLink();
	    testContextSetup.utils.switchToAnotherWindow();
	    offersPage.searchForShortNameOffersPage(shortName);
	    String productNameOffers = offersPage.getProductNameOffersPage();
	    System.out.println(productNameOffers);
	    Assert.assertEquals(testContextSetup.productName, productNameOffers);
	}
	

}
