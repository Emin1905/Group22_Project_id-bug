package com.cydeo.step_definitions;

import com.github.javafaker.Faker;
import com.cydeo.pages.CustomersPageKayala;
import com.cydeo.pages.SalesPageKayala;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SalesStepDefinitionsKayala {
    SalesPageKayala salesPage = new SalesPageKayala();
    CustomersPageKayala customersPage= new CustomersPageKayala();
    Faker faker = new Faker();
    String customerName = faker.name().firstName();

    @Given("user in on home page")
    public void user_in_on_home_page() {
        Driver.getDriver().get("https://qa.upgenix.net/");
        salesPage.usernameInputBox.sendKeys("salesmanager15@info.com");
        salesPage.passwordInputBox.sendKeys("salesmanager");
        salesPage.passwordInputBox.sendKeys(Keys.ENTER);

    }

    @When("user clicks Sales button")
    public void user_clicks_sales_button() {

        salesPage.salesButton.click();
    }
    @When("user clicks Customers button")
    public void user_clicks_customers_button() {
        salesPage.customersButton.click();
        BrowserUtils.waitFor(2);

    }
    @When("user clicks Create button")
    public void user_clicks_create_button() {
        salesPage.createButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("user reaches New Customer Form")
    public void user_reaches_new_customer_form() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath
                ("//ol[@class='breadcrumb']")).isDisplayed());
        BrowserUtils.waitFor(2);

    }

    @Then("user clicks Save button")
    public void user_clicks_save_button() {
        salesPage.saveButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user sees an error message displayed")
    public void user_sees_an_error_message_displayed() {
        Assert.assertTrue( Driver.getDriver().findElement(By.xpath("//div[@class='o_notification_manager']")).isDisplayed());

        BrowserUtils.waitFor(2);

    }

    @When("user enters name")
    public void user_enters_name() {
        System.out.println("customerName = " + customerName);

        customersPage.nameInputBox.sendKeys(customerName);

    }


    @When("user chooses a company name")
    public void user_chooses_a_company_name() {
        Select companyName = new Select(customersPage.companyRadioBox);
        companyName.selectByVisibleText("2700 Des Plaines RD, Des Plaines IL");
    }
    @Then("user sees that the page title includes the customer name")
    public void user_sees_that_the_page_title_includes_the_customer_name() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(customerName));
        System.out.println("customerName = " + customerName);
    }



}

