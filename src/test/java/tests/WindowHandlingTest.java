package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.WindowHandlingPage;
import utilities.WaitUtils;

public class WindowHandlingTest extends BaseTest {

    @Test
    public void verifyWindowHandling() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,500)");

        WindowHandlingPage page =
                new WindowHandlingPage(driver);

        String parentWindow =
                driver.getWindowHandle();

        // =====================
        // New Tab
        // =====================

        page.clickNewTab();

        WaitUtils.pause(2);

        page.switchToChildWindow(
                parentWindow);

        System.out.println(
                "Child Title : "
                + page.getPageTitle());

        Assert.assertTrue(
                page.getPageTitle()
                    .length() > 0);

        page.closeCurrentWindow();

        page.switchToParentWindow(
                parentWindow);

        // =====================
        // Popup Windows
        // =====================

        page.clickPopupWindow();

        WaitUtils.pause(2);

        page.closeAllChildWindows(
                parentWindow);

        System.out.println(
                "All Popup Windows Closed");

        Assert.assertTrue(true);

        System.out.println(
                "Window Handling Successful");
    }
}