package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.PaginationTablePage;
import utilities.WaitUtils;

public class PaginationTableTest extends BaseTest {

    @Test
    public void verifyPaginationTable() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,4200)");

        PaginationTablePage page =
                new PaginationTablePage(driver);

        for(int i = 1; i <= 4; i++) {

            page.clickPage(i);

            WaitUtils.pause(1);

            page.selectTwoCheckboxes();

            Assert.assertEquals(
                    page.getSelectedCheckboxCount(),
                    2);

            System.out.println(
                    "Page " + i +
                    " : 2 Checkboxes Selected");
        }

        System.out.println(
                "Pagination Table Successful");
    }
}

