package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarFranciska_Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;

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
}
