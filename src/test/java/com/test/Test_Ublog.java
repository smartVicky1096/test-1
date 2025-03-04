package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Ublog {
	@Test
	public void upload() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktig.info/Adminpage");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ktig@123");
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/button")).click();
	      driver.findElement(By.xpath("(//*[@id='root']/div/div/div/div[1]/div[@class='form-container'])[2]//label[1]/input"))
	      .sendKeys("C:\\Users\\ADMIN\\Desktop\\monish\\com.test\\src\\test\\java");
	     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/form/label[2]/input")).sendKeys("IT Project");
	     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/form/label[3]/textarea")).sendKeys("A project brief is a short description of key elements of your project. Think of it as a quick summary for project stakeholders and cross-functional collaborators. ");
	     //driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/form/button")).click();
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/form/button"));
	     js.executeScript("arguments[0].click();", submitButton);
	     System.out.println("Submit button clicked successfully via JavaScript!");
	     
	}
}