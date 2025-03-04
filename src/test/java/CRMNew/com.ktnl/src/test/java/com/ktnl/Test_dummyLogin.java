package com.ktnl;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_dummyLogin {

	
	@Test(enabled=true)
	public void clientSowbranika() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/login/");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680856");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sow@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
		WebElement Sow =driver.findElement(By.xpath("//h5[@id='user_name']"));
		String headingtext= Sow.getText();
		System.out.println(" The text received is :" +headingtext);
		driver.close();
	}
	@Test(enabled=false)
	public void clientvaira() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/login/");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680857");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vaira@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
		WebElement Vai= driver.findElement(By.xpath("//h5[@id='user_name']"));
		String headingText = Vai.getText();
		System.out.println("The text received is : " +headingText);
		driver.close();
}
	@Test(enabled=false)
	public void client3() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/login/");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680858");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Manju@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
		WebElement Man=driver.findElement(By.xpath("//h5[@id='user_name']"));
		String headingText = Man.getText();
		System.out.println("the text received is :"+headingText);
		driver.close();
}
	@Test(enabled=false)
	public void client4() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/login/");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8778680859");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijaya@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();	
		WebElement Vij=driver.findElement(By.xpath("//h5[@id='user_name']"));
		String headingtext=Vij.getText();
		System.out.println("The text received is :"+headingtext);
}
	
	@Test(enabled=false)
	public void Orginal() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ktnl-test.ktig.info/login/");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6380751040");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thiagu@123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]")).click();
		WebElement Thi = driver.findElement(By.xpath("//h5[@id='user_name']"));
		String headingText=Thi.getText();
		System.out.println("This text recived is : "+headingText);
		driver.close();
}
}


