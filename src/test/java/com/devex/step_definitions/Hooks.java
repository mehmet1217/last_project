package com.devex.step_definitions;

import com.devex.pages.Homepage;
import com.devex.utilities.ConfigurationReader;
import com.devex.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    Homepage homepage = new Homepage();

    @Before
    public void setUp(){
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        homepage.clickToCocies();
        Driver.get().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

}
