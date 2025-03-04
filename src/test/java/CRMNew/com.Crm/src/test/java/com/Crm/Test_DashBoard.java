package com.Crm;


	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test_DashBoard {
		@Test(enabled=false)
		public void menuHide() {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://ktnl-test.ktig.info/login/");
			driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680857");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vaira@123");
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"menuCollasped\"]/i")).click();
			driver.close();

		}
		@Test(enabled=true)
		public void membercount() {
			 
			    WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://ktnl-test.ktig.info/login/");
				driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
				driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
				WebElement Memtext=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[1]/div[2]/h5"));
			    String headingText=Memtext.getText();
			    System.out.println("The text recived is :"+headingText);
			    driver.close();
			    
		}
		@Test
		public void Dashboardheader() {
			
			   WebDriverManager.edgedriver().setup();
						WebDriver driver = new EdgeDriver();
						driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
						driver.manage().window().maximize();
						driver.get("https://ktnl-test.ktig.info/login/");
						driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
						driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
						driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
						WebElement KTNL= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/a/img[1]"));
						String headingText=KTNL.getText();
						System.out.println("The text received is :"+headingText);
		}
		}





