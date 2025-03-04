package com.test;


import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.TestP_conDropdown;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ConDropdown {
	WebDriver driver;

    @Test
    public void contact() {
        // Setup WebDriver
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Initialize Page Object elements
        TestP_conDropdown page = PageFactory.initElements(driver, TestP_conDropdown.class);

        // Navigate to the Contact Page
        driver.get("https://ktig.info/Contactpage");

        // Fill the form fields using Page Object elements
        page.nameField.sendKeys("Vigneshwar CR");
        page.phoneField.sendKeys("08870173336");
        page.emailField.sendKeys("vignesh22892@gmail.com");

        // Interact with the service dropdown
        Select serviceSelect = new Select(page.serviceDropdown);
        serviceSelect.selectByVisibleText("KTIG Groups");

        // Fill in the subject field
        page.subjectField.sendKeys("Test");

        // Interact with the business dropdown
        Select businessSelect = new Select(page.businessDropdown);
        businessSelect.selectByVisibleText("IT/ITES Services");

        // Scroll to the Submit button and click it
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", page.submitButton);
        page.submitButton.click();

        // Close the browser
        driver.quit();
    }
}
