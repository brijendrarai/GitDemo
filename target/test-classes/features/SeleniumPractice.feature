
@SeleniumPractice
Feature: Search and place order of vegitables

  @BrinjalTag
  Scenario: Search for items and validate result
    Given User is on Greencart landing page
    When User serach for "Cucumber" vegitable
    Then "Cucumber" results are displayed

  @tag2
  Scenario: Search for items and then move to checkout page
    Given User is on Greencart landing page
    When User serach for "Brinjal" vegitable
    And added items to cart
    And user proceeded to checkout page for purchase
    Then verify selected "Brinjal" items are displayed in check out page
