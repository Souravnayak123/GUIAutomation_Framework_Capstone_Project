package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertPage;
import utilities.WaitUtils;

public class AlertTest extends BaseTest {

    @Test
    public void verifyAlerts() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,500)");

        AlertPage alertPage =
                new AlertPage(driver);

        // Simple Alert

        alertPage.clickSimpleAlert();
        WaitUtils.pause(2);

        alertPage.acceptAlert();

        System.out.println(
                "Simple Alert Handled");
        WaitUtils.pause(2);

        // Confirmation Alert

        alertPage.clickConfirmAlert();
        WaitUtils.pause(2);

        alertPage.dismissAlert();
        WaitUtils.pause(2);

        String confirmMessage =
                alertPage.getResultMessage();

        Assert.assertTrue(
                confirmMessage.contains("Cancel"));

        System.out.println(
                "Confirmation Alert Assertion Passed");

        // Prompt Alert

        alertPage.clickPromptAlert();
        WaitUtils.pause(2);

        alertPage.enterPromptText(
                "Sourav");
        WaitUtils.pause(2);

        String promptMessage =
                alertPage.getResultMessage();

        Assert.assertTrue(
                promptMessage.contains("Sourav"));

        System.out.println(
                "Prompt Alert Assertion Passed");
    }
}
