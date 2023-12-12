package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNoteBookPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement LaptopsAndNotebooks;

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement ShowAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement priceHighToLow;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement MacBook;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement MacBookText;
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement AddToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement SuccessShoppingText;

    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement shoppingcart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement ShoppingCartText;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement MacBookText1;
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group btn-block']/input[@type='text']")
    WebElement quantityBox;
    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-refresh']")
    WebElement refreshButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successMessageRefresh;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]")
    WebElement TotalText;
    @CacheLookup
    @FindBy(linkText = "Checkout")
    WebElement Checkout;

    @CacheLookup
    @FindBy(linkText = "Checkout")
    WebElement CheckoutText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Guest Checkout']")
    WebElement GuestCheckoutText;
    @CacheLookup
    @FindBy (xpath = "//input[@id='button-account']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy (xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy (xpath = "//input[@id='input-payment-telephone'")
    WebElement telephone ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1")
    WebElement address1;
    @CacheLookup
    @FindBy (xpath = "/input[@id='input-payment-city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy (xpath = "//select[@id='input-payment-country']")
    WebElement country;
    @CacheLookup
    @FindBy (xpath = "/select[@id='input-payment-zone']")
    WebElement region;
    @CacheLookup
    @FindBy (xpath = "//input[@id='button-guest']")
    WebElement guestContinueButton;

    @CacheLookup
    @FindBy (xpath = "//textarea[@name='comment']")
    WebElement comments;

    @CacheLookup
    @FindBy (xpath = "//input[@type='checkbox']")
    WebElement continueButtonLast;

    @CacheLookup
    @FindBy(xpath = "//input[@name = 'agree']")
    WebElement agree;
    @CacheLookup
    @FindBy (xpath = "//div[@class='alert alert-warning alert-dismissible']")
   WebElement warningText;

    public void mouseHoverOnDesktopLinkAndClick() {
        mouseHoverToElementAndClick(LaptopsAndNotebooks);
        CustomListeners.test.log(Status.PASS, "mouseHover on LaptopsAndNotebooks and click");
    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        clickOnElement(ShowAllLaptopsAndNotebooks);
        CustomListeners.test.log(Status.PASS, "mouseHover on ShowAllLaptopsAndNotebooks and click");
    }

    public void selectPriceHighToLow() {
        selectByVisibleTextFromDropDown(priceHighToLow, "PriceHighToLow");
        CustomListeners.test.log(Status.PASS, "select Price");
    }


    public void clickOnMacBook() {
        CustomListeners.test.log(Status.PASS, "click on macbook");
        clickOnElement(MacBook);
    }

    public String getMacBookText() {
        String message = getTextFromElement(MacBookText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }

    public void clickOnAddOnCart() {
        CustomListeners.test.log(Status.PASS, "click on add on cart");
        clickOnElement(AddToCart);
    }

    public String getSuccessShoppingText() {
        String message = getTextFromElement(SuccessShoppingText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }

    public void clickOnShoppingCart() {
        CustomListeners.test.log(Status.PASS, "click on shopping Cart");
        clickOnElement(shoppingcart);
    }

    public String getShoppingCartText() {
        String message = getTextFromElement(ShoppingCartText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }

    public String getMacBookText1() {
        String message = getTextFromElement(MacBookText1);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }

    public void clearAndAddQuantity(String quantity) {
        quantityBox.clear();
        sendTextToElement(quantityBox, quantity);
        CustomListeners.test.log(Status.PASS, "add quantity");
    }

    public void clickOnUpdate() {
        clickOnElement(refreshButton);
        CustomListeners.test.log(Status.PASS, "click on refreshButton");
    }

    public Boolean isSuccessMessageAppearing(String message) {
        CustomListeners.test.log(Status.PASS, "check whether success message appears as expected");
        return getTextFromElement(successMessageRefresh).contains("Success: You have modified your shopping cart!");
    }

    public String getTotalText() {
        String message = getTextFromElement(TotalText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }

    public void clickOnCheckOut() {
        clickOnElement(Checkout);
        CustomListeners.test.log(Status.PASS, "click on checkout Button");
    }

    public String getCheckOutText() {
        String message = getTextFromElement(CheckoutText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }

    public String getNewCustomerText() {
        String message = getTextFromElement(newCustomerText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }

    public String getGuestCheckoutText() {
        String message = getTextFromElement(GuestCheckoutText);
        CustomListeners.test.log(Status.PASS, "Message is not displayed");
        return message;
    }
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "click on continue Button");
    }

    public void enterFirstName(String firstNme) {
        sendTextToElement(firstName, firstNme);
        CustomListeners.test.log(Status.PASS, "enter on emailField");
    }

    public void enterLastName(String lastnme) {
        sendTextToElement(lastName, lastnme);
        CustomListeners.test.log(Status.PASS, "enter on lastname");
    }

    public void enterEmail(String value) {
        sendTextToElement(email, value);
        CustomListeners.test.log(Status.PASS, "enter on emailField");
    }

    public void enterPhoneNumber(String value) {
        sendTextToElement(telephone, value);
        CustomListeners.test.log(Status.PASS, "enter telephone");
    }

    public void enterAddress1(String value) {
        sendTextToElement(address1, value);
        CustomListeners.test.log(Status.PASS, "enter address1");
    }

    public void enterCity(String value) {
        sendTextToElement(city, value);
        CustomListeners.test.log(Status.PASS, "enter city");
    }

    public void enterPostCode(String value) {
        sendTextToElement(postcode, value);
        CustomListeners.test.log(Status.PASS, "enter postcode");
    }

    public void selectCountry(String value) {
        selectByVisibleTextFromDropDown(country, value);
        CustomListeners.test.log(Status.PASS, "select country");
    }

    public void selectRegion(String value) {
        selectByVisibleTextFromDropDown(region, value);
        CustomListeners.test.log(Status.PASS, "select region");
    }

    public void clickOnLastContinueCheckOutButton() {
        clickOnElement(continueButtonLast);
        CustomListeners.test.log(Status.PASS, "click on continue button");
    }

    public void enterComments(String value) {
        sendTextToElement(comments, value);
        CustomListeners.test.log(Status.PASS, "enter comment");
    }

    public void clickOnAgree() {
        clickOnElement(agree);
        CustomListeners.test.log(Status.PASS, "click on agree");
    }

    public void clickOnGuestContinue() {
        clickOnElement(guestContinueButton);
        CustomListeners.test.log(Status.PASS, "click on lastname");
    }


    public String verifyPaymentWarningText() {
        return getTextFromElement(warningText);

}

}