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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test_DummyDataDriven {

	 public static void main(String[] args) throws IOException {
	        WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
	        
	        // Set implicit wait globally
	        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	        // Load the Excel file
	        File file = new File("C:\\Users\\HP\\Desktop\\SS new.xls");
	        FileInputStream inputstream = new FileInputStream(file);
	        HSSFWorkbook wb = new HSSFWorkbook(inputstream);
	        HSSFSheet sheet = wb.getSheet("sheet1");

	        // Get the row count
	        int rowcount = sheet.getLastRowNum(); // Correct row count
	       
	        	for(int i=1;i<=rowcount;i++)

	            {

	             driver.get("http://13.127.52.33:5173/#");

	             WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));

	           Signup.click();

	           driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);

	           String City =sheet.getRow(i).getCell(9).getStringCellValue();

	          String StudentName = sheet.getRow(i).getCell(0).getStringCellValue();

	           double  StudentMobileNumberDouble =sheet.getRow(i).getCell(1).getNumericCellValue();

	           String StudentMobileNumber = String.valueOf((long)StudentMobileNumberDouble);

	           

	            String Gender =sheet.getRow(i).getCell(2).getStringCellValue();

	            //String State =sheet.getRow(i).getCell(3).getStringCellValue();

	            String SchoolName =sheet.getRow(i).getCell(4).getStringCellValue();

	            String StudentGrade =sheet.getRow(i).getCell(5).getStringCellValue();

	            String Emailaddress =sheet.getRow(i).getCell(6).getStringCellValue();

	            double ParentMobileNumberDouble =sheet.getRow(i).getCell(7).getNumericCellValue();

	            String  ParentMobileNumber = String.valueOf((long)ParentMobileNumberDouble);

	            //String Country =sheet.getRow(i).getCell(8).getStringCellValue();

	            String StudentBoard =sheet.getRow(i).getCell(10).getStringCellValue();

	            String Password =sheet.getRow(i).getCell(11).getStringCellValue();

	            System.out.println(StudentName+","+StudentMobileNumber+","+Gender+","+","+SchoolName+","+StudentGrade+","+Emailaddress+","+ParentMobileNumber+","+City+","+StudentBoard+","+Password);

	             

	            

	            WebElement ssCity= driver.findElement(By.xpath("//select[@id='city_name']"));

	             

	     		 ssCity.sendKeys(City);

	     		 

	        driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys(StudentName);

	        

	        driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys(StudentMobileNumber);

	        WebElement SSGender= driver.findElement(By.xpath("//select[@id='student_grade']"));

	      

	     	 SSGender.sendKeys(Gender);

	     	 

	     	  

	     	 WebElement ssStudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));

	     	 

	        	 ssStudentGrade.sendKeys(StudentGrade);

	        

	        	WebElement ssSchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));

	        	 

	     	 ssSchoolName.sendKeys(SchoolName);

	     	 

	     	 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys(Emailaddress);

	     	 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys(ParentMobileNumber);

	     	  WebElement ssStudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));

	     	  ssStudentBoard.sendKeys(StudentBoard);

	     	  

	     	  driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys(Password);

	          driver.findElement(By.xpath("//*[@id='registerModal']/div/div/div/div/form/div[1]/button")).click();

	         

	     	 }

	     
	    }
	}

	