package com.SS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_RewardsPoints {

	@Test
	public void VijayaragavanREWPOI() {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("rahavendhira@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vijay@123");
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
		WebElement DName= driver.findElement(By.xpath("//span[@class='fw-semibold fs-5']"));
		String headingText = DName.getText();
		System.out.println("The text received is :"+headingText);
		driver.findElement(By.xpath("//div[@id='navbarText']")).click();
		WebElement MVijayaragavanprofile=driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[2]/span/span[4]/button/img"));
		Actions actions=new Actions(driver);
		actions.moveToElement(MVijayaragavanprofile).perform();
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[2]/span/span[4]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/a")).click();
}
}
