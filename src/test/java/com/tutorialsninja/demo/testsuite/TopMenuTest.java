package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.TopMenuPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest  {
    TopMenuPage topMenuPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        topMenuPage = new TopMenuPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        topMenuPage.mouseHoverOnDesktopLinkAndClick();
        // 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        topMenuPage.selectMenu("Show AllDesktops");
        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = topMenuPage.getDesktopsText();
        Assert.assertEquals(actualText, expectedText, "Not navigate to Desktop page");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        topMenuPage.mouseHoverOnLaptopAndNotebooksLinkAndClick();
        // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        topMenuPage.selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        String actualText = topMenuPage.getLaptopsAndNotebooksText();
        Assert.assertEquals(actualText, expectedText, "Not navigate to Laptops & Notebooks page");
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        topMenuPage.mouseHoverOnComponentsLinkAndClick();
        // 3.2 call selectMenu method and pass the menu = “Show All Components”
        topMenuPage.selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = topMenuPage.getComponentsText();
        Assert.assertEquals(actualText, expectedText, "Not navigate to components page");
    }

}
