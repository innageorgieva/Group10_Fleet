package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B38G10_275RL_ModulesPage {

    public B38G10_275RL_ModulesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> mainModules;


    @FindBy(xpath = "//span[@class='title title-level-1']" )
    public List<WebElement> driverMainModules;
}
