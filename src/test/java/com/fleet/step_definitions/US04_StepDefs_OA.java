package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.VehicleContractPage_OA;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04_StepDefs_OA extends BasePage {

    @When("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        waitUntilLoaderScreenDisappear();
        BrowserUtils.verifyTitle("Dashboard");
    }

    @When("user clicks on {string} menu and selects on {string} option")
    public void user_clicks_on_menu_and_selects_on_option(String moduleName, String dropdownOptionName) {
        navigateToModule(moduleName, dropdownOptionName);

//        System.out.println("Expected Fleet : " + moduleName);
//        System.out.println("Expected Vehicle Contracts : " + dropdownOptionName);
    }

    @Then("user should see url link")
    public void user_should_see_url_link() {
        String expectedUrl = "https://qa3.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);

//        System.out.println("Expected URL : " + expectedUrl);
//        System.out.println("Actual URL : " + actualUrl);

    }

    @Then("user should see {string} in the title")
    public void user_should_see_in_the_title(String expectedTitle) {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.verifyTitle(expectedTitle);

//        System.out.println("Expected Title : " + expectedTitle);
//        System.out.println("Actual Title : " + Driver.getDriver().getTitle());
    }

    VehicleContractPage_OA vehicleContractPage = new VehicleContractPage_OA();

    @Then("user should see the message {string}")
    public void userShouldSeeTheMessage(String expectedMessage) {
        String actualMessage = vehicleContractPage.errorMessage.getText();

        Assert.assertEquals(actualMessage, expectedMessage);

//        System.out.println("Expected Message : " + expectedMessage);
//        System.out.println("Actual Message : " + actualMessage);
    }
}
