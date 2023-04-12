package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarFranciska_Page {

    public CalendarFranciska_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@style='display: block;'][2]")
    public WebElement calendarMenu;


    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement meetingsWeek;

    @FindBy(xpath = "//button[contains(text(), 'Day')]")
    public WebElement dayButton;

    @FindBy(xpath = "//button[contains(text(), 'Week')]")
    public WebElement weekButton;

    @FindBy(xpath = "//button[contains(text(), 'Month')]")
    public WebElement monthButton;

    @FindBy(xpath = "//div[@class='o_content']")
    public WebElement page;

    @FindBy(xpath = "//td[@class='fc-widget-content']")
    public WebElement dailyDisplay;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement summeryInputBox;

    @FindBy(xpath = "//span[contains(text(), 'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "//div[contains(text(), 'Demo Meeting')]")
    public WebElement eventCreated;
}
