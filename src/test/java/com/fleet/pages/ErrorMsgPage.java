package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorMsgPage extends BasePage {
    public ErrorMsgPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//i[@class='fa-puzzle-piece menu-icon'])[1]")
    public WebElement activityButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement calendarEventsButton;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//label[@class='fields-row']/input[3]")
    public WebElement repeatEveryCheckBox;

    @FindBy (xpath = "//span[text()='The value have not to be less than 1.']")
    public WebElement errorMsg;




}
