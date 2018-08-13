package com.sysco.web_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBase {

    protected static SyscoLabWUI syscoLabUI;
    protected static RemoteWebDriver webDriver;


    public void loadLoginPage(Capabilities capabilities, String url) {
        syscoLabUI = new SyscoLabWUI(capabilities);
        syscoLabUI.navigateTo(url);
        syscoLabUI.driver.manage().window().maximize();

    }
}
