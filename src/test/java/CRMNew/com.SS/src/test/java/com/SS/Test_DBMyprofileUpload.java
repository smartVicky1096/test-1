package com.SS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_DBMyprofileUpload {

	@Test
	public void VijayragavanprofileUpload() throws AWTException {
		
	
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
	driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul[2]/span/span[4]/ul/li[1]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div[2]/div/div/div/div/div[1]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div[2]/div/div[1]/div[2]/div/div/div")).click();
	 //using ROBOT CLASS METHOD 
	 Robot RB= new Robot();
	RB.delay(3000);
	//put the file path into the keyboard 
	StringSelection ss = new StringSelection("D:\\crm imgae upload\\Myprofileragavan.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
	//CRTL+V
	RB.keyPress(KeyEvent.VK_CONTROL);
	RB.keyPress(KeyEvent.VK_V);
	//Key release
	RB.keyRelease(KeyEvent.VK_CONTROL);
	RB.keyRelease(KeyEvent.VK_V);
	//ENTER
	RB.keyPress(KeyEvent.VK_ENTER);
	RB.keyRelease(KeyEvent.VK_ENTER);
	
}
}
