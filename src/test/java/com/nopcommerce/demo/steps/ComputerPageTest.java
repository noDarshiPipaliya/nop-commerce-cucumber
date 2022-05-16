package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.java.en.Then;

public class ComputerPageTest {


//    @And("^I click on computer title$")
//    public void iClickOnComputerTitle() {
//        new ComputerPage().getPageTitleText();
//    }

    @Then("^I click on computer link$")
    public void iClickOnComputerLink() {
        new ComputerPage().clickcomputerlink();
    }



}
