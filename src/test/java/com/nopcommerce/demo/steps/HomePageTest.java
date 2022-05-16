package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class HomePageTest {
    @And("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

//    @And("^I click on top menu list$")
//    public void iClickOnTopMenuList() {
//
//    }

    @Then("^I click on logout link$")
    public void iClickOnLogoutLink() {
     new HomePage().clickonlogoutlink();
    }
}
