package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryFarid_Page {

    public  void loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy(id="login")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;


    @FindBy(xpath= "//span[contains(text(), 'Inventory')][1]")
            public WebElement inventoryButton;


}