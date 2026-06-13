package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SVGPage {

    WebDriver driver;

    public SVGPage(WebDriver driver) {

        this.driver = driver;
    }

    By svgElement =
            By.xpath("//*[name()='svg']");

    public boolean isSvgDisplayed() {

        return driver.findElement(svgElement)
                     .isDisplayed();
    }
}
