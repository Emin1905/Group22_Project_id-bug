package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPageKayala {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInputBox;

    @FindBy(xpath = "//input[@id='o_field_input_3922']")
    public WebElement companyRadioBox;
}



