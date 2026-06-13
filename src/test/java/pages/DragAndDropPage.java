package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage 
{

    WebDriver driver;

    public DragAndDropPage(WebDriver driver) 
    {

        this.driver = driver;
    }

    By sourceElement =
            By.id("draggable");

    By targetElement =
            By.id("droppable");

    public void performDragAndDrop() 
    {

        WebElement source =
                driver.findElement(sourceElement);

        WebElement target =
                driver.findElement(targetElement);

        Actions actions =
                new Actions(driver);

        actions.dragAndDrop(
                source,
                target)
               .perform();
    }

    public String getDropText() 
    {

        return driver.findElement(targetElement)
                     .getText();
    }
}