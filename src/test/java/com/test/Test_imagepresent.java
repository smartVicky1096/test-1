package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Testp_imagepresent;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_imagepresent {
	@Test
	public void imagePresent() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Testp_imagepresent homeimage = PageFactory.initElements(driver,Testp_imagepresent.class);
		driver.get("https://ktig.info/");
	
		List<WebElement> images =homeimage.ktigImages; 
		System.out.println("Number of images present " + images.size());
		driver.quit();
	}

}
