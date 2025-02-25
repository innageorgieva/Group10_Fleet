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
        System.out.println("expectedModuleNames = " + expectedModuleNames);
        BrowserUtils.sleep(2);

        List<String> expectedModuleNamesBelow = new ArrayList<>();
        System.out.println("expectedModuleNamesBelow = " + expectedModuleNamesBelow);
        //printing empty ArrayList

        expectedModuleNamesBelow.addAll(expectedModuleNames);
        //added the list of strings

        BrowserUtils.sleep(2);
        System.out.println("Module Names added in the new ArrayList = " + expectedModuleNamesBelow);


        //browserUtils to convert List of WebElements to List of String
      //  List<String> actualModuleNames = BrowserUtils.getElementsText(driverMainModules);

        //looping through the List of Web elements
        for (WebElement module : driverMainModules) {
            String actualModuleName = module.getText();

            System.out.println("module text = " + module.getText());

            System.out.println("actualModuleName : " + actualModuleName);


            // Assert.assertTrue(expectedModuleNames.contains(actualModuleNames));

            // Assert.assertEquals(actualModuleNames, expectedModuleNames);


            //Asserting through index number
            Assert.assertTrue(actualModuleName.contains(expectedModuleNames.get(0)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNames.get(1)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNames.get(2)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNames.get(3)));
        }
    }

    //____________________________________________________________________________________________
    //____________________________________________________________________________________________

    //STORE MANAGER or SALES MANAGER
    @Then("user should see eight module names below")
    public void userShouldSeeEightModuleNamesBelow(List<String> expectedModuleNames) {
        System.out.println("expectedModuleNames = " + expectedModuleNames);
        BrowserUtils.sleep(2);

        List<String> expectedModuleNamesBelow = new ArrayList<>();
        System.out.println("expectedModuleNamesBelow = " + expectedModuleNamesBelow);
        //printing empty ArrayList

        expectedModuleNamesBelow.addAll(expectedModuleNames);
        //added the list of strings

        BrowserUtils.sleep(2);
        System.out.println("Module Names added in the new ArrayList = " + expectedModuleNamesBelow);


        //looping through the List of Web elements
        for (WebElement module : mainModules) {
            String actualModuleName = module.getText();

            System.out.println("module text = " + module.getText());

            System.out.println("actualModuleName : " + actualModuleName);


            //Assertion using index number - passing
            Assert.assertTrue(actualModuleName.contains(expectedModuleNamesBelow.get(0)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNamesBelow.get(1)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNamesBelow.get(2)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNamesBelow.get(3)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNamesBelow.get(4)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNamesBelow.get(5)));
            Assert.assertTrue(actualModuleName.contains(expectedModuleNamesBelow.get(6)));
        }
    }


}


