package com.cydeo.step_definitions;

import com.cydeo.pages.EmployeesAlima_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmployeesAlima_StepDefinitions {

    WebDriver driver = Driver.getDriver();
    EmployeesAlima_Page page = new EmployeesAlima_Page();


    @Given("user posmanager already logged in")
    public void user_posmanager_already_logged_in() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa.upgenix.net/web/login/");
        page.emailTextbox.sendKeys("posmanager15@info.com");
        page.passwordTextbox.sendKeys("posmanager");
        page.loginButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @When("user clicks  employees button")
    public void user_clicks_employees_button() {
        page.employeesButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @When("user clicks the create button")
    public void user_clicks_the_create_button() {
        page.createButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("user can see new employee form")
    public void user_can_see_new_employee_form() {
        Assert.assertTrue(page.EmployeesNameForm.isDisplayed());

    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        page.saveButton.click();

    }

    @Then("user should see message")
    public void user_should_see_message() {
        Assert.assertTrue(page.errorMsg.isDisplayed());
    }

    @When("user fills employee form and click save button")
    public void user_fills_employee_form_and_click_save_button() {
        page.nameBox.sendKeys("Zhaidar A");
        page.saveButton.click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

    }

    @Then("user should see employee created message")
    public void user_should_see_employee_created_message() {
        Assert.assertTrue(page.message.isDisplayed());


    }

    @When("user search new created employee")
    public void user_search_new_created_employee(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        if(page.searchBox.isDisplayed()){
            page.searchBox.sendKeys("Zhaidar A");
            page.searchBox.sendKeys(Keys.RETURN);
        }else {
            System.out.println("searchbox not found");
        }

    }

    @Then("user finds new employee listed")
    public void user_finds_new_employee_listed() {
        Assert.assertTrue(page.createdUser.isDisplayed());
    }


}
