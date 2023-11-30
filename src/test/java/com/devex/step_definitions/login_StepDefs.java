package com.devex.step_definitions;

import com.devex.pages.DashboardPage;
import com.devex.pages.Homepage;
import com.devex.pages.LoginPage;
import com.devex.utilities.ConfigurationReader;
import com.devex.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_StepDefs {
    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the loginpage")
    public void the_user_is_on_the_loginpage() {
        Assert.assertEquals(ConfigurationReader.get("url"), Driver.get().getCurrentUrl());
    }

    @When("The user enters vallid mail adresse {string}")
    public void the_user_enters_vallid_mail_adresse(String email) {
        loginPage.emailFeld.sendKeys(email);
    }
    @When("The user enters vallid password {string}")
    public void the_user_enters_vallid_password(String password) {
        loginPage.passwordFeld.sendKeys(password);
    }
    @When("The user click submit button")
    public void the_user_click_submit_button() {
        loginPage.loginSubmitBtn.click();
    }
    @Then("The user should be see message {string} on the dashboard page")
    public void the_user_should_be_see_message_on_the_dashboard_page(String message) {
        Assert.assertEquals(message, dashboardPage.userMessage.getText());
    }


}
