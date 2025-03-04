package com.SS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_DBMyprofile {
@Test
	public void Myprofile1() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.studysmart.test.ktig.info/login#`");
		driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vishnumohanan406@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Shovig@123");
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
		WebElement DName= driver.findElement(By.xpath("//span[@class='fw-semibold fs-5']"));
		String headingText = DName.getText();
		System.out.println("The text received is :"+headingText);
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[2]/span/a/span/span")).click();
		/*WebElement MVijayaragavanprofile=driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[2]/span/span/button/img"));
		Actions actions=new Actions(driver);
		actions.moveToElement(MVijayaragavanprofile).perform();
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[2]/span/span[4]/ul/li[1]/a")).click();*/
		/*WebElement MVijayaragavanprofile=driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[2]/span/span[4]/button/img"));
		Actions actions=new Actions(driver);
		actions.moveToElement(MVijayaragavanprofile).perform();
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[2]/span/span[4]/ul/li[1]/a")).click();
		 //driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div[2]/div/div/div/div/div[1]/a")).click();
		 WebElement EditprofileFull=driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div[2]/div/div/div/div/div[2]"));
		 String headString=EditprofileFull.getText();
		 System.out.println("The text received is :"+headString);*/
		 

	}
}
