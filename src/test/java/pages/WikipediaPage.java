package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaPage {

    WebDriver driver;

    public WikipediaPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox =
            By.id("Wikipedia1_wikipedia-search-input");

    By searchButton =
            By.xpath("//input[@type='submit']");

    By searchResults =
            By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a");

    public void enterSearchText(
            String text) {

        driver.findElement(searchBox)
              .clear();

        driver.findElement(searchBox)
              .sendKeys(text);
    }

    public void clickSearch() {

        driver.findElement(searchButton)
              .click();
    }

    public int getResultCount() {

        List<WebElement> results =
                driver.findElements(searchResults);

        return results.size();
    }

    public String getFirstResultText() {

        List<WebElement> results =
                driver.findElements(searchResults);

        return results.get(0)
                      .getText();
    }
}