package com.courses.ultimateqa.pages;

import com.courses.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[normalize-space()='Welcome Back!']");

    By emailField =  By.id("user[email]");

    By passwordField = By.id("user[password]");

    By signinButton = By.xpath("//input[@type='submit']");

    By errorMessage = By.xpath("//li[@class='form-error__list-item']");
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);

    }
public void enterEmailId(String email){
        sendTextToelement(emailField,email);
}
    public void enterPassword(String password){
        sendTextToelement(passwordField,password);
    }

    public void clickOnSigninButton(){
        clickElement(signinButton);


    }
    public String verifyErrorMessage(){
    return getTextFromElement(errorMessage);
    }




}
