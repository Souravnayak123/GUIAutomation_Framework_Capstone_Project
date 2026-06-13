package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerPage 
{

    WebDriver driver;

    public DatePickerPage(WebDriver driver) 
    {
        this.driver = driver;
    }

    // Locators

    By datePicker1 = By.id("datepicker");

    By datePicker2 = By.id("txtDate");

    By startDate = By.id("start-date");

    By endDate = By.id("end-date");

    By submitButton = By.xpath("//button[text()='Submit']");

    // Methods

    public void selectDatePicker1(String date) 
    {

        driver.findElement(datePicker1).clear();
        driver.findElement(datePicker1).sendKeys(date);

        // Close DatePicker1 popup
        driver.findElement(By.tagName("body")).click();
    }
    public void selectDatePicker2(String month,
            String year,
            String day)
    {
		// Open Calendar
		
		driver.findElement(datePicker2).click();
		
		// Select Month
		
		Select monthDropdown =
		new Select(driver.findElement(
		  By.className("ui-datepicker-month")));
		
		monthDropdown.selectByVisibleText(month);
		
		// Select Year
		
		Select yearDropdown =
		new Select(driver.findElement(
		  By.className("ui-datepicker-year")));
		
		yearDropdown.selectByVisibleText(year);
		
		// Select Day
		
		driver.findElement(
		By.xpath("//a[text()='" + day + "']"))
		.click();
    }

    

    public void selectDateRange(String start,
                                String end) 
    {

        driver.findElement(startDate).clear();

        driver.findElement(startDate).sendKeys(start);

        driver.findElement(endDate).clear();

        driver.findElement(endDate).sendKeys(end);
    }

    public void clickSubmit() 
    {

        driver.findElement(submitButton).click();
    }
}