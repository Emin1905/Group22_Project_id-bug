package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarFranciska_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CalendarFranciska_StepDefinitions {
    CalendarFranciska_Page calendarFranciskaPage = new CalendarFranciska_Page();

    @Then("user clicks to Calendar button.")
    public void user_clicks_to_calendar_button() {

        calendarFranciskaPage.calendarMenu.click();
    }


    @Then("user first lands on weekly display.")
    public void user_first_lands_on_weekly_display() {

        Assert.assertTrue(calendarFranciskaPage.meetingsWeek.isDisplayed());
    }


    @When("user clicks to Day Button")
    public void userClicksToDayButton() {
        calendarFranciskaPage.dayButton.click();

    }

    @Then("display is changing")
    public void displayIsChanging() {

        String expectedResult1 = "Day";
        Assert.assertTrue(calendarFranciskaPage.dayButton.getText().equals(expectedResult1));

        String expectedResult2 = "Week";
        Assert.assertTrue(calendarFranciskaPage.weekButton.getText().equals(expectedResult2));

        String expectedResult3 = "Month";
        Assert.assertTrue(calendarFranciskaPage.monthButton.getText().equals(expectedResult3));

    }


    @And("user clicks to Week Button")
    public void userClicksToWeekButton() {
        calendarFranciskaPage.weekButton.click();
    }

    @And("user clicks to Month Button")
    public void userClicksToMonthButton() {
        calendarFranciskaPage.monthButton.click();
    }


    @When("user is clicking on time box on daily display")
    public void userIsClickingOnTimeBoxOnDailyDisplay() {
        calendarFranciskaPage.dailyDisplay.click();
    }

    @Then("user insert the event name on Summary box")
    public void userInsertTheEventNameOnSummaryBox() {
        calendarFranciskaPage.summeryInputBox.sendKeys("Demo Meeting!");
    }

    @And("user clicks under Create button")
    public void userClicksUnderCreateButton() {
        calendarFranciskaPage.createButton.click();
    }


    @Then("user successfully created an event")
    public void userSuccessfullyCreatedAnEvent() {

        Assert.assertTrue(calendarFranciskaPage.eventCreated.isDisplayed());
    }
}


