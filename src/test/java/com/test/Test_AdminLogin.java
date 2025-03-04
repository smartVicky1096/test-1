package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Testp_Adminlogin;

public class Test_AdminLogin {
	


    @Test
    public void validaccess() {
        // Setup WebDriver
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("http://3.108.235.33:8000/");
		
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9500600913");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tesyt@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
		WebElement Inmessage = driver.findElement(By.xpath("//span[@id='passwordError']"));
		
		String headingText = Inmessage.getText();
		System.out.println("InValid password "+ headingText);




        // Initialize the Page Object elements
      /* Testp_Adminlogin adminPage = PageFactory.initElements(driver, Testp_Adminlogin.class);

        // Navigate to the website
        driver.get("https://ktig.info/");

        // Wait for and click on the "Admin Login" link
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(adminPage.adminLoginLink)).click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", adminPage.adminLoginLink);
        }

        // Enter login credentials
        adminPage.usernameField.sendKeys("admin");
        adminPage.passwordField.sendKeys("Ktig@123");

        // Click the login button
        adminPage.loginButton.click();*/

        // Close the browser
        driver.quit();
    }
}
