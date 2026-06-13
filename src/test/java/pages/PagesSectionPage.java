package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagesSectionPage {

    WebDriver driver;

    public PagesSectionPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By udemyCourses =
            By.linkText("Udemy Courses");

    By onlineTrainings =
            By.linkText("Online Trainings");

    By blog =
            By.linkText("Blog");

    By playwrightPractice =
            By.linkText("PlaywrightPractice");

    // Methods

    public void clickUdemyCourses() {

        driver.findElement(
                udemyCourses).click();
    }

    public void clickOnlineTrainings() {

        driver.findElement(
                onlineTrainings).click();
    }

    public void clickBlog() {

        driver.findElement(
                blog).click();
    }

    public void clickPlaywrightPractice() {

        driver.findElement(
                playwrightPractice).click();
    }

    public String getPageTitle() {

        return driver.getTitle();
    }

    public String getPageUrl() {

        return driver.getCurrentUrl();
    }
}