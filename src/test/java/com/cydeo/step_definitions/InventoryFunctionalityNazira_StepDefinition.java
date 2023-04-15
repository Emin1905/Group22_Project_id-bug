package com.cydeo.step_definitions;

import com.cydeo.pages.InventoryFunctionalityNazira_Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InventoryFunctionalityNazira_StepDefinition {

    InventoryFunctionalityNazira_Page inventoryFunctionalityNazira_page = new InventoryFunctionalityNazira_Page();

    @Given("User should be able to navigate to webpage")
    public void user_should_be_able_to_navigate_to_webpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Given("User should be able to enter username {string}")
    public void user_should_be_able_to_enter_username(String username) {
        inventoryFunctionalityNazira_page.usernameBox.sendKeys("salesmanager16@info.com");


    }
    @Given("User should be able to enter password {string}")
    public void user_should_be_able_to_enter_password(String password) {
      inventoryFunctionalityNazira_page.passwordBox.sendKeys("salesmanager");

    }
    @Given("User clicks the login button")
    public void user_clicks_the_login_button() {
      inventoryFunctionalityNazira_page.loginButton.click();

    }
    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Assert.assertTrue(inventoryFunctionalityNazira_page.HomePageText.isDisplayed());
    }

    @When("User clicks on Inventory button")
    public void user_clicks_on_inventory_button() {


    }
    @Then("User is on the Inventory landing page")
    public void user_is_on_the_inventory_landing_page() {


    }
    @When("User clicks on the {string} button in the navigation menu")
    public void user_clicks_on_the_button_in_the_navigation_menu(String string) {


    }
    @Then("User is on the {string} landing page")
    public void user_is_on_the_landing_page(String string) {


    }
    @Then("User clicks a {string} button on the same page")
    public void user_clicks_a_button_on_the_same_page(String string) {


    }
    @Then("User is able to see the Product Form on the page")
    public void user_is_able_to_see_the_product_form_on_the_page() {


    }

    @When("User clicks on Save button without filling the Product Name")
    public void user_clicks_on_save_button_without_filling_the_product_name() {


    }
    @Then("User should be able to see {string} error message on the screen")
    public void user_should_be_able_to_see_error_message_on_the_screen(String string) {


    }
    @Then("Product Name input box is bordered in red color")
    public void product_name_input_box_is_bordered_in_red_color() {


    }

    @When("User is able to create a Product")
    public void user_is_able_to_create_a_product() {


    }
    @When("User  writes a Product Name")
    public void user_writes_a_product_name() {


    }
    @When("User  clicks on Save button")
    public void user_clicks_on_save_button() {


    }
    @Then("The page title includes the Product name.")
    public void the_page_title_includes_the_product_name() {


    }
    @When("User clicks on the Products module")
    public void user_clicks_on_the_products_module() {


    }
    @Then("User should be able to see that Product is listed")
    public void user_should_be_able_to_see_that_product_is_listed() {


            }
}
