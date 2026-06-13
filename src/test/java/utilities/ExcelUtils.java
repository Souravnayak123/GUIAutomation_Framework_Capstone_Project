package utilities;



import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

    // Read Single Cell

    public static String getCellData(
            String filePath,
            String sheetName,
            int rowNum,
            int colNum) {

        try {

            FileInputStream fis =
                    new FileInputStream(filePath);

            Workbook workbook =
                    WorkbookFactory.create(fis);

            Sheet sheet =
                    workbook.getSheet(sheetName);

            String data =
                    sheet.getRow(rowNum)
                         .getCell(colNum)
                         .toString();

            workbook.close();

            return data;

        } catch (Exception e) {

            e.printStackTrace();

            return "";
        }
    }

    // Read Entire Excel Data

    public static Object[][] getExcelData(
            String filePath,
            String sheetName) {

        try {

            FileInputStream fis =
                    new FileInputStream(filePath);

            Workbook workbook =
                    WorkbookFactory.create(fis);

            Sheet sheet =
                    workbook.getSheet(sheetName);

            int rows =
                    sheet.getLastRowNum();

            int cols =
                    sheet.getRow(0)
                         .getLastCellNum();

            Object[][] data =
                    new Object[rows][cols];

            for(int i = 1; i <= rows; i++) {

                for(int j = 0; j < cols; j++) {

                    data[i - 1][j] =
                            sheet.getRow(i)
                                 .getCell(j)
                                 .toString();
                }
            }

            workbook.close();

            return data;

        } catch (Exception e) {

            e.printStackTrace();

            return null;
        }
    }
}