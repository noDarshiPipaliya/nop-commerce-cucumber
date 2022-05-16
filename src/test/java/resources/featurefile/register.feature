Feature: Register

  Scenario: User should create account successfully
    Given   I am on homepage
    When    I click on register link
    And     I click on register text
    And     I click on gender radio button
    And     I click on firstname field
    And     I click on lastname field
    And     I click on date of birth
    And     I click on date of birth month
    And     I click on date of birth year
    And     I click on email
    And     I click on password field
    And     I click on confirm password field
    And     I click on register button
    Then    I get complete registration text