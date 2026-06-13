package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScrollingDropdownPage {

    WebDriver driver;

    public ScrollingDropdownPage(WebDriver driver) {

        this.driver = driver;
    }

    By comboBox =
            By.id("comboBox");

    By item23 =
            By.xpath("//div[text()='Item 23']");

    public void clickComboBox() {

        driver.findElement(comboBox)
              .click();
    }

    public void selectItem23() {

        driver.findElement(item23)
              .click();
    }

    public String getSelectedValue() {

        return driver.findElement(comboBox)
                     .getDomProperty("value");
    }
}