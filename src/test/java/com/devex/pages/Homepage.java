package com.devex.pages;

import com.devex.utilities.BrowserUtils;
import com.devex.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{

    @FindBy(css="[href='/login']")
    public WebElement loginBttn;
    @FindBy(id = "rcc-confirm-button")
    public WebElement cociesBtn;

    public void klickToLoginBn(){
        BrowserUtils.clickWithJS(loginBttn);
    }

    public void clickToCocies(){
        BrowserUtils.clickWithJS(cociesBtn);
    }
}
