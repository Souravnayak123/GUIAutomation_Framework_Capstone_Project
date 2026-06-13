package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SVGPage;

public class SVGTest extends BaseTest {

    @Test
    public void verifySVGElement() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,2000)");

        SVGPage page =
                new SVGPage(driver);

        Assert.assertTrue(
                page.isSvgDisplayed());

        System.out.println(
                "SVG Element Displayed Successfully");
    }
}