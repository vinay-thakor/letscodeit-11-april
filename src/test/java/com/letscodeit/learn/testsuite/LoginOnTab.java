package com.letscodeit.learn.testsuite;

import com.letscodeit.learn.loadproperty.LoadProperty;
import com.letscodeit.learn.pages.HomePage;
import com.letscodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginOnTab extends TestBase {
    //create an object to used of HomePage
    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();


    @Test(priority = 0,groups = {"Smoke","Sanity","Regression"})
    //this method test get the reult below
    public void UserShouldNavigateToEnrollAndSignUpSucessfully(){
            homePage.mouseHoverOnEnrollNow();
            homePage.clickOnLoginTab();

    }
    @Test(priority = 1,groups = {"Regression","Smoke"})
    public void USerShouldNotClickOnPracticeTab(){
        homePage.clickOnPracticeTab();
    }
}

