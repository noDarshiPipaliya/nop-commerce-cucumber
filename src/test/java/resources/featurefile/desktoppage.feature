Feature: desktop test

  As a user I should navigate to desktop page

  @sanity

  Scenario: user should navigate to desktop page
    Given  I am on homepage
    When   I click on computer link
    And    I click on desktop link
#    And   I click on sortby
#    And   I click on display
    Then   I click on select product
