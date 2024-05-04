package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageobjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageSteps {
	TestContextSetup testContextSetup;
	CheckoutPage checkoutPage;
	
	public CheckoutPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	@Then("user go to checkout page check if product {string} exist")
	public void user_go_to_checkout_page_check_if_product_exist(String string) throws InterruptedException {
	    //checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	    checkoutPage.proceedToCheckout();
	    Thread.sleep(3000);
	    String productNameCheckout = checkoutPage.getProductName().split("-")[0].trim();
	    Assert.assertEquals(testContextSetup.productName, productNameCheckout);
	}
	
	@Then("apply code and place order exist")
	public void apply_code_and_place_order_exist() {
	    //checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	    Assert.assertTrue(checkoutPage.seeApply());
	    Assert.assertTrue(checkoutPage.seePlaceOrder());
	}
}
