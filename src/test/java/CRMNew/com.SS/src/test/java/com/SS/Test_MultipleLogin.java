package com.SS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_MultipleLogin {
@Test(priority=0)
	public void login1() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://13.127.52.33:5173/");
		driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("rahavendhira@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vijay@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
	}
@Test(priority=1)
public void login2() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("Vijayaragavan@cogniitec.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ragav@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=2)
public void login3() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("sowbarnikabca@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sowbi5702@");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=3)
public void login4() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("sowbarnika@cogniitec.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Barn@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=4)
public void login5() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("jeevaarvind489@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Arav@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=5)
public void login6() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("manjukrishna139@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Manj@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=6)
public void login7() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("manju@cogniitec.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Krish@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=7)
public void login8() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("sakthivelrajendran10062@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sakt@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=8)
public void login9() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("sakthivel@cogniitec.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Velan@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=9)
public void login10() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("ktigcoimbatore2024@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=10)
public void login11() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vairamoorthy@cogniitec.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@12345");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=11)
public void login12() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vigneshmurugan.dev@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vicky@77");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=12)
public void login13() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vigneshcse7777@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vicky@66");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=13)
public void login14() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("arvind@cogniitec.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Aravi@12345");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
@Test(priority=14)
public void login15() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://13.127.52.33:5173/");
	driver.findElement(By.xpath("//*[@id=\"student_email\"]")).sendKeys("vignesh22892@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Oviya@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")).click();
}
}

