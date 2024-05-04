Feature: Order products

@Orderproduct
Scenario: Order experience for product search for both home and checkout

Given user is on greenKart landing page
When user searched with "cau" and order three units of this product
Then user go to checkout page check if product "cau" exist
And apply code and place order exist