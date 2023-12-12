package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class DesktopPageTest extends BaseTest {
    @Test
    public void m1(){

    }
    DesktopPage desktopPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        desktopPage = new DesktopPage();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Mouse hover on Desktops Tab. and click
        desktopPage.mouseHoverOnDesktopLinkAndClick();
        //1.2 Click on “Show All Desktops”
        desktopPage.clickOnShowAllDesktops();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.selectPositionByZtoA();
        //1.4 Verify the Product will arrange in Descending order.
        String expectedErrorMessage = "Product will arrange Descending order";
        String actualErrorMessage = desktopPage.getAllProductNameText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, " ProductDescendingOrder");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully(String product, String qty, String successMessage, String productName, String model, String total) {
        //2.1 Mouse hover on Currency Dropdown and click
        desktopPage.MouseHoverOnCurrencyDropdownAndClick();
        // 2.2 Mouse hover on £Pound Sterling and click
        desktopPage.MouseHoverOnCurrencyDropdownAndClick();
        //2.3 Mouse hover on Desktops Tab.
        desktopPage.mouseHoverOnDesktopLinkAndClick();
        //2.4 Click on “Show All Desktops”
        desktopPage.clickOnShowAllDesktops();
        //2.5 Select Sort By position "Name: A to Z"
        desktopPage.selectPositionByAtoZ();
        //2.6 Select product <product>
        desktopPage.clickOnShowAllDesktops();
        //2.7 Enter Qty <qty> using Select class.
        desktopPage.enterQuantity();
        //2.8 Click on “Add to Cart” button
        desktopPage.clickOnAddToCart();
        //2.9 Verify the Message <successMessage>
        String expectedErrorMessage1 = "successMessage";
        String actualErrorMessage1 = desktopPage.getSuccessText();
        Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1, " successMessage");

        //2.10 Click on link “shopping cart” display into success message
        desktopPage.clickOnShoppingCart1();
        //2.11 Verify the text "Shopping Cart"
        String expectedErrorMessage2 = "Shopping Cart";
        String actualErrorMessage2 = desktopPage.clickOnShoppingCart();
        Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2, " Shopping Cart");

        //2.12 Verify the Product name <productName>
        String expectedErrorMessage3 = "Product name";
        String actualErrorMessage3 = desktopPage.verifyProductName();
        Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3, " Product name");


        //2.13 Verify the Model <model>
        String expectedErrorMessage4 = "model";
        String actualErrorMessage4 = desktopPage.verifyModel();
        Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4, " Model");


        //2.14 Verify the Total <total>
        String expectedErrorMessage5 = "total";
        String actualErrorMessage5 = desktopPage.verifyTotal();
        Assert.assertEquals(expectedErrorMessage5, actualErrorMessage5, " Total");


}

}
