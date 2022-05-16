package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement clickcomputerLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement subMenuLinks;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        Reporter.log("Get pageTitle text : " + pageTitle.getText() + "<br>");
        return message;
    }

    public void clickcomputerlink(){
        clickOnElement(clickcomputerLink);
    }

    public void clickOnSubMenu() {
        clickOnElement(subMenuLinks);
        }
    }