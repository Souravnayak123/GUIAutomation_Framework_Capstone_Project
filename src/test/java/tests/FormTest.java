package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FormPage;
import utilities.FormDataProvider;

public class FormTest extends BaseTest {

    @Test(
        dataProvider = "formData",
        dataProviderClass = FormDataProvider.class)
    public void verifyFormSubmission(
            String name,
            String email,
            String phone,
            String address) {

        FormPage formPage =
                new FormPage(driver);

        formPage.fillForm(
                name,
                email,
                phone,
                address);

        formPage.selectGender();

        formPage.selectDays();

        formPage.selectCountry("India");

        formPage.selectColor("Red");

        formPage.selectAnimal("Cat");

        Assert.assertEquals(
                driver.getTitle(),
                "Automation Testing Practice");

        System.out.println(
                "Form Automation Successful");
    }
}