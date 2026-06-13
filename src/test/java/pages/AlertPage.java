package pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage 
{

    WebDriver driver;

    public AlertPage(WebDriver driver) 
    {
        this.driver = driver;
    }

    // Locators

    By simpleAlertButton = By.id("alertBtn");

    By confirmAlertButton = By.id("confirmBtn");

    By promptAlertButton = By.id("promptBtn");

    By resultMessage = By.id("demo");

    // Methods

    public void clickSimpleAlert() 
    {

        driver.findElement(simpleAlertButton).click();
    }

    public void acceptAlert() 
    {

        Alert alert = driver.switchTo().alert();

        alert.accept();
    }

    public void clickConfirmAlert() 
    {

        driver.findElement(confirmAlertButton).click();
    }

    public void dismissAlert() 
    {

        Alert alert = driver.switchTo().alert();

        alert.dismiss();
    }

    public void clickPromptAlert() 
    {

        driver.findElement(promptAlertButton).click();
    }

    public void enterPromptText(String text)
    {

        Alert alert = driver.switchTo().alert();

        alert.sendKeys(text);

        alert.accept();
    }

    public String getResultMessage() 
    {

        return driver.findElement(resultMessage)
                     .getText();
    }
}
