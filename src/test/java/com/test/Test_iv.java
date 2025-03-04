package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Test_iv {
@Test(enabled=true)
public void loginlink() {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	
	driver.get("http://3.110.160.59:3000/");
	driver.findElement(By.xpath("//a[@class='buttons']")).click();
WebElement username=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
username.sendKeys("Admin");

			
}}
