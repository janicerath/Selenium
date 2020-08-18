package com.ta.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sel_day2 extends BrowserUtility {
			
	public static void main(String[] args) throws InterruptedException {
				
		launchBrowser("edge");
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
		
		explicitWaitFunction(driver.findElement(By.id("email_field")), 5);
		
		driver.findElement(By.id("email_field")).clear();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).clear();
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/button[1]")).click();
		
		explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),'Home')]")), 10);
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		
		
		
		
		
		
	}

}
