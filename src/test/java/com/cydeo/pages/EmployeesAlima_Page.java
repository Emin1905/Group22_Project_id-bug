package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesAlima_Page {
    public EmployeesAlima_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(css = "div[class='clearfix oe_login_buttons'] button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[16]/a/span")

    public WebElement employeesButton;
    @FindBy (css = "div>button[accesskey='c']")
    public WebElement createButton;

    @FindBy (className = "o_form_sheet")
    public WebElement EmployeesNameForm;
    @FindBy (css = "div>button[accesskey='s']")
    public WebElement saveButton;
     @FindBy (css = "div[class= 'o_notification undefined o_error']")
    public WebElement errorMsg;

     @FindBy (css = "h1>input[class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement nameBox;

     @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/div[2]/div")
    public WebElement message;
     @FindBy (className = "o_searchview_input")
    public  WebElement searchBox;
     @FindBy(css = "div[class='o_searchview']>span")
    public WebElement searchButton;
     @FindBy(css = "div[class='o_kanban_view o_hr_employee_kanban o_kanban_ungrouped']")
    public WebElement createdUser;



}
