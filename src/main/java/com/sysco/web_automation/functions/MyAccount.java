package com.sysco.web_automation.functions;

import com.sysco.web_automation.pages.MyAccountPage;


public class MyAccount {

    public static MyAccountPage myAccountPage = new MyAccountPage();

    public static void goToMyAccountLoginPage(){
        myAccountPage.loadAccountPage();

    }

    public static void logInToMyAccount(String email,String pwd){
        myAccountPage.enterEmail(email);
        myAccountPage.enterPassword(pwd);
        myAccountPage.clickLogIn();


    }

    public static void clearEmailTextBox(){
        myAccountPage.clearEmail();
    }

    public static void clearPasswordTextBox(){
        myAccountPage.clearPassword();
    }

    public static boolean isEmailValidationDisplayed(){
        return myAccountPage.isEmailValidationDisplayed();
    }

    public static boolean isPasswordValidationDisplayed(){
        return myAccountPage.isPasswordValidationDisplayed();
    }

    public static boolean isWelcomeMessageDispalyed(){

        return myAccountPage.isWelcomemesageDispalyed();
    }
}
