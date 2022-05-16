Feature: build your own computer page test

  As a user I should navigate to build your own computer page


  Scenario: user should shop the product successfully
    Given  I am on homepage
    When   I click on computer link
    And    I click on desktop link
    And    I click on select product
    And    I click on processor drop down
    And    I click on RAM drop dowm
    And    I click on HDD radios
    And    I click on OS radios
    And    I click on software check boxes
    And    I click on add to cart button
    Then   verification message is displayed


  Scenario Outline: user should creste account successfull
    Given  I am on homepage
    When   I click on computer link
    And    I click on desktop link
    And    I click on select product
    And    I click on processor drop down
    And    I click on RAM drop dowm
    And    I click on HDD radios
    And    I click on OS radios
    And    I click on software check boxes
    And    I click on add to cart button
    And    I enter following details
    Examples:
      | processordropdown                               | RAM           | HDD               | OS                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista  Home [+$50.00]   | Total Commander [+$5.00]   |
