package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginationTablePage {

    WebDriver driver;

    public PaginationTablePage(WebDriver driver) {

        this.driver = driver;
    }

    // Click Page Number

    public void clickPage(int pageNo) {

        driver.findElement(
                By.xpath("//ul[@id='pagination']//a[text()='"
                        + pageNo + "']"))
              .click();
    }

    // Select First Two Checkboxes

    public void selectTwoCheckboxes() {

        List<WebElement> checkboxes =
                driver.findElements(
                        By.xpath("//table[@id='productTable']//input[@type='checkbox']"));

        for(int i = 0; i < 2; i++) {

            if(!checkboxes.get(i).isSelected()) {

                checkboxes.get(i).click();
            }
        }
    }

    // Count Selected Checkboxes

    public int getSelectedCheckboxCount() {

        int count = 0;

        List<WebElement> checkboxes =
                driver.findElements(
                        By.xpath("//table[@id='productTable']//input[@type='checkbox']"));

        for(WebElement checkbox : checkboxes) {

            if(checkbox.isSelected()) {

                count++;
            }
        }

        return count;
    }
}