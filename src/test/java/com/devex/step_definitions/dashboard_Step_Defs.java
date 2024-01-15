package com.devex.step_definitions;

import com.devex.pages.DashboardPage;
import com.devex.pages.LoginPage;
import com.devex.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class dashboard_Step_Defs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboard = new DashboardPage();


    @Given("Der Benutzer ist sich in die Webseite angemeldet")
    public void der_benutzer_ist_sich_in_die_webseite_angemeldet() {
       loginPage.login1();
    }

    @Then("Der Benutzer soll {string} zufolge {string} lesen")
    public void derBenutzerSollZufolgeLesen(String menu, String message) {
        dashboard.clicktoMenu(menu);
        Assert.assertEquals(message,dashboard.messageAll.getText());
    }
}
