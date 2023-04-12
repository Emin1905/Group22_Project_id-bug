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




}
