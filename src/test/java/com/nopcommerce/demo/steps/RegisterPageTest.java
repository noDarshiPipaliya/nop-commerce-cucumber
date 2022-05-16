package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class RegisterPageTest {
    @And("^I click on register text$")
    public void iClickOnRegisterText() {
        new RegisterPage().getRegisterText();
    }

    @And("^I click on gender radio button$")
    public void iClickOnGenderRadioButton() {
        new RegisterPage().selectGender("Female");
    }

    @And("^I click on firstname field$")
    public void iClickOnFirstnameField() {
        new RegisterPage().enterFirstName("Devanshi");
    }

    @And("^I click on lastname field$")
    public void iClickOnLastnameField() {
        new RegisterPage().enterLastName("Patel");
    }

    @And("^I click on date of birth$")
    public void iClickOnDateOfBirth() {
        new RegisterPage().selectDateOfBirth();
    }

    @And("^I click on date of birth month$")
    public void iClickOnDateOfBirthMonth() {
        new RegisterPage().selectbirthmonth();
    }


    @And("^I click on date of birth year$")
    public void iClickOnDateOfBirthYear() {
    }

    @And("^I click on email$")
    public void iClickOnEmail() {
        new RegisterPage().enterEmail("devanshi@gmail.com");
    }

    @And("^I click on password field$")
    public void iClickOnPasswordField() {
        new RegisterPage().enterPassword("Devanshi");
    }

    @And("^I click on confirm password field$")
    public void iClickOnConfirmPasswordField() {
        new RegisterPage().enterConfirmPassword("Devanshi");
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I get complete registration text$")
    public void iGetCompleteRegistrationText() {
        new RegisterPage().getYourRegCompletedText();
    }
}
