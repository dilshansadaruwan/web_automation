package com.sysco.web_automation.tests;

import com.sysco.web_automation.functions.Login;
import com.sysco.web_automation.functions.MyAccount;
import com.sysco.web_automation.functions.AgeVerification;
import com.sysco.web_automation.tests.AgeVerficationTest;
import com.syscolab.qe.core.reporting.SyscoLabListener;
import fitnesse.slim.test.Sleep;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(SyscoLabListener.class)

public class MyAccountTest {

    private MyAccount myAccount = new MyAccount();

    @BeforeClass
    public void loadMyAccountPage(ITestContext iTestContext) {
        Login.loadLoginPage();
        Assert.assertTrue(Login.isHomePageLoaded());
        AgeVerification.enterBirthDay("12","August","1988");
        Assert.assertTrue(AgeVerification.isHomePageBannerDisplayed());

    }

    @Test(description = "Verify user can go to My Account login page",alwaysRun = true)
    public void testMyAccountLoginPageLoad(){
        myAccount.goToMyAccountLoginPage();

    }

    @Test(description = "Verify email validation message",dependsOnMethods = "testMyAccountLoginPageLoad",alwaysRun = true)
    public void testEmailValidation(){
        myAccount.logInToMyAccount("","12345678");
        Assert.assertTrue(myAccount.isEmailValidationDisplayed());
    }

    @Test(description = "Verify password validation message",dependsOnMethods = "testEmailValidation",alwaysRun = true)
    public void testPasswordValidation(){
        myAccount.clearPasswordTextBox();
        myAccount.logInToMyAccount("williamjacob802@gmail.com","");
        Assert.assertTrue(myAccount.isPasswordValidationDisplayed());
    }


    @Test(description = "Verfiy user can log in to the My Account",dependsOnMethods = "testPasswordValidation",alwaysRun = true)
    public void testMyaccountLogin(){
        myAccount.clearEmailTextBox();
        myAccount.clearPasswordTextBox();
        myAccount.logInToMyAccount("williamjacob802@gmail.com","12345678");
        Assert.assertTrue(myAccount.isWelcomeMessageDispalyed());
    }

    @AfterClass
    public void closeBrowser(){
        Login.closeBrowser();
    }






}
