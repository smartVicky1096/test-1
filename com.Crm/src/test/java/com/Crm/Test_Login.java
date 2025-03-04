package com.Crm;



	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test_Login {

		@Test(enabled = false)
		public void LoginSignupTC001(){
				
				
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://3.108.235.33:8000/");
				WebElement Welmessage = driver.findElement(By.xpath("//*[@id=\"login-section\"]/div/div/div/div/div/div[2]/h5"));
				String headingText = Welmessage.getText();
				System.out.println(" The text recived is :" +headingText);
				driver.quit();
				}
		@Test(enabled = false)
	   public void Launch() {
		   WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://3.108.235.33:8000/");
			driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9500600913");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
			WebElement Harmessage = driver.findElement(By.xpath("//h5[@id='user_name']"));
			String headingText = Harmessage.getText();
			System.out.println(" The Displayed name is :" +headingText);
			driver.quit();
	   }

		@Test(enabled = true)
		   public void NegativeLaunch() {
			   WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://3.108.235.33:8000/");
				
				driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9500600913");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tesyt@123");
				driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
				WebElement Inmessage = driver.findElement(By.xpath("//span[@id='passwordError']"));
				
				String headingText = Inmessage.getText();
				System.out.println("InValid password "+ headingText);
		
	}
	}




