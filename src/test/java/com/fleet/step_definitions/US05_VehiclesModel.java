package com.fleet.step_definitions;

import com.fleet.pages.US05_FleetVehiclesModelPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class US05_VehiclesModel {
    US05_FleetVehiclesModelPage vehiclesModelPage = new US05_FleetVehiclesModelPage();
    List<WebElement> actualVehiclesModelColumn = vehiclesModelPage.actualVehiclesModelColumn;


    @Then("user should see table with ten columns names")
    public void user_should_see_table_with_columns_names(List<String> expectedVehicleModelColumns) {
        BrowserUtils.sleep(1);
        System.out.println("ExpectedVehicleModelColumns = " + expectedVehicleModelColumns);

        List <String> namesOfVehiclesModel = new ArrayList<>();
        for (int i = 0; i < actualVehiclesModelColumn.size(); i++) {
            namesOfVehiclesModel.add(actualVehiclesModelColumn.get(i).getText());
            namesOfVehiclesModel.removeIf(s -> s.trim().isEmpty());
        }
        if (!namesOfVehiclesModel.isEmpty()) {
            namesOfVehiclesModel.remove(namesOfVehiclesModel.size() -1);
        }
        System.out.println("Vehicle Model Column = " + namesOfVehiclesModel);
        Assert.assertEquals(expectedVehicleModelColumns, namesOfVehiclesModel);
    }

    @Then("the user should see an error message 'You do not have permission to perform this action.'")
    public void the_user_should_see_an_error_message() {
        BrowserUtils.sleep(1);
        BrowserUtils.verifyElementDisplayed(vehiclesModelPage.message);
    }
}
