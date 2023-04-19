package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysMokhi_Page {

    public SurveysMokhi_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login" )
    public WebElement usernameInput;

    @FindBy(id = "password" )
    public WebElement passwordInput;

     @FindBy(css = "div.o_thread_title")
    public WebElement homePageMsg;

    @FindBy(css = "button.btn.btn-primary")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@data-toggle='dropdown']/b")
    public WebElement moreBtn;

    @FindBy(xpath = "//a[@data-menu='475']")
    public WebElement surveysBtn;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@placeholder='Survey Title']")
    public WebElement surveyTitle;


    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;

    @FindBy(css = "div.o_notification_manager")
    public WebElement errorMsg;






}
