package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SliderPage;
import utilities.WaitUtils;

public class SliderTest extends BaseTest {

    @Test
    public void verifySlider() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,2800)");

        SliderPage sliderPage =
                new SliderPage(driver);

        sliderPage.moveSlider(100);

        WaitUtils.pause(2);

        String value =
                sliderPage.getSliderValue();

        System.out.println(
                "Slider Value : "
                + value);

        Assert.assertFalse(
                value.isEmpty());

        System.out.println(
                "Slider Successful");
    }
}