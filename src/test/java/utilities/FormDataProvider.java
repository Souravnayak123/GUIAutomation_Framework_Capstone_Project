package utilities;

import org.testng.annotations.DataProvider;

public class FormDataProvider {

    @DataProvider(name = "formData")
    public Object[][] getFormData() {

        return ExcelUtils.getExcelData(
                "src/test/resources/testdata/FormData.xlsx",
                "FormData");
    }
}