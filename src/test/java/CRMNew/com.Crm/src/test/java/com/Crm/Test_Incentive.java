package com.Crm;



	
	import java.io.File;
	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test_Incentive {
		
		@Test(enabled=false)
		public void inageCreate() {
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
			driver.close();
	}
		@Test(enabled=false)
		public void SMRITHIGURUNATHAN() {
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
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/div/a/button")).click();
		driver.findElement(By.xpath("//input[@id='agent_name']")).sendKeys("SMRITHI GURUNATHAN");
	    driver.findElement(By.xpath("//input[@id='agent_mobile_number']")).sendKeys("9790864238");
	    driver.findElement(By.xpath("//input[@id='agent_email']")).sendKeys("smrithigurunathan@gmail.com");
	    driver.findElement(By.xpath("//textarea[@id='agent_address']")).sendKeys("Old No:42, New No:6, Mangadusamy street, Nungampakkam, Chennai -600034");
	    WebElement stateDropdown = driver.findElement(By.xpath("//*[@id=\"AgentForm\"]/div/div[6]/div/span/span[1]/span"));
	    stateDropdown.click();
	    WebElement searchBox = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	    searchBox.sendKeys("Tamil Nadu");
	    WebElement option = driver.findElement(By.xpath("//li[contains(text(),'Tamil Nadu')]"));
	    option.click();
	    driver.findElement(By.xpath("//input[@id='agent_pincode']")).sendKeys("600034");
	    driver.findElement(By.xpath("//input[@id='agent_bank_account_number']")).sendKeys("200001521140");
	    driver.findElement(By.xpath("//input[@id='agent_ifsc_code']")).sendKeys("ESFB0001160");
	    driver.findElement(By.xpath("//input[@id='agent_pan_number']")).sendKeys("KUYPS2368H");
	    driver.findElement(By.xpath("//input[@id='agent_branch_location']")).sendKeys("West Mambalam ");
	    driver.findElement(By.xpath("//input[@id='agent_aadhaar_number']")).sendKeys("353421353620");
	driver.findElement(By.xpath("//input[@id='aadhaar_image_name_front']")).sendKeys("D:\\crm imgae upload\\download (1).jpg");
	driver.findElement(By.xpath("//input[@id='aadhaar_image_name_back']")).sendKeys("D:\\crm imgae upload\\download.jpg");
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//input[@id='pancard_image_name']")).sendKeys("D:\\crm imgae upload\\download (2).jpg");
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	 WebElement CityDropdown = driver.findElement(By.xpath("//*[@id=\"AgentForm\"]/div/div[7]/div/span/span[1]/span"));
	 CityDropdown.click();
	 WebElement SearchCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='select2-search__field']")));
	 SearchCity.sendKeys("chennai");
	 WebElement ChennaiOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Chennai')]")));
	 ChennaiOption.click();
	 WebElement submitButton = driver.findElement(By.xpath("//button[@id='agent-submit-btn']"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(submitButton).click().perform();
	    //driver.quit();
	}
		@Test(enabled=false)
		public void viewSMRIT() {
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
			driver.findElement((By.xpath("//*[@id=\"datatable\"]/tbody/tr[3]/td[6]/a[1]/i"))).click();
			WebElement IncentiveDetail=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/h4"));
			String headingText= IncentiveDetail.getText();
			System.out.println("The text received is :"+headingText);
			//driver.quit();
		}
		@Test(enabled=true)
		public void EditSMRIT() {
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
			driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[2]/td[6]/a[2]/i")).click();
			driver.findElement(By.xpath("//input[@id='agent_branch_location']")).sendKeys("West Mambalam-Chennai ");
		}
	}


