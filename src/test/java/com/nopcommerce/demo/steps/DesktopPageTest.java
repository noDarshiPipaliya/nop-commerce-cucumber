package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.DesktopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DesktopPageTest {


    @And("^I click on desktop link$")
    public void iClickOndesktoplink() {
        new DesktopPage().clickondesktops();
    }

//    @And("^I click on sortby$")
//    public void iClickOnSortby() {
//        new DesktopPage().selectSortBy("Name: A to Z");
//    }

//    @And("^I click on display$")
//    public void iClickOnDisplay() {
//        new DesktopPage().selectDisplayPerPage("3");
//    }

    @Then("^I click on select product$")
    public void iClickOnSelectProduct() {
        new DesktopPage().selectProduct("Build your own computer");
    }
}
