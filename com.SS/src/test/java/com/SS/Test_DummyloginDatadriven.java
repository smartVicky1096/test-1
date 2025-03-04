package com.SS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_DummyloginDatadriven {

	
	public static void main(String[] args) throws IOException {
        // Setup WebDriver
        WebDriverManager.edgedriver().setup();
        WebDriver driver = null;

        // Load Excel File
        File file = new File("C:\\Users\\HP\\Desktop\\SS new.xls");
        FileInputStream inputStream = new FileInputStream(file);
        HSSFWorkbook wb = new HSSFWorkbook(inputStream);
        HSSFSheet sheet = wb.getSheet("Sheet2");

        if (sheet == null) {
            System.out.println("Sheet 'Sheet2' not found.");
            wb.close();
            return;
        }

        int rowCount = sheet.getLastRowNum();
        try {
            for (int i = 1; i <= rowCount; i++) {
                // Initialize WebDriver for each iteration to ensure a clean session
                driver = new EdgeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

                // Navigate to URL
                driver.get("http://13.127.52.33:5173/#");

                // Read data from Excel
                String emailAddress = sheet.getRow(i).getCell(0).getStringCellValue();
                String password = sheet.getRow(i).getCell(1).getStringCellValue();

                // Input Email Address and Password
                WebElement emailField = driver.findElement(By.xpath("//*[@id=\"student_email\"]"));
                WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
                WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button"));

                emailField.clear();
                emailField.sendKeys(emailAddress);
                passwordField.clear();
                passwordField.sendKeys(password);

                // Wait for the button to be clickable and click it
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

                System.out.println("Processed row " + i + ": " + emailAddress + " | " + password);

                // Quit the driver after processing each row
               // driver.quit();
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cleanup resources
            if (driver != null) {
                driver.quit();
            }
            wb.close();
        }
    }
}
