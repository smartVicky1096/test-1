package com.SS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// New Signup 20-02-2025
public class Test_Signup{
	@Test(enabled=false)
	public void Register1() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.studysmart.test.ktig.info/login#`");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong")).click();
	    driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("vishnu");
	  
	    WebElement emailField = driver.findElement(By.xpath("//div[contains(@class, 'col-lg-6 col-md-10 mb-3')]//input[@id='student_email']"));
	    emailField.sendKeys("vishnumohanan406@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id='student_last_name']")).sendKeys("mohan");
	    driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("9092127571");
	    driver.findElement(By.xpath("//input[@id='parent_mobile_number']")).sendKeys("9976362529");
	    WebElement GenderDropdown= driver.findElement(By.xpath("//select[@id='student_grade']"));
	    Select GD= new Select(GenderDropdown);
	    GD.selectByVisibleText("Male");
	    WebElement CityDropdown = driver.findElement(By.xpath("//*[@id=\"city_name\"]"));
		   Select CD= new Select(CityDropdown);
		   CD.selectByVisibleText("Coimbatore");
	    
	   WebElement MediumDropdown = driver.findElement(By.xpath("//*[@id=\"medium\"]"));
	   Select MD = new Select(MediumDropdown);
	   MD.selectByVisibleText("English Medium");
	   WebElement BoardDropdown= driver.findElement(By.xpath("//Select[@id='student_board_name']"));
	    Select BD= new Select(BoardDropdown);
	   BD.selectByVisibleText("CBSE");
	   driver.findElement(By.xpath("//div[contains(@class, 'input-group') and not(ancestor::div[contains(@class, 'mb-2')])]/input[@type='password' and @id='password']")).sendKeys("Shovig@123");
	   WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
       if (!checkBox.isSelected()) {
           checkBox.click();}
       driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
       WebElement StudentDropdown=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
	    Select SD=new Select(StudentDropdown);
	    SD.selectByVisibleText("6th standard");
         WebElement SchoolDropdown=driver.findElement(By.xpath("//select[@id='school_name']"));
         Select SDD = new Select(SchoolDropdown);
         SDD.selectByVisibleText("Campaign School");
           driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[16]/div[2]/button")).click();
           driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
      
}
	
	// New Signup 20-02-2025
	@Test(enabled=true)
	public void Register2(){
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.studysmart.test.ktig.info/login#`");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong")).click();
	    driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("Renjith");
	  
	    WebElement emailField = driver.findElement(By.xpath("//div[contains(@class, 'col-lg-6 col-md-10 mb-3')]//input[@id='student_email']"));
	    emailField.sendKeys("renjithkrishnan316@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id='student_last_name']")).sendKeys("krishnan");
	    driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("8137051497");
	    driver.findElement(By.xpath("//input[@id='parent_mobile_number']")).sendKeys("8137051498");
	    WebElement GenderDropdown= driver.findElement(By.xpath("//select[@id='student_grade']"));
	    Select GD= new Select(GenderDropdown);
	    GD.selectByVisibleText("Male");
	    WebElement CityDropdown = driver.findElement(By.xpath("//*[@id=\"city_name\"]"));
		   Select CD= new Select(CityDropdown);
		   CD.selectByVisibleText("Coimbatore");
	    
	   WebElement MediumDropdown = driver.findElement(By.xpath("//*[@id=\"medium\"]"));
	   Select MD = new Select(MediumDropdown);
	   MD.selectByVisibleText("English Medium");
	   WebElement BoardDropdown= driver.findElement(By.xpath("//Select[@id='student_board_name']"));
	    Select BD= new Select(BoardDropdown);
	   BD.selectByVisibleText("CBSE");
	   driver.findElement(By.xpath("//div[contains(@class, 'input-group') and not(ancestor::div[contains(@class, 'mb-2')])]/input[@type='password' and @id='password']")).sendKeys("Renjith@123");
	   WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
       if (!checkBox.isSelected()) {
           checkBox.click();}
       driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
       WebElement StudentDropdown=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
	    Select SD=new Select(StudentDropdown);
	    SD.selectByVisibleText("6th standard");
         WebElement SchoolDropdown=driver.findElement(By.xpath("//select[@id='school_name']"));
         Select SDD = new Select(SchoolDropdown);
         SDD.selectByVisibleText("Campaign School");
           driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[16]/div[2]/button")).click();
           driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
		
	}
}

	