package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US05_FleetVehiclesModelPage {
    public US05_FleetVehiclesModelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//table//tr//th[position() >1]")
    public List<WebElement> actualVehiclesModelColumn;

    @FindBy (xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement message;
}
