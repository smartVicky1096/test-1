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

public class Test_Signup {
	@Test(enabled=false)
	public void Register1() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
     Signup.click();
     driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("oviya");
	 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("9876543210");
	 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
	 Gender.click();
	 Select Gdd = new Select(Gender);
	 Gdd.selectByVisibleText("Male");
	 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
	 City.click();
	 Select Cty = new Select(City);
	 Cty.selectByVisibleText("Coimbatore");
	 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
	 SchoolName.click();
	 Select SlN=new Select(SchoolName);
	 SlN.selectByVisibleText("CS ACADEMY");
	 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
	 StudentGrade.click();
	 Select STG= new Select(StudentGrade);
	 STG.selectByVisibleText("10th standard");
	driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("vignesh22892@gmail.com ");
	 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9876543210");
	 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
	 Select STB = new Select(StudentBoard);
	 STB.selectByVisibleText("ICSE");
	 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Oviya@123");
	 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();	  
}
	@Test(enabled=false)
	public void RegisterMVijayaragavan() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
	     Signup.click();
	     driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("M.Vijayaragavan");
		 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("6374758132");
		 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
		 Gender.click();
		 Select Gdd = new Select(Gender);
		 Gdd.selectByVisibleText("Male");
		 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
		 City.click();
		 Select Cty = new Select(City);
		 Cty.selectByVisibleText("Coimbatore");
		 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
		 SchoolName.click();
		 Select SlN=new Select(SchoolName);
		 SlN.selectByVisibleText("CS ACADEMY");
		 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		 StudentGrade.click();
		 Select STG= new Select(StudentGrade);
		 STG.selectByVisibleText("6th standard");
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("rahavendhira@gmail.com");
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("7502926118");
		 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 Select STB = new Select(StudentBoard);
		 STB.selectByVisibleText("CBSE");
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Vijay@123");
		 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();	 
}
	@Test(enabled=false)
	public void RegisterMVijay() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
	     Signup.click();
	     driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("M.Vijay");
		 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("8428106879");
		 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
		 Gender.click();
		 Select Gdd = new Select(Gender);
		 Gdd.selectByVisibleText("Male");
		 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
		 City.click();
		 Select Cty = new Select(City);
		 Cty.selectByVisibleText("Coimbatore");
		 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
		 SchoolName.click();
		 Select SlN=new Select(SchoolName);
		 SlN.selectByVisibleText("CS ACADEMY");
		 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		 StudentGrade.click();
		 Select STG= new Select(StudentGrade);
		 STG.selectByVisibleText("10th standard");
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("Vijayaragavan@cogniitec.com");
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("7502926181");
		 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 Select STB = new Select(StudentBoard);
		 STB.selectByVisibleText("CBSE");
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Ragav@123");
		 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();	 
}
	@Test(enabled=false)
	public void RegisterSowbarnikaY() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
	     Signup.click();
	     driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("Sowbarnika Y.");
		 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("8608116681");
		 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
		 Gender.click();
		 Select Gdd = new Select(Gender);
		 Gdd.selectByVisibleText("Female");
		 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
		 City.click();
		 Select Cty = new Select(City);
		 Cty.selectByVisibleText("Coimbatore");
		 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
		 SchoolName.click();
		 Select SlN=new Select(SchoolName);
		 SlN.selectByVisibleText("THE CAMFORD INTERNATIONAL SCHOOL");
		 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		 StudentGrade.click();
		 Select STG= new Select(StudentGrade);
		 STG.selectByVisibleText("7th standard");
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("sowbarnikabca@gmail.com");
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("8838606044");
		 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 Select STB = new Select(StudentBoard);
		 STB.selectByVisibleText("MATRICULATION");
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Sowbi5702@");
		 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();	 
}
	@Test(enabled=false)
	public void RegisterBarnikaP() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
	     Signup.click();
	     driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("Barnika .P");
		 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("9942149038");
		 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
		 Gender.click();
		 Select Gdd = new Select(Gender);
		 Gdd.selectByVisibleText("Female");
		 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
		 City.click();
		 Select Cty = new Select(City);
		 Cty.selectByVisibleText("Coimbatore");
		 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
		 SchoolName.click();
		 Select SlN=new Select(SchoolName);
		 SlN.selectByVisibleText("THE CAMFORD INTERNATIONAL SCHOOL");
		 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		 StudentGrade.click();
		 Select STG= new Select(StudentGrade);
		 STG.selectByVisibleText("12th standard");
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("sowbarnika@cogniitec.com");
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9500600913");
		 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 Select STB = new Select(StudentBoard);
		 STB.selectByVisibleText("MATRICULATION");
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Barn@123");
		 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();	 
}
	@Test(enabled=false)
	public void RegisterArvind() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
	     Signup.click();
	     driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("Arvind .J");
		 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("6383368953");
		 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
		 Gender.click();
		 Select Gdd = new Select(Gender);
		 Gdd.selectByVisibleText("Male");
		 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
		 City.click();
		 Select Cty = new Select(City);
		 Cty.selectByVisibleText("Coimbatore");
		 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
		 SchoolName.click();
		 Select SlN=new Select(SchoolName);
		 SlN.selectByVisibleText("MANCHESTER INTERNATIONAL SCHOOL");
		 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		 StudentGrade.click();
		 Select STG= new Select(StudentGrade);
		 STG.selectByVisibleText("7th standard");
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("jeevaarvind489@gmail.com");
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9655581503");
		 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 Select STB = new Select(StudentBoard);
		 STB.selectByVisibleText("CBSE");
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Arav@123");
		 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();	 
}
	@Test(enabled=false)
 public void RegisterArv() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
	     Signup.click();
	     driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("Arv");
		 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("6383368954");
		 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
		 Gender.click();
		 Select Gdd = new Select(Gender);
		 Gdd.selectByVisibleText("Male");
		 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
		 City.click();
		 Select Cty = new Select(City);
		 Cty.selectByVisibleText("Coimbatore");
		 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
		 SchoolName.click();
		 Select SlN=new Select(SchoolName);
		 SlN.selectByVisibleText("DELHI PUBLIC SCHOOL");
		 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		 StudentGrade.click();
		 Select STG= new Select(StudentGrade);
		 STG.selectByVisibleText("8th standard");
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("arvind@cogniitec.com");
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9655581504");
		 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 Select STB = new Select(StudentBoard);
		 STB.selectByVisibleText("STATE BOARD");
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Aravi@12345");
		 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();	 
}
	@Test(enabled=false)
 public void RegisterManju() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
	     Signup.click();
	     driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("Manju");
		 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("9405582819");
		 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
		 Gender.click();
		 Select Gdd = new Select(Gender);
		 Gdd.selectByVisibleText("Female");
		 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
		 City.click();
		 Select Cty = new Select(City);
		 Cty.selectByVisibleText("Coimbatore");
		 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
		 SchoolName.click();
		 Select SlN=new Select(SchoolName);
		 SlN.selectByVisibleText("MANCHESTER INTERNATIONAL SCHOOL");
		 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		 StudentGrade.click();
		 Select STG= new Select(StudentGrade);
		 STG.selectByVisibleText("10th standard");
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("manjukrishna139@gmail.com");
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9865146784");
		 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 Select STB = new Select(StudentBoard);
		 STB.selectByVisibleText("CBSE");
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Manj@123");
		 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();	 
}
	@Test(enabled=false)
public void RegisterRsakthi() {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://13.127.52.33:5173/");
 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
 Signup.click();
 driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("R.sakthi");
 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("8015468697");
 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
 Gender.click();
 Select Gdd = new Select(Gender);
 Gdd.selectByVisibleText("Male");
 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
 City.click();
 Select Cty = new Select(City);
 Cty.selectByVisibleText("Coimbatore");
 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
 SchoolName.click();
 Select SlN=new Select(SchoolName);
 SlN.selectByVisibleText("THE INDIAN PUBLIC SCHOOL");
 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
 StudentGrade.click();
 Select STG= new Select(StudentGrade);
 STG.selectByVisibleText("9th standard");
driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("sakthivelrajendran10062@gmail.com");
 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9994668675");
 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
 Select STB = new Select(StudentBoard);
 STB.selectByVisibleText("CBSE");
 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Sakt@123");
 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
}
	@Test(enabled=false)
public void RegisterRsakthivel() {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://13.127.52.33:5173/");
 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
 Signup.click();
 driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("R.sakthivel");
 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("9361137301");
 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
 Gender.click();
 Select Gdd = new Select(Gender);
 Gdd.selectByVisibleText("Others");
 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
 City.click();
 Select Cty = new Select(City);
 Cty.selectByVisibleText("Coimbatore");
 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
 SchoolName.click();
 Select SlN=new Select(SchoolName);
 SlN.selectByVisibleText("DELHI PUBLIC SCHOOL");
 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
 StudentGrade.click();
 Select STG= new Select(StudentGrade);
 STG.selectByVisibleText("8th standard");
driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("sakthivel@cogniitec.com");
 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9042957172");
 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
 Select STB = new Select(StudentBoard);
 STB.selectByVisibleText("STATE BOARD");
 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Velan@123");
 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
}
	@Test(enabled=false)
public void Registervairam() {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://13.127.52.33:5173/");
 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
 Signup.click();
 driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("vairam");
 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("7418509654");
 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
 Gender.click();
 Select Gdd = new Select(Gender);
 Gdd.selectByVisibleText("Male");
 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
 City.click();
 Select Cty = new Select(City);
 Cty.selectByVisibleText("Coimbatore");
 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
 SchoolName.click();
 Select SlN=new Select(SchoolName);
 SlN.selectByVisibleText("THE CAMFORD INTERNATIONAL SCHOOL");
 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
 StudentGrade.click();
 Select STG= new Select(StudentGrade);
 STG.selectByVisibleText("10th standard");
driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("ktigcoimbatore2024@gmail.com");
 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("7418509656");
 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
 Select STB = new Select(StudentBoard);
 STB.selectByVisibleText("IB");
 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Test@123");
 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
}
	@Test(enabled=false)
public void Registermoorthy() {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://13.127.52.33:5173/");
 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
 Signup.click();
 driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("moorthy");
 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("7418509655");
 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
 Gender.click();
 Select Gdd = new Select(Gender);
 Gdd.selectByVisibleText("Male");
 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
 City.click();
 Select Cty = new Select(City);
 Cty.selectByVisibleText("Coimbatore");
 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
 SchoolName.click();
 Select SlN=new Select(SchoolName);
 SlN.selectByVisibleText("NATIONAL MODEL MATRICULATION HIGHER SECONDARY SCHOOL");
 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
 StudentGrade.click();
 Select STG= new Select(StudentGrade);
 STG.selectByVisibleText("12th standard");
driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("vairamoorthy@cogniitec.com");
 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("7418509657");
 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
 Select STB = new Select(StudentBoard);
 STB.selectByVisibleText("ICSE");
 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Test@12345");
 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
}
	@Test(enabled=false)
public void RegisteMvigneshwaran() {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://13.127.52.33:5173/");
 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
 Signup.click();
 driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("M. vigneshwaran");
 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("9843844354");
 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
 Gender.click();
 Select Gdd = new Select(Gender);
 Gdd.selectByVisibleText("Male");
 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
 City.click();
 Select Cty = new Select(City);
 Cty.selectByVisibleText("Coimbatore");
 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
 SchoolName.click();
 Select SlN=new Select(SchoolName);
 SlN.selectByVisibleText("MANCHESTER INTERNATIONAL SCHOOL");
 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
 StudentGrade.click();
 Select STG= new Select(StudentGrade);
 STG.selectByVisibleText("12th standard");
driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("vigneshmurugan.dev@gmail.com");
 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9585472792");
 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
 Select STB = new Select(StudentBoard);
 STB.selectByVisibleText("STATE BOARD");
 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Vicky@77");
 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
}
	@Test(enabled=false)
public void RegisterMVicky() {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://13.127.52.33:5173/");
 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
 Signup.click();
 driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("M.Vicky");
 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("6380941174");
 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
 Gender.click();
 Select Gdd = new Select(Gender);
 Gdd.selectByVisibleText("Male");
 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
 City.click();
 Select Cty = new Select(City);
 Cty.selectByVisibleText("Coimbatore");
 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
 SchoolName.click();
 Select SlN=new Select(SchoolName);
 SlN.selectByVisibleText("THE CAMFORD INTERNATIONAL SCHOOL");
 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
 StudentGrade.click();
 Select STG= new Select(StudentGrade);
 STG.selectByVisibleText("11th standard");
driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("vigneshcse7777@gmail.com");
 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9751189732");
 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
 Select STB = new Select(StudentBoard);
 STB.selectByVisibleText("MATRICULATION");
 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Vicky@66");
 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
}
	@Test(priority=13)
	public void RegisterKrishna() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		 WebElement Signup=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/div[1]/a[2]/strong"));
		 Signup.click();
		 driver.findElement(By.xpath("//input[@id='student_name']")).sendKeys("Krishna");
		 driver.findElement(By.xpath("//input[@id='student_mobile_number']")).sendKeys("9405582818");
		 WebElement Gender= driver.findElement(By.xpath("//select[@id='student_grade']"));
		 Gender.click();
		 Select Gdd = new Select(Gender);
		 Gdd.selectByVisibleText("Female");
		 WebElement City= driver.findElement(By.xpath("//select[@id='city_name']"));
		 City.click();
		 Select Cty = new Select(City);
		 Cty.selectByVisibleText("Coimbatore");
		 WebElement SchoolName = driver.findElement(By.xpath("//select[@id='school_name']"));
		 SchoolName.click();
		 Select SlN=new Select(SchoolName);
		 SlN.selectByVisibleText("DELHI PUBLIC SCHOOL");
		 WebElement StudentGrade=driver.findElement(By.xpath("//select[@id='student_grade_name']"));
		 StudentGrade.click();
		 Select STG= new Select(StudentGrade);
		 STG.selectByVisibleText("12th standard");
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='student_email' and @placeholder='Enter E-Mail Address']")).sendKeys("manju@cogniitec.com");
		 driver.findElement(By.xpath("//input[@name='parent_mobile_number']")).sendKeys("9865146785");
		 WebElement StudentBoard = driver.findElement(By.xpath("//select[@id='student_board_name']"));
		 Select STB = new Select(StudentBoard);
		 STB.selectByVisibleText("MATRICULATION");
		 driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-10 mb-1']//input[@id='password' and @placeholder='Enter your password']")).sendKeys("Krish@123");
		 driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div/div/form/div[2]/div[14]/div[2]/button")).click();	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[3]/button[2]")).click();
		}

		}












