package com.ta.selenium;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetWindowPosition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium_training extends BrowserUtility {
	public static void main(String[] args) throws Exception {
	
		launchBrowser("ch");
		driver.get("https://www.amazon.com");
		WebElement endofPage = driver.findElement(By.xpath("//li[@class='nav_first']//a[contains(text(),'Conditions of Use')]"));
		explicitWaitFunction(endofPage);
		
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//button[contains(text(),\"Switch To\")]"))).perform();
		
		/* Alert
		driver.findElement(By.xpath("//a[contains(text(),\"Alert\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//button[contains(text(),\"Promt Alert\")]//preceding::button[1]")));
		driver.findElement(By.xpath("//button[contains(text(),\"Promt Alert\")]//preceding::button[1]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		driver.findElement(By.xpath("//button[contains(text(),\"Promt Alert\")]")).click();
		System.out.println(alert.getText());
		alert.sendKeys("J R");
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),\"Promt Alert\")]")).click();
		alert.sendKeys("Janice");
		Thread.sleep(1000);
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"Selenium\"]")).getText());
		*/
		
		
		
		/*
		ac.contextClick(driver.findElement(By.xpath("//a[contains(text(),\"Calculator\")]")))
		.sendKeys(Keys.ARROW_RIGHT)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
		*/
		
		
		
		
		
		
		
		
		
		
}
	
	
}
