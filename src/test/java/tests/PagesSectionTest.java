package tests;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.PagesSectionPage;
import utilities.WaitUtils;

public class PagesSectionTest extends BaseTest {

    @Test
    public void verifyPagesSection() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,1800)");

        PagesSectionPage page =
                new PagesSectionPage(driver);

        // Udemy Courses

        page.clickUdemyCourses();

        verifyPage(page);

        driver.navigate().back();

        WaitUtils.pause(2);

        // Online Trainings

        page.clickOnlineTrainings();

        verifyPage(page);

        driver.navigate().back();

        WaitUtils.pause(2);

        // Blog

        page.clickBlog();

        verifyPage(page);

        driver.navigate().back();

        WaitUtils.pause(2);

        // Playwright Practice

        page.clickPlaywrightPractice();

        verifyPage(page);

        System.out.println(
                "Pages Section Successful");
    }

    private void verifyPage(
            PagesSectionPage page) {

        WaitUtils.pause(3);

        System.out.println(
                "Title : "
                + page.getPageTitle());

        System.out.println(
                "URL : "
                + page.getPageUrl());

        Assert.assertFalse(
                page.getPageUrl().isEmpty());
    }
}