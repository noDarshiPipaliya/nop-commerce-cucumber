Feature: Homepage test

  as a user I want to navigate to nopcommerce homepage

  @smoke
  Scenario: User should navigate to homepage
    Given  I am on homepage
    When   I click on login link
    And    I click on register link
#    And   I click on top menu list
    Then   I click on logout link
