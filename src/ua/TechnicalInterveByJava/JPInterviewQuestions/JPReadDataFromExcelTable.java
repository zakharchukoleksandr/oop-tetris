package ua.TechnicalInterveByJava.JPInterviewQuestions;
/*Q # 20) Write a Java program to read data from the Excel table.
Answer:
These types of programs are commonly used within the Selenium
framework. We've added detailed comments for each step to make
the program more comprehensible.
The logic starts from the moment we download the sheet on which
the data is stored. We are trying to import email and password.
To do this, we extract the cell using getRow() and getCellmethods.
Let's say we have email and passwords in the 1st and 2nd cell.
Next, we establish the type of cell - string. We then perform a
routine web element locator operation(By.id),where we have
conveyed unique locator values such as "email" and "password"
that will identify these items.
Finally, we send the keys using element.sendKeys,
where cell.getStringCellValueis the key.
This operation will return you the value stored in
cells 1 and 2, respectively.*/

/*
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Test
public class JPReadDataFromExcelTable {

    public void ReadData() throws IOException {
        {
            // импортируйте лист Excel из директории web диска c.
            //QurentSourceFile – это имя нужного файла excel

            File sourceFile = new File("C:\\web\\QurentSourceFile.xls");


// На этом шаге мы загружаем файл.
// Мы используем FileInputStream для чтения из

// файла excel. В случае если вы хотите проводить запись в файл -

// вам следует использовать FileOutputStream.
// Путь к файлу передается в качестве аргумента FileInputStream

            FileInputStream fileInput = new FileInputStream(sourceFile);


            // На этом шаге мы загружаем рабочую книгу excel с
            // помощью HSSFWorkbook,
            // в который мы передаем fileInput в качестве аргумента

            HSSFWorkbook book = new HSSFWorkbook(fileInput);
            // На этом шаге мы загружаем конкретный лист excel,
            // на котором хранятся данные.

            qurentSheet = book.getSheetAt(0);

            for (int i = 1; i <= qurentSheet.getLastRowNum(); i++) {

                // Import data for Email.
                qurentCell = qurentSheet.getRow(i).getCell(1);
                qurentCell.setCellType(Cell.CELL_TYPE_STRING);
                driver.findElement(By.id("email")).sendKeys(qurenrCell.getStringCellValue());

                // Импортируем данные из ячеек с паролями.
                qurentCell = qurentSheet.getRow(i).getCell(2);
                qurentCell.setCellType(Cell.CELL_TYPE_STRING);
                driver.findElement(By.id("password")).sendKeys(qurenrCell.getStringCellValue());
            }
        }
    */
