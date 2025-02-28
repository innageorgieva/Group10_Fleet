package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US_BG38G10_285_Page;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class US_BG38G10_285_StepDefinitions extends BasePage{

    US_BG38G10_285_Page usBg38G10285Page = new US_BG38G10_285_Page();

    @When("user clicks the Vehicle Odometer module.")
    public void user_clicks_the_vehicle_odometer_module() {

        waitUntilLoaderScreenDisappear();
        navigateToModule("Fleet", "Vehicle Odometer");

    }

    @Then("user should see the error message “You do not have permission to perform this action.”")
    public void user_should_see_the_error_message_you_do_not_have_permission_to_perform_this_action() {

        BrowserUtils.verifyElementDisplayed(usBg38G10285Page.errorMessage);

    }

    @Then("user should see the default page as.")
    public void user_should_see_the_default_page_as() {

        BrowserUtils.verifyElementDisplayed(usBg38G10285Page.defaultPage1);

    }

    @Then("user should see the default page as {string}.")
    public void userShouldSeeTheDefaultPageAs_SS(String defaultPage1, String defaultPage25) {

        System.out.println("defaultPage1 = " + defaultPage1);
        Assert.assertEquals(defaultPage1, usBg38G10285Page.defaultPage1.getText());
        System.out.println(defaultPage25 + " = " + usBg38G10285Page.viewPerPage.getAttribute("value"));
        Assert.assertEquals(defaultPage25, usBg38G10285Page.viewPerPage.getAttribute("value"));

    }

    @Then("user should see the default page as {int}.")
    public void userShouldSeeTheDefaultPageAs(int arg0) {

    }

}
