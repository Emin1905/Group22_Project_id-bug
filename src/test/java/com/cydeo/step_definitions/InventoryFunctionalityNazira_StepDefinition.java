package com.cydeo.step_definitions;

import com.cydeo.pages.InventoryFunctionalityNazira_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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
      inventoryFunctionalityNazira_page.InventoryButton.click();

    }
    @Then("User is on the Inventory landing page")
    public void user_is_on_the_inventory_landing_page() {
        BrowserUtils.sleep(3);
       Assert.assertEquals(Driver.getDriver().getTitle(), "Inventory - Odoo");

    }

    @When("User clicks on the {string} button in the navigation menu")
    public void userClicksOnTheButtonInTheNavigationMenu(String arg0) {
        inventoryFunctionalityNazira_page.ProductsButton.click();
    }

    @Then("User is on the {string} landing page")
    public void user_is_on_the_landing_page(String ProductsPage) {
        BrowserUtils.sleep(3);
       Assert.assertEquals(Driver.getDriver().getTitle(),"Products - Odoo");

    }
    @Then("User clicks a {string} button on the same page")
    public void user_clicks_a_button_on_the_same_page(String CreateButton) {
       inventoryFunctionalityNazira_page.CreateButton.click();

    }
    @Then("User is able to see the Product Form on the page")
    public void user_is_able_to_see_the_product_form_on_the_page() {
    Assert.assertTrue(inventoryFunctionalityNazira_page.ProductFormLabel.isDisplayed());


    }

    @When("User clicks on Save button")
    public void user_clicks_on_save_button_without_filling_the_product_name() {
     inventoryFunctionalityNazira_page.SaveButton.click();

    }
    @Then("User should be able to see {string} error message on the screen")
    public void user_should_be_able_to_see_error_message_on_the_screen(String string) {
        System.out.println(inventoryFunctionalityNazira_page.notificationMessage.getText());
        Assert.assertEquals("The following fields are invalid:\n" +
                "Name",inventoryFunctionalityNazira_page.notificationMessage.getText() );

    }

    @And("User  writes a Product Name {string}")
    public void userWritesAProductName(String prodName) {
        inventoryFunctionalityNazira_page.ProductNameTextBox.sendKeys(prodName);
    }


    @Then("The page title includes the Product name {string} .")
    public void thePageTitleIncludesTheProductName(String prodName) {
        BrowserUtils.sleep(3);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(prodName));
    }


    @Then("User should be able to see that Product {string} is listed")
    public void userShouldBeAbleToSeeThatProductIsListed(String prodName) {
        BrowserUtils.sleep(3);
        inventoryFunctionalityNazira_page.SearchTextBox.sendKeys(prodName);
        BrowserUtils.sleep(5);
        inventoryFunctionalityNazira_page.clickProductName(prodName);
        BrowserUtils.sleep(5);
        Assert.assertTrue("Product Name is not Displayed", inventoryFunctionalityNazira_page.validateProductNameDisplayed(prodName));
    }
}
