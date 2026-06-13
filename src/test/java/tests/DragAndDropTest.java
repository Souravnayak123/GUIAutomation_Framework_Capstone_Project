package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DragAndDropPage;
import utilities.WaitUtils;

public class DragAndDropTest extends BaseTest 
{

    @Test
    public void verifyDragAndDrop() 
    {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,2500)");

        DragAndDropPage dragPage =
                new DragAndDropPage(driver);

        dragPage.performDragAndDrop();
        WaitUtils.pause(2);

        Assert.assertTrue(
                dragPage.getDropText()
                        .contains("Dropped"));

        System.out.println(
                "Drag And Drop Successful");
    }
}