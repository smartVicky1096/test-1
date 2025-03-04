package com.Crm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_MuraliIncentive {

@Test(enabled=false)	
	public void MURALICREATE() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/login/");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
		 driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/div/a/button")).click();
		driver.findElement(By.xpath("//input[@id='agent_name']")).sendKeys("MURALI G R");
	    driver.findElement(By.xpath("//input[@id='agent_mobile_number']")).sendKeys("9363265133");
	    driver.findElement(By.xpath("//input[@id='agent_email']")).sendKeys("grm2389@gmail.com");
	    driver.findElement(By.xpath("//textarea[@id='agent_address']")).sendKeys("No:D.41, Hudco Colony, V.K. Road, Peelamedu, Coimbatore 641004");
	    WebElement stateDropdown = driver.findElement(By.xpath("//*[@id=\"AgentForm\"]/div/div[6]/div/span/span[1]/span"));
	    stateDropdown.click();
	    WebElement searchBox = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	    searchBox.sendKeys("Tamil Nadu");
	    WebElement option = driver.findElement(By.xpath("//li[contains(text(),'Tamil Nadu')]"));
	    option.click();
	    driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id='agent_pincode']")).sendKeys("641004");
	    driver.findElement(By.xpath("//input[@id='agent_bank_account_number']")).sendKeys("1206101022950");
	    driver.findElement(By.xpath("//input[@id='agent_ifsc_code']")).sendKeys("CNRB0001206");
	    driver.findElement(By.xpath("//input[@id='agent_pan_number']")).sendKeys("AUBPM2150K");
	    driver.findElement(By.xpath("//input[@id='agent_branch_location']")).sendKeys("Gandhi Puram");
	    driver.findElement(By.xpath("//input[@id='agent_aadhaar_number']")).sendKeys("228836698145");
	driver.findElement(By.xpath("//input[@id='aadhaar_image_name_front']")).sendKeys("D:\\crm imgae upload\\download (1).jpg");
	driver.findElement(By.xpath("//input[@id='aadhaar_image_name_back']")).sendKeys("D:\\crm imgae upload\\download.jpg");
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//input[@id='pancard_image_name']")).sendKeys("D:\\crm imgae upload\\download (2).jpg");
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	 WebElement CityDropdown = driver.findElement(By.xpath("//*[@id=\"AgentForm\"]/div/div[7]/div/span/span[1]/span"));
	 CityDropdown.click();
	 WebElement SearchCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='select2-search__field']")));
	 SearchCity.sendKeys("Coimbatore");
	 WebElement CoimbatoreOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Coimbatore')]")));
	 CoimbatoreOption.click();
	 WebElement submitButton = driver.findElement(By.xpath("//button[@id='agent-submit-btn']"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(submitButton).click().perform();
	 
}
@Test(enabled=false)
public void MuraliView() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[1]/a")).click();
	driver.findElement((By.xpath("//*[@id=\"datatable\"]/tbody/tr/td[6]/a[1]/i"))).click();
	WebElement IncentiveDetail=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/h4"));
	String headingText= IncentiveDetail.getText();
	System.out.println("The text received is :"+headingText);
}
@Test(enabled=false)
public void MuraliEdit() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[1]/td[6]/a[2]/i")).click();
	driver.findElement(By.xpath("//input[@id='branch_location']")).sendKeys("Gandipuram-Coimbatore");
	System.out.println("Branch location FAILED");
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='aadhaar_image_name_front']")).sendKeys("D:\\\\crm imgae upload\\\\download (1).jpg");
	//WebElement IncentiveUpdateButton= driver.findElement(By.xpath("//button[@class='btn btn-outline-success agentsubmit']"));
	////button[@class='btn btn-outline-success agentsubmit' and text()='Update Incentive']
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	WebElement IncentiveUpdateButton= driver.findElement(By.xpath("//button[@class='btn btn-outline-success agentsubmit' and text()='Update Incentive']"));
	Actions actions = new Actions(driver);
	 actions.moveToElement(IncentiveUpdateButton).click().perform();
}
@Test(enabled=true)
public void MuralisubmitBT() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	   try {
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[1]/td[6]/a[2]/i")).click();
	driver.findElement(By.xpath("//input[@id='branch_location']")).sendKeys("Gandipuram-Coimbatore");
	 WebElement incentiveUpdateButton = driver.findElement(By.xpath("//button[@class='btn btn-outline-success agentsubmit']"));

     // Ensure button is visible and clickable
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", incentiveUpdateButton);
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
     wait.until(ExpectedConditions.elementToBeClickable(incentiveUpdateButton));

     // Try multiple click strategies
     boolean isClicked = false;

     // 1. Normal Selenium click
     try {
         incentiveUpdateButton.click();
         isClicked = true;
         System.out.println("Button clicked using normal Selenium click.");
     } catch (Exception e) {
         System.out.println("Normal click failed: " + e.getMessage());
     }

     // 2. Actions click
     if (!isClicked) {
         try {
             Actions actions = new Actions(driver);
             actions.moveToElement(incentiveUpdateButton).click().perform();
             isClicked = true;
             System.out.println("Button clicked using Actions class.");
         } catch (Exception e) {
             System.out.println("Actions class click failed: " + e.getMessage());
         }
     }

     // 3. JavaScript click
     if (!isClicked) {
         try {
             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", incentiveUpdateButton);
             isClicked = true;
             System.out.println("Button clicked using JavaScript Executor.");
         } catch (Exception e) {
             System.out.println("JavaScript click failed: " + e.getMessage());
         }
     }

     // Verify the click
     if (isClicked) {
         System.out.println("Incentive Update Button clicked successfully!");
     } else {
         System.err.println("Failed to click Incentive Update Button!");
     }

 } catch (Exception e) {
     System.err.println("Error during execution: " + e.getMessage());
 } finally {
	
	 
     //driver.quit();
 }
}
@Test(enabled=false)
public void Delete() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	   
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[1]/td[6]/a[3]/i")).click();
	driver.findElement(By.xpath("//button[@id='btn-delete']")).click();
}
@Test(enabled=false)
public void Search() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	driver.get("https://ktnl-test.ktig.info/login/");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"flaptSideNav\"]/div/nav/ul/li[7]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"datatable_filter\"]/label/input")).sendKeys("MEENAL AL");
	WebElement Showing = driver.findElement(By.xpath("//*[@id=\"datatable_info\"]"));
	String headingText=Showing.getText();
	System.out.println("The text received is " +headingText);
	driver.quit();
}
}

