package com.cydeo.step_definitions;

import com.cydeo.pages.FleetFunctionality_Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FleetFunctionality_StepDefinitions {

    FleetFunctionality_Page fleetFunctionalityPage = new FleetFunctionality_Page();

    @Given("user goes to the login page and logs in")
    public void user_goes_to_the_login_page_and_logs_in() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        fleetFunctionalityPage.emailSearchBox.sendKeys("posmanager10@info.com");
        fleetFunctionalityPage.passwordSearchbox.sendKeys("posmanager");
        fleetFunctionalityPage.loginButton.click();

    }
    @When("user is on the homepage")
    public void user_is_on_the_homepage() {

        Assert.assertTrue(fleetFunctionalityPage.HomePageText.isDisplayed());

    }
    @And("user goes to the Vehicles Contracts in the Vehicles section")
    public void user_goes_to_the_vehicles_contracts_in_the_vehicles_section() {

    }
    @Then("user clicks to the create button")
    public void user_clicks_to_the_create_button() {

    }





}

