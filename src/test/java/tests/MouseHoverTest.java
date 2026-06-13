package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.MouseHoverPage;
import utilities.WaitUtils;

public class MouseHoverTest extends BaseTest {

    @Test
    public void verifyMouseHover() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,1700)");

        MouseHoverPage hoverPage =
                new MouseHoverPage(driver);

        WebElement button =
                driver.findElement(
                        hoverPage.getPointMeButton());

        Actions actions =
                new Actions(driver);

        WaitUtils.pause(2);

        actions.moveToElement(button)
               .perform();

        WaitUtils.pause(3);

        Assert.assertTrue(
                button.isDisplayed());

        System.out.println(
                "Mouse Hover Successful");
    }
}
