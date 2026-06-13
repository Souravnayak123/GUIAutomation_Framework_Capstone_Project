package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksPage {

    WebDriver driver;

    public BrokenLinksPage(WebDriver driver) {

        this.driver = driver;
    }

    By allLinks = By.tagName("a");

    public List<String> getAllLinkUrls() {

        List<WebElement> links =
                driver.findElements(allLinks);

        List<String> urls =
                new ArrayList<>();

        for (WebElement link : links) {

            String url =
                    link.getAttribute("href");

            if (url != null &&
                !url.isEmpty()) {

                urls.add(url);
            }
        }

        return urls;
    }
}