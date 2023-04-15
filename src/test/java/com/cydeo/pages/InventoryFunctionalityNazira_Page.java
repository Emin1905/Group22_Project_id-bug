package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryFunctionalityNazira_Page {

    public InventoryFunctionalityNazira_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "login")
    public WebElement usernameBox;


    @FindBy(id = "password")
    public WebElement passwordBox;


    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement HomePageText;

    @FindBy(xpath="")
    public WebElement InventoryButton;

}
