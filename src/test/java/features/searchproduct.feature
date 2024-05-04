Feature: Search and Place the order for products

@Searchproduct
Scenario Outline: Search Experience for product search for both home and offers page

Given user is on greenKart landing page
When user searched with shortname <name> and extracted actual name of product
Then user searched for <name> shortname in offers page to check if product exist

Examples:
| name |
| tom  |
| bee  |
