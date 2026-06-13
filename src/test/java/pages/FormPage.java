package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitUtils;

public class FormPage 
{

    WebDriver driver;

    public FormPage(WebDriver driver) 
    {
        this.driver = driver;
    }

    // Locators

    By name = By.id("name");
    By email = By.id("email");
    By phone = By.id("phone");
    By address = By.id("textarea");

    By maleGender = By.id("male");

    By monday = By.id("monday");
    By wednesday = By.id("wednesday");
    By friday = By.id("friday");

    By country = By.id("country");
    By colors = By.id("colors");
    By animals = By.id("animals");

    // Methods

    public void enterName(String userName) 
    {
        driver.findElement(name).sendKeys(userName);
    }

    public void enterEmail(String userEmail) 
    {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterPhone(String userPhone) 
    {
        driver.findElement(phone).sendKeys(userPhone);
    }

    public void enterAddress(String userAddress) 
    {
        driver.findElement(address).sendKeys(userAddress);
    }

    public void selectGender() 
    {
        driver.findElement(maleGender).click();
    }

    public void selectDays() 
    {

        driver.findElement(monday).click();
        driver.findElement(wednesday).click();
        driver.findElement(friday).click();
    }

    public void selectCountry(String countryName) 
    {

        Select countryDropdown =
                new Select(driver.findElement(country));

        countryDropdown.selectByVisibleText(countryName);
    }

    public void selectColor(String colorName) 
    {

        Select colorDropdown =
                new Select(driver.findElement(colors));

        colorDropdown.selectByVisibleText(colorName);
    }

    public void selectAnimal(String animalName) 
    {

        Select animalDropdown =
                new Select(driver.findElement(animals));

        animalDropdown.selectByVisibleText(animalName);
    }

    public void fillForm(String name,
                         String email,
                         String phone,
                         String address) 
    {

        enterName(name);
        WaitUtils.pause(2);

        enterEmail(email);
        WaitUtils.pause(2);

        enterPhone(phone);
        WaitUtils.pause(2);

        enterAddress(address);
        WaitUtils.pause(2);
    }
}