package com.SS;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_login {
	@Test(enabled=false)
	public void VigneshwarLogin() {
		
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vigneshwar@cogniitec.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vigneshwar@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
	
	driver.close();
}
	@Test(enabled=false)
	public void VDashboard() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vigneshwar@cogniitec.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vigneshwar@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
		WebElement HelloName= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/span/span"));
		String headingText=HelloName.getText();
		System.out.println("The text recived is :"+headingText);
		driver.close();
	}
	@Test(enabled=false)
	public void Invalidlogin() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vigneshwar@cogniitec.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vigneshwar@123456");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
	}
	@Test(enabled=true)
	public void VMyProfile() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("rahavendhira@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vigneshwar@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
	    WebElement Vprofile=driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[3]/span/span[5]/button/img"));
		Actions actions=new Actions(driver);
		actions.moveToElement(Vprofile).build().perform();
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[3]/span/span[5]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div[2]/div/div/div/div/div[1]/a")).click();
		System.out.println("Displays the link with Blank page http://13.127.52.33:5173/profile/student-edit-profile");
		
	    //driver.close();
	}
	@Test(enabled=false)
	public void VLogout() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vigneshwar@cogniitec.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vigneshwar@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
	    WebElement Vprofile=driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[3]/span/span[5]/button/img"));
		Actions actions=new Actions(driver);
		actions.moveToElement(Vprofile).build().perform();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//*[@id=\"logoutModal\"]/div/div/div[3]/button[2]")).click();
		//driver.close();
		//driver.findElement(By.linkText("Cancel")).click();
	}
	@Test(enabled=false)
	public void VlogCancel() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vigneshwar@cogniitec.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vigneshwar@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
	    WebElement Vprofile=driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[3]/span/span[5]/button/img"));
		Actions actions=new Actions(driver);
		actions.moveToElement(Vprofile).build().perform();
		driver.findElement(By.linkText("Logout")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement LogoutCancel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-light border-0 px-5']")));
	    LogoutCancel.click();
		
		
	}
	
}