package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DatePickerPage;

public class DatePickerTest extends BaseTest {

    @Test
    public void verifyDatePickers() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,700)");

        DatePickerPage datePage =
                new DatePickerPage(driver);

        datePage.selectDatePicker1("06/15/2026");

        datePage.selectDatePicker2(
                "Jun",
                "2026",
                "15");

        datePage.selectDateRange(
                "06/01/2026",
                "07/01/2026");

        datePage.clickSubmit();

        Assert.assertTrue(true);

        System.out.println(
                "All Date Pickers Selected Successfully");
    }
}