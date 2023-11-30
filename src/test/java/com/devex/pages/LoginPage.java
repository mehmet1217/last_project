package com.devex.pages;

import com.devex.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "loginpage-input-email")
    public WebElement emailFeld;

    @FindBy(name = "password")
    public WebElement passwordFeld;

    @FindBy(css = "[type='submit']")
    public WebElement loginSubmitBtn;

    public void login(String email, String password){
        emailFeld.sendKeys(email);
        passwordFeld.sendKeys(password);
        loginSubmitBtn.click();
    }
}
