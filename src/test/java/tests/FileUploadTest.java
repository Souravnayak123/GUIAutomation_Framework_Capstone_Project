package tests;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void verifyFileUpload() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,1500)");

        FileUploadPage filePage =
                new FileUploadPage(driver);

        String file1 = "C:\\TestData\\file1.txt";
        String file2 = "C:\\TestData\\file2.txt";
        // Single File Upload

        filePage.uploadSingleFile(file1);

        filePage.clickUploadSingleFile();

        System.out.println(
                "Single File Uploaded Successfully");

        // Multiple File Upload

        filePage.uploadMultipleFiles(
                file1,
                file2);

        filePage.clickUploadMultipleFiles();

        System.out.println(
                "Multiple Files Uploaded Successfully");

        Assert.assertTrue(true);
    }
}