package com.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Test_BankingSolutionScreen {
	
	@Test
	public void screenshot() {
		
		  WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://ktig.info/Bankingsolution");
	        List<WebElement> bankimage=driver.findElements(By.xpath("//img"));
	        System.out.println("Total image present :" +bankimage.size());
	       for(int i=0;i< bankimage.size();i++) {
	        	
	        	WebElement image = bankimage.get(i);
	        	try {
	        	if (image.isDisplayed() && image.getSize().getWidth()>0 && image.getSize().getHeight()>0) {
	        		
	        		File screenShot = image.getScreenshotAs(OutputType.FILE);
	        		File destination = new File("C:\\Users\\ADMIN\\Desktop\\monish\\com.test\\src\\test\\java\\screenshot\\bank\\image_" + (i + 1) + ".png");
	        		FileHandler.copy(screenShot,destination);
	        		System.out.println("Screeshot for saved images" + (i + 1) + "at:" + destination.getAbsolutePath());
	        	}else {
	        		System.out.println("skipping image" + (i + 1) + "as it is either not disaply or  has zero size");
	        	} 
	        	}catch (IOException e) {
	        		System.out.println("Error capturing screenshot for the image" + (i + 1 )+ ":" + e.getMessage());
	        	}catch(Exception e) {
	        		System.out.println("expected error for image" +(i + 1)+ ":" + e.getMessage());
	        	}
	        	
    driver.quit();

	        }
	        }
}
