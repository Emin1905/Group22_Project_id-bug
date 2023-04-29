package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryFarid_Page {

    public  void loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "login")
    public WebElement usernameBox;


    @FindBy(id = "password")
    public WebElement passwordBox;


    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement HomePageText;

    @FindBy(xpath="(//span[contains(text(),'Inventory')])[1]")
    public WebElement InventoryButton;


    @FindBy(xpath="//span[contains(text(),'Products')][8]")
    public WebElement ProductsButton;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "//button[contains(text(), 'Save')][1]")
    public WebElement saveButton;




}