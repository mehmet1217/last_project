package com.devex.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{

    @FindBy(css="[href='/login']")
    public WebElement loginBttn;


}
