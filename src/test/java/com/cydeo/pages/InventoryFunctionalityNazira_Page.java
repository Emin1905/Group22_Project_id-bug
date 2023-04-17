package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath="(//span[contains(text(),'Inventory')])[1]")
    public WebElement InventoryButton;
    //span[text()='Inventory']
   //span[contains(text(),'Inventory')]

    @FindBy(xpath="(//span[contains(text(),'Products')])[8]")
    public WebElement ProductsButton;


    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement CreateButton;

    @FindBy(xpath = "//label[contains(text(),'Product Name')]")
    public WebElement ProductFormLabel;

    @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[contains(text(),'Save')]")
    public WebElement SaveButton;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement notificationMessage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement ProductNameTextBox;

   @FindBy (xpath = "//input[@placeholder='Search...']")
    public WebElement SearchTextBox;

   //input[@class='o_searchview_input']
   public boolean validateProductNameDisplayed(String prodName){
       WebElement element = Driver.getDriver().findElement(By.xpath("//span[text()='"+prodName+"']"));
       return element.isDisplayed();
   }

    public void clickProductName(String prodName){
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[text()='Search Product for: "+prodName+"']"));
        element.sendKeys(Keys.ENTER);
    }
}
