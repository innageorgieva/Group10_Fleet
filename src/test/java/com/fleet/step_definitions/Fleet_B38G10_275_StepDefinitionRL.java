package com.fleet.step_definitions;

import com.fleet.pages.B38G10_275RL_ModulesPage;
import com.fleet.pages.BasePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class Fleet_B38G10_275_StepDefinitionRL extends BasePage {

    B38G10_275RL_ModulesPage modulesPage = new B38G10_275RL_ModulesPage();

    List<WebElement> mainModules = modulesPage.mainModules;

    List<WebElement> driverMainModules = modulesPage.driverMainModules;

    //DRIVER
    @Then("driver should see four main modules below")
    public void driverShouldSeeFourMainModulesBelow(List<String> expectedModuleNames) {
        BrowserUtils.sleep(2);
        System.out.println("expectedModuleNames = " + expectedModuleNames);


        List<String> actualModuleNames = new ArrayList<>();
        //creating empty ArrayList

        BrowserUtils.sleep(2);
        //looping through each web element
        for (WebElement each : driverMainModules) {
            actualModuleNames.add(each.getText());
        }

        System.out.println("actualModuleNames = " + actualModuleNames);

        Assert.assertEquals(expectedModuleNames, actualModuleNames);
        }


    //____________________________________________________________________________________________
    //____________________________________________________________________________________________

    //STORE MANAGER or SALES MANAGER
    @Then("user should see eight module names below")
    public void userShouldSeeEightModuleNamesBelow(List<String> expectedModuleNames) {
        BrowserUtils.sleep(2);
        System.out.println("expectedModuleNames = " + expectedModuleNames);


        List<String> actualModuleNames = new ArrayList<>();
                //creating empty ArrayList

        BrowserUtils.sleep(2);
        //looping through each web element
        for (WebElement each : mainModules) {
            actualModuleNames.add(each.getText());
        }

        System.out.println("actualModuleNames = " + actualModuleNames);

        Assert.assertEquals(expectedModuleNames, actualModuleNames);

        }
    }





