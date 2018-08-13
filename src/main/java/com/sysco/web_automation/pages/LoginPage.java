package com.sysco.web_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

import org.openqa.selenium.By;
public class LoginPage extends PageBase{

    private By lbAgePageHeader = By.id("age_content");

    public void closeBrowser(){
        syscoLabUI.driver.quit();
    }

    public  boolean isHomePageLoaded() {
     return syscoLabUI.isDisplayed(lbAgePageHeader);
    }
}
