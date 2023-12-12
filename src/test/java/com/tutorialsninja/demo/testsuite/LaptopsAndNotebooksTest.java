package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.LaptopsAndNoteBookPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LaptopsAndNotebooksTest extends BaseTest {
    LaptopsAndNoteBookPage laptopAndNoteBookPage;



    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        laptopAndNoteBookPage = new LaptopsAndNoteBookPage();

    }


    @Test(groups= {"sanity" ,"smoke" , "regression" })
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        laptopAndNoteBookPage.mouseHoverOnDesktopLinkAndClick();

        //1.2 Click on “Show All Laptops & Notebooks”
        laptopAndNoteBookPage.clickOnShowAllLaptopsAndNotebooks();

        //1.3 Select Sort By "Price (High > Low)"
        laptopAndNoteBookPage.selectPriceHighToLow();


    }
    @Test(groups= {"smoke" , "regression" })
    public void verifyThatUserPlaceOrderSuccessfully() {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        laptopAndNoteBookPage.clickOnMacBook();
        //2.2 Click on “Show All Laptops & Notebooks”
        laptopAndNoteBookPage. clickOnAddOnCart();

        //2.3 Select Sort By "Price (High > Low)"
        laptopAndNoteBookPage.selectPriceHighToLow();
        //2.4 Select Product “MacBook”
        laptopAndNoteBookPage.getMacBookText();
        //2.5 Verify the text “MacBook”
        String expectedErrorMessage0 = "MacBook";
        String actualErrorMessage0 = laptopAndNoteBookPage.getMacBookText();
        Assert.assertEquals(expectedErrorMessage0, actualErrorMessage0, "MacBook");

        //2.6 Click on ‘Add To Cart’ button
        laptopAndNoteBookPage.clickOnShoppingCart() ;
        // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedErrorMessage8 = "Success: You have added MacBook to your shopping cart!";
        String actualErrorMessage8 = laptopAndNoteBookPage.getShoppingCartText();
        Assert.assertEquals(expectedErrorMessage8, actualErrorMessage8, "Success: You have added MacBook to your shopping cart!");

        //2.8 Click on link “shopping cart” display into success message

        //2.9 Verify the text "Shopping Cart"
        String expectedErrorMessage7 = "Shopping Cart";
        String actualErrorMessage7 = laptopAndNoteBookPage.getShoppingCartText();
        Assert.assertEquals(expectedErrorMessage7, actualErrorMessage7, "Shopping Cart");


        //2.10 Verify the Product name "MacBook"
        String expectedErrorMessage6 = "MacBook";
        String actualErrorMessage6 = laptopAndNoteBookPage.getTotalText();
        Assert.assertEquals(expectedErrorMessage6, actualErrorMessage6, "MacBook");



        //2.11 Change Quantity "2"
        laptopAndNoteBookPage. clearAndAddQuantity(" 2");

        // 2.12 Click on “Update” Tab
        laptopAndNoteBookPage.clickOnUpdate();
        // 2.13 Verify the message “Success: You have modified your shopping cart!”
        String expectedErrorMessage5 = "Success: You have modified your shopping cart!";
        String actualErrorMessage5 = laptopAndNoteBookPage.getTotalText();
        Assert.assertEquals(expectedErrorMessage5, actualErrorMessage5, "Success: You have modified your shopping cart!");

        //2.14 Verify the Total £737.45
        String expectedErrorMessage4 = "£737.45";
        String actualErrorMessage4 = laptopAndNoteBookPage.getNewCustomerText();
        Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4, "Verify the Total £737.45");

        //2.15 Click on “Checkout” button
        laptopAndNoteBookPage.clickOnCheckOut();
        //2.16 Verify the text “Checkout”
        String expectedErrorMessage1 = "Checkout";
        String actualErrorMessage1 = laptopAndNoteBookPage.getNewCustomerText();
        Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1, " Verify the text “Checkout”");

        //2.17 Verify the Text “New Customer”
        String expectedErrorMessage = "New Customer";
        String actualErrorMessage = laptopAndNoteBookPage.getNewCustomerText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "New Customer");
        //2.18 Click on “Guest Checkout” radio button
        laptopAndNoteBookPage.getGuestCheckoutText();
        //2.19 Click on “Continue” tab
        laptopAndNoteBookPage.clickOnContinueButton();

        //2.20 Fill the mandatory fields
        laptopAndNoteBookPage.enterFirstName("Maya");
        laptopAndNoteBookPage.enterLastName("max");
        laptopAndNoteBookPage.enterAddress1("10 Haines Way");
        laptopAndNoteBookPage.enterPostCode("WD25 7QU");
        laptopAndNoteBookPage.enterCity("Watford");
        laptopAndNoteBookPage.enterPhoneNumber("0866904391");
        laptopAndNoteBookPage.enterEmail("MayaMax@gmail.com");
        laptopAndNoteBookPage.enterComments(" ");
        laptopAndNoteBookPage.selectRegion(" ");
        laptopAndNoteBookPage.selectCountry("United Kingdom");
        //2.21 Click on “Continue” Button
        laptopAndNoteBookPage.clickOnGuestContinue();
        //2.22 Add Comments About your order into text area
        laptopAndNoteBookPage.clickOnAgree();
        //2.23 Check the Terms & Conditions check box
        laptopAndNoteBookPage.clickOnLastContinueCheckOutButton();
        //2.24 Click on “Continue” button
        laptopAndNoteBookPage.clickOnContinueButton();
        // 2.25 Verify the message “Warning: Payment method required!”
        String expectedErrorMessage3 = "Product price will arrange in High to Low order";
        String actualErrorMessage3 = laptopAndNoteBookPage.verifyPaymentWarningText();
        Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3, "Warning: Payment method required!");
}


}
