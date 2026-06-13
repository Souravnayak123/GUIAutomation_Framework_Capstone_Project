package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicButtonPage {

    WebDriver driver;

    public DynamicButtonPage(WebDriver driver) {

        this.driver = driver;
    }

    By startButton =
            By.xpath("//button[text()='START']");

    By stopButton =
            By.xpath("//button[text()='STOP']");

    public void clickStartButton() {

        driver.findElement(startButton)
              .click();
    }

    public boolean isStopButtonDisplayed() {

        return driver.findElement(stopButton)
                     .isDisplayed();
    }
}