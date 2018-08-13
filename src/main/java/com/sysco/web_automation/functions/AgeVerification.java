package com.sysco.web_automation.functions;

import com.sysco.web_automation.pages.AgeVerificationPage;

public class AgeVerification {

    private static AgeVerificationPage ageVerificationPage = new AgeVerificationPage();


    public static void enterBirthDay(String Day,String Month,String Year){
        ageVerificationPage.waitTillPageLoad();
        ageVerificationPage.selectDay(Day);
        ageVerificationPage.selectMonth(Month);
        ageVerificationPage.selectYear(Year);
        ageVerificationPage.clickEnterBtn();

    }

    public static String getErrorMessage(){
        return ageVerificationPage.getErrorMessage();
    }

    public static boolean isHomePageBannerDisplayed(){
        return ageVerificationPage.isBannerDisplayed();
    }
}
