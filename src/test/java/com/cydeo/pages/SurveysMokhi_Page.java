package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysMokhi_Page {

    public SurveysMokhi_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "More ")
    public WebElement moreBtn;

    @FindBy(xpath = "//a[@data-menu='475']")
    public WebElement surveysBtn;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@placeholder='Survey Title']")
    public WebElement surveyTitle;




}
