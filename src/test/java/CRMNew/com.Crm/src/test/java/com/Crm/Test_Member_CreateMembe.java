package com.Crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Member_CreateMembe {

	@Test
	public void MemCreatwThiyagarajan() {
		
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
	}
}
