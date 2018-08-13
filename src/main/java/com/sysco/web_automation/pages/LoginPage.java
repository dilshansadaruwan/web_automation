package com.sysco.web_automation.pages;


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
