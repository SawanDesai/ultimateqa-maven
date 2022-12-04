package com.courses.ultimateqa.pages;

import com.courses.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

By signinLink = By.linkText("Sign In");

public void clickOnsignLink(){
    clickElement(signinLink);

}



}
