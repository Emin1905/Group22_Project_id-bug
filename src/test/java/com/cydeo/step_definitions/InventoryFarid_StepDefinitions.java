package com.cydeo.step_definitions;

import com.cydeo.pages.InventoryFarid_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InventoryFarid_StepDefinitions {

    InventoryFarid_Page inventory= new InventoryFarid_Page();
    @Given("user  should be able to navigate to the login page")
    public void user_should_be_able_to_navigate_to_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters username {string} in user box")
    public void user_enters_username_in_user_box(String string) {
        inventory.usernameBox.sendKeys("posmanager10@info.com");


    }
    @When("user enters password {string} in password box")
    public void user_enters_password_in_password_box(String string) {
        inventory.passwordBox.sendKeys("posmanager");

    }
    @When("user clicks to Login button")
    public void user_clicks_to_login_button() {
        inventory.loginButton.click();

    }
    @Then("user click to the inventory module")
    public void user_click_to_the_inventory_module() {
        inventory.InventoryButton.click();

    }
    @Then("user landing the Inventory page")
    public void user_landing_the_inventory_page() {
        BrowserUtils.sleep(4);
        Assert.assertEquals(Driver.getDriver().getTitle(), "Inventory-Odoo");

    }
    @Then("user clicks to {string} button at the same page")
    public void user_clicks_to_button_at_the_same_page(String string) {
        inventory.ProductsButton.click();

    }
    @Then("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Products-Odoo");

    }
    @Then("user clicks to the {string} button on the same page")
    public void user_clicks_to_the_button_on_the_same_page(String string) {
        inventory.createButton.click();

    }
    @When("user leaves {string} box blank and clicks on save button")
    public void user_leaves_box_blank_and_clicks_on_save_button(String string) {
        inventory.saveButton.click();

    }
    @Then("user should be able to see {string} message on the board")
    public void user_should_be_able_to_see_message_on_the_board(String string) {

    }
    @When("user creates a product")
    public void user_creates_a_product() {

    }
    @When("user enters  a {string}")
    public void user_enters_a(String string) {

    }
    @When("user clicks to the save button")
    public void user_clicks_to_the_save_button() {

    }
    @Then("user should be able to see the page title includes the Product Name")
    public void user_should_be_able_to_see_the_page_title_includes_the_product_name() {

    }
    @When("User clicks on the Products module")
    public void user_clicks_on_the_products_module() {

    }
    @Then("User should be able to see that Product is listed")
    public void user_should_be_able_to_see_that_product_is_listed() {

    }








}



