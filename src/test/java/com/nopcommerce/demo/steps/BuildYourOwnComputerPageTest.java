package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class BuildYourOwnComputerPageTest {
    @And("^I click on processor drop down$")
    public void iClickOnProcessorDropDown(String processordropdown) {
        new BuildYourOwnComputerPage().selectProcessor(processordropdown);
    }

    @And("^I click on RAM drop dowm$")
    public void iClickOnRAMDropDowm() {
        new BuildYourOwnComputerPage().selectRam("8GB [+$60.00]");
    }

    @And("^I click on HDD radios$")
    public void iClickOnHDDRadios() {
        new BuildYourOwnComputerPage().selectHDD("400 GB [+$100.00]");
    }

    @And("^I click on OS radios$")
    public void iClickOnOSRadios() {
        new BuildYourOwnComputerPage().selectOS("Vista Premium [+$60.00]");
    }

    @And("^I click on software check boxes$")
    public void iClickOnSoftwareCheckBoxes() {
        new BuildYourOwnComputerPage().selectSoftware("Microsoft Office [+$50.00]");
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^verification message is displayed$")
    public void verificationMessageIsDisplayed() {
        new BuildYourOwnComputerPage().getProductAddedMessage();
    }
}
