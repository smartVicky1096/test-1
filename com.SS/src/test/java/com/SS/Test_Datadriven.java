package com.SS;



	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test_Datadriven {
	public static void main (String[] args) throws IOException {

	// TODO Auto-generated method stub

	WebDriverManager.edgedriver();

	WebDriver driver = new EdgeDriver();
	 
	       File file=new File("C:\\Users\\HP\\Desktop\\SS new.xls");
	       //C:\\Users\\HP\\Desktop\\SS new.xls
	       FileInputStream inputstream=new FileInputStream(file);
	HSSFWorkbook wb=new HSSFWorkbook(inputstream);
	       HSSFSheet sheet= wb.getSheet("sheet1");
	       //String row=sheet.getRow(0).getCell(0).getStringCellValue();
	       int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	       
	       for(int i=1;i<=rowcount;i++)
	       {
	        driver.get("http://13.127.52.33:5173/#");
	        WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
	      Signup.click();
	      driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
	      String City =sheet.getRow(i).getCell(9).getStringCellValue();
	     String StudentName = sheet.getRow(i).getCell(0).getStringCellValue();
	      double  StudentMobileNumber =sheet.getRow(i).getCell(1).getNumericCellValue();
	       String Gender =sheet.getRow(i).getCell(2).getStringCellValue();
	       //String State =sheet.getRow(i).getCell(3).getStringCellValue();
	       String SchoolName =sheet.getRow(i).getCell(4).getStringCellValue();
	       String StudentGrade =sheet.getRow(i).getCell(5).getStringCellValue();
	       String Emailaddress =sheet.getRow(i).getCell(6).getStringCellValue();
	       Double  ParentMobileNumber =sheet.getRow(i).getCell(7).getNumericCellValue();
	       
	       //String Country =sheet.getRow(i).getCell(8).getStringCellValue();
	
	       String StudentBoard =sheet.getRow(i).getCell(10).getStringCellValue();
	       String Password =sheet.getRow(i).getCell(11).getStringCellValue();
	       System.out.println(StudentName+","+StudentMobileNumber+","+Gender+","+","+SchoolName+","+StudentGrade+","+Emailaddress+","+ParentMobileNumber+","+City+","+StudentBoard+","+Password);
	       //System.out.println(email+","+password);*/
	       
	       WebElement ssCity= driver.findElement(By.xpath("//select[@id='city_name']"));
	       //ssCity.clear();
			 ssCity.sendKeys(City);
			// driver.findElement(By.xpath("//input[@id='student_name']")).clear();
	   driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys(StudentName);
	   //driver.findElement(By.xpath("//input[@id='student_mobile_number']")).clear();
	   driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys(String.valueOf(StudentMobileNumber));
	   WebElement SSGender= driver.findElement(By.xpath("//select[@id='student_grade']"));
	   //SSGender.clear();
		 SSGender.sendKeys(Gender);
		 
		// driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		 
		 WebElement ssStudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		// ssStudentGrade.clear();
       	 ssStudentGrade.sendKeys(StudentGrade);
       
       	WebElement ssSchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
       	//ssSchoolName.clear();
		 ssSchoolName.sendKeys(SchoolName);
		 //driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).clear();
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys(Emailaddress);
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys(String.valueOf(ParentMobileNumber));
		 WebElement ssStudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 //ssStudentBoard.clear();
		 ssStudentBoard.sendKeys(StudentBoard);
		 //driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).clear();
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys(Password);
		 driver.findElement(By.xpath("//*[@id='registerModal']/div/div/div/div/form/div[1]/button")).click();
		 
	   //driver.close();
	  //driver.findElement(By.xpath("//input[@id='continue']")).click();
	       }
	       
	       //driver.close();

	       //XSSFWorkbook bw=new XSSFWorkbook(inputstream);

	}
	}

