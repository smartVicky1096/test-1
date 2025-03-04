package com.SS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_URLLaunch {

	@Test(enabled=false)
	public void gosite() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.quit();
	}
	@Test(enabled=false)
	 public void welcomebackText() {
		 WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://13.127.52.33:5173/");
			WebElement logintext= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/p"));
			String headingText= logintext.getText();
			System.out.println("The text received is :"+headingText);
			driver.close();
	 }
	@Test(enabled=false)
	public void forgotpasstext() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		WebElement FPtext=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[1]"));
		String headingText=FPtext.getText();
		System.out.println("The text received is :"+headingText);
		driver.close();
	}
	@Test(enabled=false)
	public void NewtoLogger() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		WebElement NLtext=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]"));
		String headingText= NLtext.getText();
		System.out.println("The text received is :"+headingText);
		driver.close();
	}
	@Test(enabled=true)
	public void SSlogo() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		WebElement Image=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/img"));
		if(Image.isDisplayed()) {
			System.out.println("logo is Displayed ");
		}
		else {
			System.out.println("logo is not Displayed ");
		}
	}
}
