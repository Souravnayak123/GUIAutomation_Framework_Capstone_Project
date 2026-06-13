package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import utilities.ExtentManager;
import utilities.ScreenshotUtils;

public class TestListener implements ITestListener {

    ExtentReports extent =
            ExtentManager.getReport();

    ExtentTest test;

    @Override
    public void onTestStart(
            ITestResult result) {

        test = extent.createTest(
                result.getName());

        System.out.println(
                "STARTED : "
                + result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        test.pass(
                "Test Passed");

        System.out.println(
                "PASSED : "
                + result.getName());
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        test.fail(
                result.getThrowable());

        try {

            String screenshotPath =
                    ScreenshotUtils.takeScreenshot(
                            BaseTest.getDriver(),
                            result.getName());

            test.addScreenCaptureFromPath(
                    screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println(
                "FAILED : "
                + result.getName());
    }

    @Override
    public void onTestSkipped(
            ITestResult result) {

        test.skip(
                "Test Skipped");

        System.out.println(
                "SKIPPED : "
                + result.getName());
    }

    @Override
    public void onFinish(
            ITestContext context) {

        extent.flush();
    }
}