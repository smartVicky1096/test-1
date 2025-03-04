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
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Member_CreateMembe {

	@Test
	public void MemCreatwThiyagarajan() throws InterruptedException {
		
		 WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://ktnl-test.ktig.info/login/");
			driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[2]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/div/a/button")).click();
			driver.findElement(By.xpath("//textarea[@id='correspondence_address_line_1']")).sendKeys("8/45 vee vee illam, Saradha nagar, bk pudur, Kuniyamuthur,Coimbatore-641008");
			driver.findElement(By.xpath("//textarea[@id='correspondence_address_line_2']")).sendKeys("8/45 vee vee illam, Saradha nagar, bk pudur, Kuniyamuthur,Coimbatore-641008");
			driver.findElement(By.xpath("//textarea[@id='correspondence_address_line_3']")).sendKeys("8/45 vee vee illam, Saradha nagar, bk pudur, Kuniyamuthur,Coimbatore-641008");
            driver.findElement(By.xpath("//input[@id='correspondence_landmark']")).sendKeys("BK Pudur");
            WebElement stateDropdown = driver.findElement(By.xpath("//span[@id='select2-correspondence_state_id-container']"));
           
            stateDropdown.click();
            WebElement stateOption = driver.findElement(By.xpath("//li[contains(text(), 'Tamil Nadu')]"));
            stateOption.click();
            WebElement cityOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Chennai')]")));

            // Scroll into view before clicking
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", cityOption);
            cityOption.click();

            // Verify the city selection
            WebElement selectedCity = driver.findElement(By.xpath("//span[@id='select2-correspondence_city_id-container']"));
            String selectedText = selectedCity.getText();
            System.out.println("Selected City: " + selectedText);

            // Check if the selection was successful
            Assert.assertEquals(selectedText, "Chennai", "City selection failed!");

            System.out.println("City 'Chennai' selected successfully.");

            // Give some time before quitting
            Thread.sleep(2000);

            driver.quit();
            System.out.println("Browser closed successfully.");
     
}
}