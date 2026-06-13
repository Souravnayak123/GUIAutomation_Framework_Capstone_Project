package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.WikipediaPage;
import utilities.WaitUtils;

public class WikipediaTest extends BaseTest {

    @Test
    public void verifyWikipediaSearch() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,1200)");

        WikipediaPage page =
                new WikipediaPage(driver);

        page.enterSearchText(
                "Selenium");

        page.clickSearch();

        WaitUtils.pause(2);

        int resultCount =
                page.getResultCount();

        System.out.println(
                "Results Found : "
                + resultCount);

        Assert.assertTrue(
                resultCount > 0);

        System.out.println(
                "First Result : "
                + page.getFirstResultText());
    }
}
