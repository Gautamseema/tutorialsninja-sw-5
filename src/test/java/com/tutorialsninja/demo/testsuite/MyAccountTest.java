package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.MyAccountPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class MyAccountTest extends BaseTest {
    MyAccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        accountPage = new MyAccountPage();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        accountPage.selectMyOptions("Login");
        //1.3 Verify the text “Register Account”.
        String expectedText = "Returning Customer";
        String actualText = accountPage.verifyTextReturningCustomer();
        Assert.assertEquals(actualText, expectedText, "Error found");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Click on My Account Link.
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        accountPage.selectMyOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        String expectedText = "Returning Customer";
        String actualText = accountPage.verifyTextReturningCustomer();
        Assert.assertEquals(actualText, expectedText, "Error found");
    }
    @Test(groups = {"regression"})
    public void verifyThatUserRegisterAccountSuccessfully() {

        //3.1 Click on My Account Link.
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        accountPage.selectMyOptions("Register");
        //3.3 Enter First Name
        accountPage.enterFirstName("Alex");
        //3.4 Enter Last Name
        accountPage.enterLastName("Bond");
        //3.5 Enter Email
        accountPage.enterEmailId();
        //3.6 Enter Telephone
        accountPage.enterTelephone("078666655567");
        //3.7 Enter Password
        accountPage.enterPassword("AlexB4567");
        //3.8 Enter Password Confirm
        accountPage.enterConfirmPassword("AlexB4567");
        //3.9 Select Subscribe Yes radio button
        accountPage.clickOnYesRadioButton();
        //3.10 Click on Privacy Policy check box
        accountPage.clickOnPrivacyPolicyCheckBox();
        //3.11 Click on Continue button
        accountPage.clickOnContinueButton();
        // 3.12 Verify the message “Your Account Has Been Created!”
        String expectedText = "Your Account Has Been Created!";
        String actualText = accountPage.verifyMessageAccountCreated();
        Assert.assertEquals(actualText, expectedText, "Error message");

        // 3.13 Click on Continue button
        accountPage.clickOnContinueTab();
        // 3.14 Click on My Account Link.
        accountPage.clickOnMyAccountTab();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        accountPage.selectMyOptions("Logout");
        //3.16 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = accountPage.verifyTextAccountLogout();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message");
        //3.17 Click on Continue button
        accountPage.clickOnContinue();
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on My Account Link.
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        accountPage.selectMyOptions("Login");
        //4.3 Enter Email address
        accountPage.enterEmail("AlexBond@gmail.com");
        //4.4 Enter Last Name
        accountPage.enterLastName("Bond");
        //4.5 Enter Password
        accountPage.enterPassword("Abond3456");
        //4.6 Click on Login button
        accountPage.clickOnLoginButton();
        //4.7 Verify text “My Account”
        String expectedText = "My Account";
        String actualText = accountPage.verifyTextMyAccount();
        Assert.assertEquals(actualText, expectedText, "Error message");
        //4.8 Click on My Account Link.
        accountPage.clickOnMyAccount();


        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        accountPage.selectMyOptions("Logout");
        //4.10 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = accountPage.getTextAccountLogout();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message");
        //4.11 Click on Continue button
        accountPage.clickOnContinueLink();
}

}
