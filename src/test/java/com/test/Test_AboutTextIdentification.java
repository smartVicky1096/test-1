package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Testp_AboutTextIdentification;
public class Test_AboutTextIdentification {
	@Test
	
	public void Textknown() {
		
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Testp_AboutTextIdentification aboutpage =PageFactory.initElements(driver, Testp_AboutTextIdentification.class);
        driver.manage().window().maximize();
       
        driver.get("https://ktig.info/Aboutpage");
        
        aboutpage.ktigHeading.click();
        String headingText = aboutpage.ktigHeading.getText();
        System.out.println(" the text recived is " + headingText);
        
        driver.quit();
        }

}
