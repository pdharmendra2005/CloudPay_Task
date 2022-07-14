
@LaptopSearch
Feature: Laptop search

  Scenario: As a user I want to buy Dell laptop and monitor from Amazon
    Given I am on Amazon search home page
    When  I search "<Dell Laptops>" from Home page
    And   I click "<4GB>" to refine my search
    And   I pick "<2020 Newest Dell Inspiron 15 3000 PC Laptop>" desired laptop
    Then  I should the price $373 for Dell Inspiron 15 3000 PC Laptop
    And   I added 2020 Newest Dell Inspiron 15 3000 PC Laptop to the basket
    And   I search "<monitor>" and added into basket
    Then  I should see the total price for both the items

