package com.SS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_LoginDataDriven {
	
	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver();
		WebDriver driver= new EdgeDriver();
		File file=new File("C:\\\\Users\\\\HP\\\\Desktop\\\\SS new.xls");
		//FileInputStream InputStream= new FileInputStream(file);
		FileInputStream inputstream=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(inputstream);
	       HSSFSheet sheet= wb.getSheet("Sheet2");
	       int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	       for(int i=1;i<=rowcount;i++)
	       {
	    	   driver.get("http://13.127.52.33:5173/#");
	    	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    	   String Emailaddress =sheet.getRow(i).getCell(0).getStringCellValue();
	    	   String Password =sheet.getRow(i).getCell(1).getStringCellValue();
	    	   System.out.println(Emailaddress+" "+Password);
	    	   //driver.findElement(By.xpath("//*[@id=\"student_email\"]")).clear();
	    	   driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys(Emailaddress);
	    	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
	    	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button"))).click();
	   	
	       }
	      // driver.close();
	}
}

