package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtils 
{

    public static String takeScreenshot(
            WebDriver driver,
            String testName) 
    {

        String path =
                "screenshots/"
                + testName + ".png";

        try {

            TakesScreenshot ts =
                    (TakesScreenshot) driver;

            File source =
                    ts.getScreenshotAs(
                            OutputType.FILE);

            File destination =
                    new File(path);

            FileHandler.copy(
                    source,
                    destination);

        } catch(IOException e) {

            e.printStackTrace();
        }

        return path;
    }
}
