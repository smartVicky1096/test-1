package com.Crm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Inc_Employee {
	
@Test(enabled=false)
	public void EmployeeHeader() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/login/");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[2]/a")).click();
		WebElement EmployeeText= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/h4"));
		String headingText= EmployeeText.getText();
		System.out.println("The text recived is :"+headingText);
        driver.quit();
		
	}
@Test(enabled=false)
public void EmployeeCreaterekha() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/div/a/button")).click();
	driver.findElement(By.xpath("//input[@id='employee_name']")).sendKeys("Rekha");
	driver.findElement(By.xpath("//input[@id='employee_email']")).sendKeys("rekha@cogniitec.com");
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='employee_mobile_number']")).sendKeys("9698304551");
	driver.findElement(By.xpath("//textarea[@id='employee_address']")).sendKeys("21/A KG Layout,1st Street,Kuzhandai Gounder Street,Ukkadam,Coimbatore - 641001");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement stateDropdown = driver.findElement(By.xpath("//*[@id=\"EmployeeForm\"]/div[1]/div[6]/div/span/span[1]/span"));
   stateDropdown.click();
   WebElement searchBox = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
   searchBox.sendKeys("Tamil Nadu");
   WebElement option = driver.findElement(By.xpath("//li[contains(text(),'Tamil Nadu')]"));
   option.click();
   driver.findElement(By.xpath("//input[@id='employee_pincode']")).sendKeys("641001");
   driver.findElement(By.xpath("//input[@id='employee_bank_account_number']")).sendKeys("100054690946");
   driver.findElement(By.xpath("//input[@id='employee_ifsc_code']")).sendKeys("INDB0000859");
   driver.findElement(By.xpath("//input[@id='employee_branch_location']")).sendKeys("Ramanathapuram branch");
   driver.findElement(By.xpath("//input[@id='employee_aadhaar_number']")).sendKeys("215354237188");
   driver.findElement(By.xpath("//input[@id='employee_pan_number']")).sendKeys("FDJPR7884M");
   WebElement CityDropdown = driver.findElement(By.xpath("//*//*[@id=\"EmployeeForm\"]/div[1]/div[7]/div/span/span[1]/span"));
	 CityDropdown.click();
	 WebElement SearchCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
	 SearchCity.sendKeys("Coimbatore");////li[@id='select2-city-result-p3qb-3683']
	 WebElement CoimbatoreOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Coimbatore')]")));
	 CoimbatoreOption.click();
	 driver.findElement(By.xpath("//input[@id='aadhaar_image_name_front']")).sendKeys("D:\\crm imgae upload\\download (1).jpg");
		driver.findElement(By.xpath("//input[@id='aadhaar_image_name_back']")).sendKeys("D:\\crm imgae upload\\download.jpg");
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='pancard_image_name'] ")).sendKeys("D:\\crm imgae upload\\download (2).jpg");
		 WebElement submitButton = driver.findElement(By.xpath("//button[@id='employee-submit-btn']"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(submitButton).click().perform();
}
@Test(enabled=false)
public void EmployeeCreateSakthivel() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/div/a/button")).click();
	driver.findElement(By.xpath("//input[@id='employee_name']")).sendKeys("Sakthivel");
	driver.findElement(By.xpath("//input[@id='employee_email']")).sendKeys("sakthivel@cogniitec.com");
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='employee_mobile_number']")).sendKeys("9361137301");
	driver.findElement(By.xpath("//textarea[@id='employee_address']")).sendKeys("47A,Ganthiji street, Kombai,Theni,Tamilnadu");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement stateDropdown = driver.findElement(By.xpath("//*[@id=\"EmployeeForm\"]/div[1]/div[6]/div/span/span[1]/span"));
   stateDropdown.click();
   WebElement searchBox = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
   searchBox.sendKeys("Tamil Nadu");
   WebElement option = driver.findElement(By.xpath("//li[contains(text(),'Tamil Nadu')]"));
   option.click();
   driver.findElement(By.xpath("//input[@id='employee_pincode']")).sendKeys("641009");
   driver.findElement(By.xpath("//input[@id='employee_bank_account_number']")).sendKeys("10005469094");
   driver.findElement(By.xpath("//input[@id='employee_ifsc_code']")).sendKeys("INDB0000859");
   driver.findElement(By.xpath("//input[@id='employee_branch_location']")).sendKeys("Ramanathapuram branch-CBE");
   driver.findElement(By.xpath("//input[@id='employee_aadhaar_number']")).sendKeys("215354237188");
   driver.findElement(By.xpath("//input[@id='employee_pan_number']")).sendKeys("FDJPR7884M");
   WebElement CityDropdown = driver.findElement(By.xpath("//*//*[@id=\"EmployeeForm\"]/div[1]/div[7]/div/span/span[1]/span"));
	 CityDropdown.click();
	 WebElement SearchCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/span/span/span[1]/input")));
	 SearchCity.sendKeys("Theni");////li[@id='select2-city-result-p3qb-3683']
	 WebElement CoimbatoreOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Theni')]")));
	 CoimbatoreOption.click();
	 driver.findElement(By.xpath("//input[@id='aadhaar_image_name_front']")).sendKeys("D:\\crm imgae upload\\download (1).jpg");
		driver.findElement(By.xpath("//input[@id='aadhaar_image_name_back']")).sendKeys("D:\\crm imgae upload\\download.jpg");
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='pancard_image_name'] ")).sendKeys("D:\\crm imgae upload\\download (2).jpg");
		 WebElement submitButton = driver.findElement(By.xpath("//button[@id='employee-submit-btn']"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(submitButton).click().perform();
}
@Test(enabled=false)
public void viewRekha() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[2]/td[6]/a[1]/i")).click();
	WebElement Employeeheader= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/h4"));
	String headingText=Employeeheader.getText();
	System.out.println("The text received is :"+headingText);
}
@Test(enabled=false)
public void viewSakthivel() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[2]/td[6]/a[1]/i")).click();
	WebElement Employeeheader= driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[1]/td[6]/a[1]/i"));
	String headingText=Employeeheader.getText();
	System.out.println("The text received is :"+headingText);
}
}