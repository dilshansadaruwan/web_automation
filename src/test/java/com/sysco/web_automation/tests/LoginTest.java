package com.sysco.web_automation.tests;


import com.sysco.web_automation.data.LoginData;
import com.sysco.web_automation.functions.Login;
import com.sysco.web_automation.utils.ExcelUtil;
import com.sysco.web_automation.utils.TestBase;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test
    public void testLogin() {

        Login.loadLoginPage();
        Assert.assertTrue(Login.isHomePageLoaded());


    }

    @AfterClass
    public void closeBrowser(){
        Login.closeBrowser();
    }
}