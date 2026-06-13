package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ScrollingDropdownPage;
import utilities.WaitUtils;

public class ScrollingDropdownTest extends BaseTest {

    @Test
    public void verifyScrollingDropdown() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,2000)");

        ScrollingDropdownPage page =
                new ScrollingDropdownPage(driver);

        page.clickComboBox();

        WaitUtils.pause(2);

        page.selectItem23();

        String value =
                page.getSelectedValue();

        System.out.println(
                "Selected Item : "
                + value);

        Assert.assertEquals(
                value,
                "Item 23");

        System.out.println(
                "Scrolling Dropdown Passed");
    }
}