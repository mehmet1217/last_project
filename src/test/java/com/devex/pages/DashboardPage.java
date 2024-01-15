package com.devex.pages;

import com.devex.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(id="dashboard-p1")
    public WebElement userMessage;
    @FindBy(xpath = "//a[text()='Edit Profile']")
    public WebElement editProfile;
    @FindBy(id="editprofile-intro-text")
    public WebElement messageEditProfile;
    @FindBy(id="addexperience-text")
    public WebElement messageExperience;
    @FindBy(id="addecutaion-text")
    public WebElement messageAddEducation;
    @FindBy(xpath = "//p[@class='lead']")
    public WebElement messageAll;
    public void clicktoMenu(String menu){
        Driver.get().findElement(By.xpath("//a[text()='"+menu+"']")).click();
    }

}
