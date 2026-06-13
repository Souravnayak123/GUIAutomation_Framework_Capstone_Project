package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MouseHoverPage 
{

    WebDriver driver;

    public MouseHoverPage(WebDriver driver) 
    {

        this.driver = driver;
    }

    // Locator

    By pointMeButton =
            By.xpath("//button[text()='Point Me']");

    // Getter

    public By getPointMeButton() 
    {

        return pointMeButton;
    }
}