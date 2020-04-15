package com.letscodeit.learn.testbase;

import com.letscodeit.learn.basepage.BasePage;
import com.letscodeit.learn.browserselector.BrowserSelector;
import com.letscodeit.learn.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.LoggingAssert;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();
    //String baseUrl = "https://learn.letskodeit.com/";
    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @BeforeMethod(groups = {"Sanity","Smoke","Regression"})
    public void openBrowser() throws InterruptedException {
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"Sanity","Smoke","Regression"})
    public void tearDown(){
        driver.quit();
    }
}



