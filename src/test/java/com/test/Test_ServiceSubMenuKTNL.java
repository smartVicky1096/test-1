package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ServiceSubMenuKTNL {

	@Test(enabled =false)
	public void FixedDeposit() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://3.110.160.59:3000/Ktnlsubmenu");
		WebElement Fixeddeposit =driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div[2]/div/div/div[2]/div/div/div[2]/p"));
		String headingText = Fixeddeposit.getText();
		System.out.println("The text recived is :" +headingText);
		driver.quit();
	}
	@Test(enabled =false)
	public void RecurringDeposit() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://3.110.160.59:3000/Ktnlsubmenu");
		WebElement RecurringDeposit = driver.findElement(By.xpath("//*[@id=\"pdescription\"]/div/div/div/div/div/p"));
		String headText = RecurringDeposit.getText();
		System.out.println("The text recived is :"+headText);
		driver.quit();
	}
	@Test(enabled =false)
	public void SavingsAccount() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://3.110.160.59:3000/Ktnlsubmenu");
		WebElement SavingsAccount = driver.findElement(By.xpath("//div[@id='pstyle']//h4[contains(text(),'Savings Account')]"));
		String headText = SavingsAccount.getText();
		System.out.println("The text recived is :" +headText);
	}
	@Test(enabled =false)
	public void WeOffer() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://3.110.160.59:3000/Ktnlsubmenu");
		driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div[2]/div/div/div[2]/div/form/div/fieldset[1]/input")).sendKeys("1000");
		driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div[2]/div/div/div[2]/div/form/div/fieldset[2]/input")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div[2]/div/div/div[2]/div/form/div/fieldset[3]/input")).sendKeys("5");
		WebElement Compounded =driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div[2]/div/div/div[2]/div/form/div/fieldset[4]/select"));
		Select CompDropdown = new Select(Compounded);
		CompDropdown.selectByVisibleText("Compounded Quarterly");
		driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div[2]/div/div/div[2]/div/form/div/button")).click();
	}
	@Test(enabled =true )
	public void AdditionalEnquiry() {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://3.110.160.59:3000/Ktnlsubmenu");
	    driver.findElement(By.xpath("//input[@name='customername']")).sendKeys("Vigneshwar");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vignesh22892@gmail.com");
	    driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("8778680856");
	    driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("200000");

	    // Wait for the button to be clickable
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='mt-2 position-relative btn-buyit-now']")));

	    // Scroll to the button to make it visible
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

	    // Click the button
	    button.click();

	    driver.quit();
	}
}