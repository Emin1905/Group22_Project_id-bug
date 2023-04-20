package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPageKayala {

    @FindBy(id="login")
    public WebElement usernameInputBox;

    @FindBy(name="password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement homePageText;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginOrPasswordMessage;


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement usernameButtonOnHomePage;


    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logoutButton;


    public SalesPageKayala() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-menu-xmlid='sale.sale_menu_root']")
    public WebElement salesButton;

    @FindBy(xpath = "//a[@href='/web#menu_id=447&action=48']")
    public WebElement customersButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;


}

