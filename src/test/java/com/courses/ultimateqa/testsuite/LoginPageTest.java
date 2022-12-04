package com.courses.ultimateqa.testsuite;

import com.courses.ultimateqa.pages.HomePage;
import com.courses.ultimateqa.pages.LoginPage;
import com.courses.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

 HomePage homepage = new HomePage();

 LoginPage loginpage = new LoginPage();

 @Test
  public void verifyUserShouldNavigateToLoginPageSuccessfully(){

   homepage.clickOnsignLink();
   String expectedText = "Welcome Back!";
   String actualText = loginpage.getWelcomeText();
  Assert.assertEquals(actualText,expectedText,"Welcome Back!");

 }

 @Test

 public void verifyTheErrorMessage(){

  homepage.clickOnsignLink();
  loginpage.enterEmailId("sawan123@gmail.com");
  loginpage.enterPassword("Desai456");
  loginpage.clickOnSigninButton();

  String expectedText = "Invalid email or password.";
  String actualText = loginpage.verifyErrorMessage();
  Assert.assertEquals(actualText,expectedText,"Invalid email or password.");



 }

    }

