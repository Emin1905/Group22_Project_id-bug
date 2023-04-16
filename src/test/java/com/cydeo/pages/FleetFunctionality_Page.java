package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetFunctionality_Page {

    public FleetFunctionality_Page(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    //We can start locating web elements using @FindBy annotation
    @FindBy(id = "login")
    public WebElement emailSearchBox;


    @FindBy(id = "password")
    public WebElement passwordSearchbox;


    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;


    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginPasswordMessage;


    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement HomePageText;

    @FindBy(xpath = "//span[contains(text(), 'Vehicles Contracts')]")
    public WebElement vehiclesContractsPage;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement vehiclesContractsCreateButton;

    @FindBy(xpath = "//b[@class='caret']")
    public WebElement menuMore;

    @FindBy(xpath = "//a[@data-menu-xmlid='fleet.menu_root']")
    public WebElement fleetPageInMenuMore;

    @FindBy(xpath = "//input[@id='o_field_input_74']")
    public WebElement vehicleChoice;

    @FindBy(xpath = "//a[.='Bmw/Serie 1/1-BMW-001']")
    public WebElement bmwOption;

    @FindBy(xpath = "//input[@id='o_field_input_75']")
    public WebElement typeChoice;

    @FindBy(xpath = "//a[.='Leasing']")
    public WebElement leasingChoice;

    @FindBy(xpath = "//input[@id='o_field_input_76']")
    public WebElement activationCost;

    @FindBy(xpath = "//select[@id='o_field_input_78']")
    public WebElement recurringCostAmount;

    @FindBy(xpath = "//input[@id='o_field_input_77']")
    public WebElement recurringCostInput;




}
