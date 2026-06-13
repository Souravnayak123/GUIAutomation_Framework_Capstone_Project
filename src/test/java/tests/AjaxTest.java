package tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AjaxPage;
import utilities.WaitUtils;

public class AjaxTest extends BaseTest {

    @Test
    public void verifyAjaxContent() {

        AjaxPage page =
                new AjaxPage(driver);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0,document.body.scrollHeight)");

        WaitUtils.pause(2);

        page.clickHiddenElementsAjaxLink();

        WaitUtils.pause(2);

        page.clickLoadAjaxContent();

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10));

        wait.until(driver ->
                !page.getAjaxContent()
                     .trim()
                     .isEmpty());

        String content =
                page.getAjaxContent();

        System.out.println(
                "AJAX Content : "
                + content);

        Assert.assertFalse(
                content.trim().isEmpty());

        System.out.println(
                "AJAX Module Passed");
    }
}