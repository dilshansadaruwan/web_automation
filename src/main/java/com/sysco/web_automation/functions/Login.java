package com.sysco.web_automation.functions;

import com.sysco.web_automation.common.Constants;
import com.sysco.web_automation.pages.LoginPage;
import com.sysco.web_automation.utils.DriverSetUpUtil;
import com.syscolab.qe.core.ui.SyscoLabCapabilityUtil;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Login  {

    public static LoginPage ogmLoginPage = new LoginPage();


    public static void loadLoginPage() {
        DriverSetUpUtil.setToRunLocally();
        DesiredCapabilities capabilities = null;
        ogmLoginPage.loadLoginPage(capabilities, Constants.APP_URL);



    }

    public static void closeBrowser(){
        ogmLoginPage.closeBrowser();
    }


     public static boolean isHomePageLoaded() {
       return ogmLoginPage.isHomePageLoaded();
   }
}
