package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiddenElementsPage {

    WebDriver driver;

    public HiddenElementsPage(WebDriver driver) {

        this.driver = driver;
    }

    // Footer Link

    By hiddenElementsAjaxLink =
            By.linkText("Hidden Elements & AJAX");

    // Hidden Elements

    By toggleInputBoxBtn =
            By.xpath("//button[contains(text(),'Toggle Input Box 2')]");

    By inputBox2 =
            By.id("input2");

    By toggleCheckboxBtn =
            By.xpath("//button[contains(text(),'Toggle Checkbox 2')]");

    By checkbox2 =
            By.id("checkbox2");

    // Methods

    public void clickHiddenElementsAjaxLink() {

        driver.findElement(hiddenElementsAjaxLink)
              .click();
    }

    public void clickToggleInputBox() {

        driver.findElement(toggleInputBoxBtn)
              .click();
    }

    public boolean isInputBox2Displayed() {

        return driver.findElement(inputBox2)
                     .isDisplayed();
    }

    public void clickToggleCheckbox() {

        driver.findElement(toggleCheckboxBtn)
              .click();
    }

    public boolean isCheckbox2Displayed() {

        return driver.findElement(checkbox2)
                     .isDisplayed();
    }
}