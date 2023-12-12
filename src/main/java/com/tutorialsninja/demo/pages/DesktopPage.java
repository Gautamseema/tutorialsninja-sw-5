package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']//select[@id='input-sort']")
    WebElement positionZtoA;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement allProductName;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currency;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionAtoZ;
    @CacheLookup
    @FindBy(id = "input-limit")
    WebElement enterQty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart1;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Model']")
    WebElement model;
    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Total')]")
    WebElement total;





    public void mouseHoverOnDesktopLinkAndClick() {
        mouseHoverToElementAndClick(desktopLink);
        CustomListeners.test.log(Status.PASS, "mouseHover on deskToplink and click");

    }

    public void clickOnShowAllDesktops() {
        clickOnElement(showAllDesktops);
        CustomListeners.test.log(Status.PASS, "click on AllDesktops");
    }

    public void selectPositionByZtoA() {
        selectByVisibleTextFromDropDown(positionZtoA, "Name(ZtoA)");
        CustomListeners.test.log(Status.PASS, "select position ByZtoA");

    }

    public String getAllProductNameText() {
        String message = getTextFromElement(allProductName);
        CustomListeners.test.log(Status.PASS, "VerifyDescendingOrder");
        return message;

    }
    public void MouseHoverOnCurrencyDropdownAndClick(){
        selectByVisibleTextFromDropDown(currency,"Euro");
        CustomListeners.test.log(Status.PASS,"SelectCurrency");
    }
    public void selectPositionByAtoZ() {
        CustomListeners.test.log(Status.PASS, "select Position By AtoZ");
        selectByVisibleTextFromDropDown(positionAtoZ, "Name (A - Z)");
    }
    public void enterQuantity() {
        CustomListeners.test.log(Status.PASS, " enterQuantity");
        sendTextToElement(enterQty, "");
    }
    public void clickOnAddToCart() {
        CustomListeners.test.log(Status.PASS, "click on add to cart");
        clickOnElement(addToCart);
    }
    public String getSuccessText() {
        CustomListeners.test.log(Status.PASS, "get success text");
        return getTextFromElement(successMessage);

    }
    public String clickOnShoppingCart(){
        CustomListeners.test.log(Status.PASS, "click on shopping cart");
        return getTextFromElement(shoppingCart1);

    }
    public void clickOnShoppingCart1() {
        CustomListeners.test.log(Status.PASS, "click on shopping cart");
        clickOnElement(shoppingCart);
    }
    public String verifyProductName() {
        CustomListeners.test.log(Status.PASS, "verify ProductName");
        return getTextFromElement(productName);

    }
    public String verifyModel(){
        CustomListeners.test.log(Status.PASS, "verify Model");
        return getTextFromElement(model);

    }
    public String verifyTotal(){
        CustomListeners.test.log(Status.PASS, "verify Total");
        return getTextFromElement(total);
    }

}
