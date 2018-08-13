package com.sysco.web_automation.tests;

import com.sysco.web_automation.functions.AgeVerification;
import com.syscolab.qe.core.reporting.SyscoLabListener;
import org.junit.Before;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.sysco.web_automation.functions.Login;
import com.sysco.web_automation.functions.AgeVerification;
import org.testng.asserts.SoftAssert;

@Listeners(SyscoLabListener.class)

public class AgeVerficationTest {

    private AgeVerification ageVerification = new AgeVerification();


    @BeforeClass
    public void loadPage(ITestContext iTestContext) {
        Login.loadLoginPage();
        Assert.assertTrue(Login.isHomePageLoaded());
    }

    @Test(description = "Verify age less than 18 message",alwaysRun = true)
    public void testAgeLessThan18(){

        ageVerification.enterBirthDay("12","August","2003");
        String errorMessage = ageVerification.getErrorMessage();
        Assert.assertEquals(errorMessage,"Sorry, your age or location does not permit you to enter at this time.");


    }

    @Test(description = "Verify legal age users are navigated to home page", dependsOnMethods = "testAgeLessThan18",alwaysRun = true)
    public  void testAgeMoreThan18(){

        ageVerification.enterBirthDay("12","August","1990");
        Assert.assertTrue(ageVerification.isHomePageBannerDisplayed());



    }

    @AfterClass
    public void closeBrowser(){
        Login.closeBrowser();
    }

}
