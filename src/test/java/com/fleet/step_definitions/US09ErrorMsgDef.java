package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.ErrorMsgPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US09ErrorMsgDef extends BasePage  {


    ErrorMsgPage errorMsgPage = new ErrorMsgPage();
    Actions actions = new Actions(Driver.getDriver());


    @When("user navigates to Activities dropdown menu IG")
    public void user_navigates_to_activities_dropdown_menu_ig() {

        waitUntilLoaderScreenDisappear();
        navigateToModule("Activities", "Calendar Events");


    }
    @Then("user clicks on Calendar Events IG")
    public void user_clicks_on_calendar_events_ig() {


    }
    @Then("user should see Calendar Events - Activities in the title IG")
    public void user_should_see_calendar_events_activities_in_the_title_ig() {
        getPageSubTitle().contains("Calendar Events - Activities");

    }

    @When("user click on Create Calendar Event button IG")
    public void user_click_on_create_calendar_event_button_ig() {
        errorMsgPage.createCalendarEventButton.click();

    }
    @Then("user should see Create Calendar event - Calendar Events - Activities in the title IG")
    public void user_should_see_create_calendar_event_calendar_events_activities_in_the_title_ig() {
        getPageSubTitle().contains("Create Calendar event - Calendar Events - Activitie");
    }

    @When("user click on Repeat check box IG")
    public void user_click_on_repeat_check_box_ig() {
       errorMsgPage.repeatCheckBox.click();

    }
    @Then("more check boxes will appear IG")
    public void more_check_boxes_will_appear_ig() {

    }
    @Then("user enters {string} in Repeat Every box IG")
    public void user_enters_in_repeat_every_box_ig(String string) {
        errorMsgPage.repeatEveryCheckBox.clear();
        errorMsgPage.repeatEveryCheckBox.sendKeys(new CharSequence[]{string+ Keys.ENTER} );

    }
    @Then("user should see an error msg IG")
    public void user_should_see_an_error_msg_ig() {
        BrowserUtils.verifyElementDisplayed(errorMsgPage.errorMsg);
    }

}
