package com.sysco.web_automation.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MyAccountPage extends PageBase {

private By btnMyAccount = By.className("links-acc");
private By lblMyAccountPageTitle = By.className("page-title");
private By txtEmail = By.id("email");
private By txtPassword = By.id("pass");
private By btnLogIn = By.id("send2");
private By lblEmailValidationText = By.id("advice-required-entry-email");
private By lblPasswordValidationText = By.id("advice-required-entry-pass");
private By lblWelcomeMessage = By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[1]/h2");


public void loadAccountPage(){
    syscoLabUI.sleep(10);
    syscoLabUI.click(btnMyAccount);
    Assert.assertTrue(syscoLabUI.isDisplayed(lblMyAccountPageTitle));
}

public void enterEmail(String email){
    syscoLabUI.sendKeys(txtEmail,email);

}

public void enterPassword(String password){
    syscoLabUI.sendKeys(txtPassword,password);
}

public void clickLogIn(){
    syscoLabUI.click(btnLogIn);
}

public void clearEmail(){
    syscoLabUI.clear(txtEmail);
}

public void clearPassword(){
    syscoLabUI.clear(txtPassword);
}

public boolean isEmailValidationDisplayed(){
    return syscoLabUI.isDisplayed(lblEmailValidationText);
}

public boolean isPasswordValidationDisplayed(){
    return syscoLabUI.isDisplayed(lblPasswordValidationText);
}



public boolean isWelcomemesageDispalyed(){
    syscoLabUI.waitTillElementLoaded(lblWelcomeMessage);
    return syscoLabUI.isDisplayed(lblWelcomeMessage);
}











}
