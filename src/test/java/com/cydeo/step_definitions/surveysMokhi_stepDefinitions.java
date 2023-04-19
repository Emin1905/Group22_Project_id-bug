package com.cydeo.step_definitions;

import com.cydeo.pages.SurveysMokhi_Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class surveysMokhi_stepDefinitions {

    SurveysMokhi_Page surveysMokhi_page = new SurveysMokhi_Page();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("user logins by entering valid username {string} and valid password {string}")
    public void user_logins_by_entering_valid_username_and_valid_password(String string, String string2) {

        surveysMokhi_page.usernameInput.sendKeys(string);
        surveysMokhi_page.passwordInput.sendKeys(string2);

    }

    @Then("by clicking the login button user goes to the homepage")
    public void by_clicking_the_login_button_user_goes_to_the_homepage() {

        surveysMokhi_page.loginBtn.click();
        Assert.assertTrue(surveysMokhi_page.homePageMsg.isDisplayed());
    }

    @Then("user clicks More from the menu bar and selects Surveys")
    public void user_clicks_more_from_the_menu_bar_and_selects_surveys() {

        surveysMokhi_page.moreBtn.click();
        surveysMokhi_page.surveysBtn.click();

    }

    @Then("user goes to Surveys page and clicks on Create button")
    public void user_goes_to_surveys_page_and_clicks_on_create_button() {

        surveysMokhi_page.createBtn.click();

    }

    @Then("user should see new survey form")
    public void user_should_see_new_survey_form() {

        Assert.assertTrue(surveysMokhi_page.surveyTitle.isDisplayed());
    }

    @When("user leaves the Survey Title field empty")
    public void userLeavesTheSurveyTitleFieldEmpty() {

        surveysMokhi_page.surveyTitle.sendKeys("");
        surveysMokhi_page.saveBtn.click();
    }

    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {

        Assert.assertTrue(surveysMokhi_page.errorMsg.isDisplayed());
    }
}
