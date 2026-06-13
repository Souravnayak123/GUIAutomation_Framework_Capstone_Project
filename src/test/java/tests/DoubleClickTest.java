package tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DoubleClickPage;
import utilities.WaitUtils;

public class DoubleClickTest extends BaseTest {

    @Test
    public void verifyDoubleClick() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,2200)");

        DoubleClickPage doublePage =
                new DoubleClickPage(driver);

        WebElement copyButton =
                driver.findElement(
                        doublePage.getCopyTextButton());

        Actions actions =
                new Actions(driver);

        WaitUtils.pause(2);

        actions.doubleClick(copyButton)
               .perform();

        WaitUtils.pause(2);

        String field1Text =
                doublePage.getField1Text();

        String field2Text =
                doublePage.getField2Text();

        Assert.assertEquals(
                field1Text,
                field2Text);

        System.out.println(
                "Double Click Successful");
    }
}