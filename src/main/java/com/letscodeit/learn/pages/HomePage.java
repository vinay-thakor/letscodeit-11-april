package com.letscodeit.learn.pages;

import com.letscodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    // find the element and store in the veriable
    By enrollNow = By.linkText("Enroll now");
    By login = By.xpath("//a[@class='navbar-link fedora-navbar-link']");
    By practice = By.className("fedora-navbar-link navbar-");
    //this method will use the above link
    public void mouseHoverOnEnrollNow(){
        mouseHoverToElement(enrollNow);
    }
    public void clickOnLoginTab() {
        clickOnElement(login);
    }
    public void clickOnPracticeTab(){
        clickOnElement(practice);
    }
}
