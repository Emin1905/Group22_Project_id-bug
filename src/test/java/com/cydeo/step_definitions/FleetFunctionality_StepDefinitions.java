package com.cydeo.step_definitions;

import com.cydeo.pages.FleetFunctionality_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


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

        WebDriver driver = null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertTrue(fleetFunctionalityPage.HomePageText.isDisplayed());

    }
    @Then("user goes to the fleet page in more menu")
    public void userGoesToTheFleetPageInMoreMenu() {

        BrowserUtils.sleep(2);
        fleetFunctionalityPage.menuMore.click();
        BrowserUtils.sleep(2);
        fleetFunctionalityPage.fleetPageInMenuMore.click();
    }
    @And("user goes to the Vehicles Contracts in the Vehicles section")
    public void user_goes_to_the_vehicles_contracts_in_the_vehicles_section() {

        BrowserUtils.sleep(1);
        fleetFunctionalityPage.vehiclesContractsPage.click();

    }
    @Then("user clicks to the create button")
    public void user_clicks_to_the_create_button() {

        BrowserUtils.sleep(1);
        fleetFunctionalityPage.vehiclesContractsCreateButton.click();

    }





    @When("user goes to the vehicle contract creation page")
    public void user_goes_to_the_vehicle_contract_creation_page() {

        BrowserUtils.sleep(2);
        fleetFunctionalityPage.menuMore.click();
        BrowserUtils.sleep(2);
        fleetFunctionalityPage.fleetPageInMenuMore.click();

        BrowserUtils.sleep(1);
        fleetFunctionalityPage.vehiclesContractsPage.click();

        BrowserUtils.sleep(1);
        fleetFunctionalityPage.vehiclesContractsCreateButton.click();

    }
    @And("user chooses the vehicle")
    public void user_chooses_the_vehicle() {

        fleetFunctionalityPage.vehicleChoice.click();
        fleetFunctionalityPage.bmwOption.click();

    }
    @And("user chooses the type")
    public void user_chooses_the_type() {

        fleetFunctionalityPage.typeChoice.click();
        BrowserUtils.sleep(1);
        fleetFunctionalityPage.leasingChoice.click();

    }
    @And("user enters the activation cost")
    public void user_enters_the_activation_cost() {

        fleetFunctionalityPage.activationCost.clear();
        BrowserUtils.sleep(1);
        fleetFunctionalityPage.activationCost.sendKeys("30000");

    }
    @Then("user chooses the recurring cost amount")
    public void user_chooses_the_recurring_cost_amount() {

        Select slctRecurringCostAmount = new Select(fleetFunctionalityPage.recurringCostAmount);
        slctRecurringCostAmount.selectByIndex(5);

        fleetFunctionalityPage.recurringCostInput.clear();
        BrowserUtils.sleep(1);
        fleetFunctionalityPage.recurringCostInput.sendKeys("500");

    }
}

