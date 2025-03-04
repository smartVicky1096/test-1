package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_NewServiceKTIGroups {

	@Test
	public void Servicedropdrown() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://3.110.160.59:3000/");
		WebElement KtigServices = driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(KtigServices).build().perform();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/div/div/a[1]")).click();
		driver.quit();
	}
	
}
