package tests;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DynamicButtonPage;

public class DynamicButtonTest extends BaseTest {

    @Test
    public void verifyDynamicButton() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,2200)");

        DynamicButtonPage page =
                new DynamicButtonPage(driver);

        page.clickStartButton();

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10));

        wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                org.openqa.selenium.By.xpath(
                    "//button[text()='STOP']")));

        Assert.assertTrue(
                page.isStopButtonDisplayed());

        System.out.println(
                "Dynamic Button Successful");
    }
}