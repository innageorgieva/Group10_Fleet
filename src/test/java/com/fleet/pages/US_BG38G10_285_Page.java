package com.fleet.pages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class US_BG38G10_285_Page {

    public US_BG38G10_285_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // @FindBy(id = "prependedInput")
    //  public WebElement usernameInputSS;

    // @FindBy(id = "prependedInput2")
    // public WebElement passwordInputSS;

    // @FindBy(id = "_submit")
    // public WebElement loginButtonSS;

    // public void login(String username, String password){

    // usernameInputSS.sendKeys(username);
    // passwordInputSS.sendKeys(password);
    // loginButtonSS.click();

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage1;

    @FindBy(xpath = "//a[@data-size='25']")
    public WebElement viewPerPage;

    @FindBy(xpath = "//button[@data-toggle='dropdown']")
    public WebElement defaultPage25;

}





