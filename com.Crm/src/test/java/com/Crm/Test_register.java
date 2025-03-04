package com.Crm;



	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test_register {

		
		@Test(enabled=false)
		public void user1() {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://ktnl-test.ktig.info/register/");
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sowbranika ");
	        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680856");
	        driver.findElement(By.xpath("//input[@id='emailaddress']")).sendKeys("Sowbarnika@gmail.com");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sow@123");
	        driver.findElement(By.xpath("//button[@id='sign_up_btn']")).click();
			driver.quit();
		}
		@Test(enabled=false)
		public void user2() {
			
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://ktnl-test.ktig.info/register/");
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("manju ");
	        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680858");
	        driver.findElement(By.xpath("//input[@id='emailaddress']")).sendKeys("manju@gmail.com");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Manju@123");
	        driver.findElement(By.xpath("//button[@id='sign_up_btn']")).click();
			driver.quit();
		}
		@Test(enabled=false)
		public void user3() {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://ktnl-test.ktig.info/register/");
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vairamoorthy");
	        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680857");
	        driver.findElement(By.xpath("//input[@id='emailaddress']")).sendKeys("vaira@gmail.com");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vaira@123");
	        driver.findElement(By.xpath("//button[@id='sign_up_btn']")).click();
			driver.quit();
		}
		@Test(enabled=true)
		public void user4() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/register/");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vijaya");
	    driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680859");
	    driver.findElement(By.xpath("//input[@id='emailaddress']")).sendKeys("vijaya@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijaya@123");
	    driver.findElement(By.xpath("//button[@id='sign_up_btn']")).click();
		driver.quit();
	}
		@Test(enabled=false)
		public void user5() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/register/");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Thiyagarajan");
	    driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
	    driver.findElement(By.xpath("//input[@id='emailaddress']")).sendKeys("thiagarajan@kovaitechnidhi.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
	    driver.findElement(By.xpath("//button[@id='sign_up_btn']")).click();
		driver.quit();
	}
	}




