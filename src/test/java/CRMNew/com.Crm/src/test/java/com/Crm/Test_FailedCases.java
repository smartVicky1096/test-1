package com.Crm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_FailedCases {

	
	@Test(enabled=false)
	public void EditSMRIT() {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        try {
            // Configure WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            driver.manage().window().maximize();

            // Navigate to the login page
            driver.get("https://ktnl-test.ktig.info/login/");
            
            // Log in
            driver.findElement(By.id("mobile_number")).sendKeys("6380751040");
            driver.findElement(By.id("password")).sendKeys("Thiagu@123");
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();

            // Navigate to the pincode edit page
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[1]/a"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"datatable\"]/tbody/tr[3]/td[6]/a[2]"))).click();

            // Update the pincode field
            WebElement pincodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pincode")));

            // Use JavaScriptExecutor to clear and set the value
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='';", pincodeField); // Clear the field
            js.executeScript("arguments[0].value='600035';", pincodeField); // Set the new value

            // Trigger a change event to ensure the application registers the new value
            js.executeScript("arguments[0].dispatchEvent(new Event('input'));", pincodeField);

            // Save the changes
            WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
            saveButton.click();

            // Add validation to ensure the pincode was updated successfully
            WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Updated Successfully')]")));
            assert confirmationMessage.isDisplayed() : "Update failed!";

        } catch (Exception e) {
            e.printStackTrace(); // Log any exceptions for debugging
        } finally {
            // Quit the browser session
            driver.quit();
        }
    }
	@Test(enabled=true)
	public void EmployeeDELETE() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[4]/td[6]/a[3]")).click();
	driver.findElement(By.xpath("//button[@id='btn-delete']")).click();
}
	
}