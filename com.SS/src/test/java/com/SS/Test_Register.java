package com.SS;

import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Register {
	@Test(enabled=true)
	public void Signup1() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.studysmart.test.ktig.info/login#`");
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong")).click();
    driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("sowbarnika");
    driver.findElement(By.xpath("//input[@id='student_last_name']")).sendKeys("Sowb");
    //driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS); 
  driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("8608116681");
  //driver.findElement(By.xpath("//input[@id='student_email']")).sendKeys("sowbarnika@cogniitec.com");
 // driver.findElement(By.xpath("//input[@id='parent_mobile_number']")).sendKeys("9976362529");
  WebElement GenderDropdown= driver.findElement(By.xpath("//select[@id='student_grade']"));
  Select GD= new Select(GenderDropdown);
  GD.selectByVisibleText("Male");
  WebElement StudentDropdown=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
  Select SD=new Select(StudentDropdown);
  SD.selectByVisibleText("12th standard");
  WebElement BoardDropdown= driver.findElement(By.xpath("//Select[@id='student_board_name']"));
  Select BD= new Select(BoardDropdown);
 BD.selectByVisibleText("IGCSE");
 //driver.findElement(By.cssSelector("input#student_email")).sendKeys("sowbarnika@cogniitec.com");
WebElement emailField = driver.findElement(By.xpath("//div[contains(@class, 'col-10 mb-1')]//input[@id='student_email']"));                                                                                
 emailField.sendKeys("sowbarnika@cogniitec.com");
 driver.findElement(By.xpath("//input[@id='parent_mobile_number']")).sendKeys("9976362529");
 WebElement Password = driver.findElement(By.xpath("//div[contains(@class, 'col-10 mb-1')]//input[@id='password']"));
 Password.sendKeys("Sowbarnika@123");
 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[9]/button")).click();
}
	@Test(enabled=false)
	public void register2() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong")).click();
	    driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("vijayaragavan");
	    //driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS); 
	  driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("8608116681");
	  //driver.findElement(By.xpath("//input[@id='student_email']")).sendKeys("sowbarnika@cogniitec.com");
	 // driver.findElement(By.xpath("//input[@id='parent_mobile_number']")).sendKeys("9976362529");
	  WebElement GenderDropdown= driver.findElement(By.xpath("//select[@id='student_grade']"));
	  Select GD= new Select(GenderDropdown);
	  GD.selectByVisibleText("Female");
	  WebElement StudentDropdown=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
	  Select SD=new Select(StudentDropdown);
	  SD.selectByVisibleText("11th standard");
	  WebElement BoardDropdown= driver.findElement(By.xpath("//Select[@id='student_board_name']"));
	  Select BD= new Select(BoardDropdown);
	 BD.selectByVisibleText("IGCSE");
	 //driver.findElement(By.cssSelector("input#student_email")).sendKeys("sowbarnika@cogniitec.com");
	WebElement emailField = driver.findElement(By.xpath("//div[contains(@class, 'col-10 mb-1')]//input[@id='student_email']"));                                                                                
	 emailField.sendKeys("vijay123@gmail.com");
	 driver.findElement(By.xpath("//input[@id='parent_mobile_number']")).sendKeys("9976362525");
	 WebElement Password = driver.findElement(By.xpath("//div[contains(@class, 'col-10 mb-1')]//input[@id='password']"));
	 Password.sendKeys("Vijay@123");
	 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[9]/button")).click();
	}
	@Test(enabled=false)
 public void Forgotpassword() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vigneshwar@cogniitec.com");
 }
  }




