package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoubleClickPage {

    WebDriver driver;

    public DoubleClickPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By copyTextButton =
            By.xpath("//button[text()='Copy Text']");

    By field1 =
            By.id("field1");

    By field2 =
            By.id("field2");

    // Getter

    public By getCopyTextButton() {

        return copyTextButton;
    }

    public String getField1Text() {

        return driver.findElement(field1)
                     .getDomProperty("value");
    }

    public String getField2Text() {

        return driver.findElement(field2)
                     .getDomProperty("value");
    }
}
