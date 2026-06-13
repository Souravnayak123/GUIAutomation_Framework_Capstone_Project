package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {

    WebDriver driver;

    public SliderPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By slider =
            By.xpath("//span[contains(@class,'ui-slider-handle')]");

    By sliderValue =
            By.id("amount");

    // Methods

    public void moveSlider(int xOffset) {

        WebElement sliderElement =
                driver.findElement(slider);

        Actions actions =
                new Actions(driver);

        actions.dragAndDropBy(
                sliderElement,
                xOffset,
                0)
               .perform();
    }

    public String getSliderValue() {

        return driver.findElement(sliderValue)
        	      .getDomProperty("value");
    }
}