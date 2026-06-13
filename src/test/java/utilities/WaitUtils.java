package utilities;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils 
{

    // Wait until element becomes visible
    public static void waitForElementVisible(
            WebDriver driver,
            WebElement element) {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOf(element));
    }

    // Wait until element becomes clickable
    public static void waitForElementClickable(
            WebDriver driver,
            WebElement element) 
    {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(element));
    }

    // Only for Learning / Demo Purpose
    public static void pause(int seconds) 
    {

        try {

            Thread.sleep(seconds * 1000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}