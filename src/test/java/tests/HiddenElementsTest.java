package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HiddenElementsPage;
import utilities.WaitUtils;

public class HiddenElementsTest extends BaseTest {

    @Test
    public void verifyHiddenElements() {

        HiddenElementsPage page =
                new HiddenElementsPage(driver);

        // Open Hidden Elements Page

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0,document.body.scrollHeight)");

        WaitUtils.pause(2);

        page.clickHiddenElementsAjaxLink();

        WaitUtils.pause(2);

        // Input Box 2

        page.clickToggleInputBox();

        WaitUtils.pause(2);

        Assert.assertTrue(
                page.isInputBox2Displayed());

        System.out.println(
                "Input Box 2 Visible");

        // Checkbox 2

        page.clickToggleCheckbox();

        WaitUtils.pause(2);

        Assert.assertTrue(
                page.isCheckbox2Displayed());

        System.out.println(
                "Checkbox 2 Visible");

        System.out.println(
                "Hidden Elements Module Passed");
    }
}