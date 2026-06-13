package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    // Single File Upload

    By singleFileInput =
            By.id("singleFileInput");

    By uploadSingleFileButton =
            By.xpath("//button[text()='Upload Single File']");

    // Multiple File Upload

    By multipleFileInput =
            By.id("multipleFilesInput");

    By uploadMultipleFileButton =
            By.xpath("//button[text()='Upload Multiple Files']");

    // Methods

    public void uploadSingleFile(String filePath) {

        driver.findElement(singleFileInput)
              .sendKeys(filePath);
    }

    public void clickUploadSingleFile() {

        driver.findElement(uploadSingleFileButton)
              .click();
    }

    public void uploadMultipleFiles(String file1,
                                    String file2) {

        driver.findElement(multipleFileInput)
              .sendKeys(file1 + "\n" + file2);
    }

    public void clickUploadMultipleFiles() {

        driver.findElement(uploadMultipleFileButton)
              .click();
    }
}