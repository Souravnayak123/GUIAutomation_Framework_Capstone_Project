package pages;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandlingPage {

    WebDriver driver;

    public WindowHandlingPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By newTabButton =
            By.xpath("//button[text()='New Tab']");

    By popupWindowButton =
            By.xpath("//button[text()='Popup Windows']");

    // Methods

    public void clickNewTab() {

        driver.findElement(newTabButton)
              .click();
    }

    public void clickPopupWindow() {

        driver.findElement(popupWindowButton)
              .click();
    }

    public void switchToChildWindow(
            String parentWindow) {

        Set<String> windows =
                driver.getWindowHandles();

        for(String window : windows) {

            if(!window.equals(parentWindow)) {

                driver.switchTo()
                      .window(window);

                break;
            }
        }
    }

    public void closeCurrentWindow() {

        driver.close();
    }

    public void closeAllChildWindows(
            String parentWindow) {

        Set<String> windows =
                driver.getWindowHandles();

        for(String window : windows) {

            if(!window.equals(parentWindow)) {

                driver.switchTo()
                      .window(window);

                System.out.println(
                        "Closing Window : "
                        + driver.getTitle());

                driver.close();
            }
        }

        driver.switchTo()
              .window(parentWindow);
    }

    public void switchToParentWindow(
            String parentWindow) {

        driver.switchTo()
              .window(parentWindow);
    }

    public String getPageTitle() {

        return driver.getTitle();
    }
}