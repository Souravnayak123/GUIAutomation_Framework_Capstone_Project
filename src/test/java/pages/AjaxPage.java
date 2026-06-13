package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AjaxPage {

    WebDriver driver;

    public AjaxPage(WebDriver driver) {

        this.driver = driver;
    }

    By hiddenElementsAjaxLink =
            By.linkText("Hidden Elements & AJAX");

    By loadAjaxButton =
            By.id("loadContent");

    By ajaxContent =
            By.id("ajaxContent");

    public void clickHiddenElementsAjaxLink() {

        driver.findElement(hiddenElementsAjaxLink)
              .click();
    }

    public void clickLoadAjaxContent() {

        driver.findElement(loadAjaxButton)
              .click();
    }

    public String getAjaxContent() {

        return driver.findElement(ajaxContent)
                     .getText();
    }
}