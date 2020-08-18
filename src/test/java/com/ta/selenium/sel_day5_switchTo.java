package com.ta.selenium;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class sel_day5_switchTo extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		
		WebElement switchToButton = driver.findElement(By.xpath("//button[contains(text(),\"Switch To\")]"));
		explicitWaitFunction(switchToButton);
		switchToButton.click();
		/*
		WebElement alertTab = driver.findElement(By.xpath("//a[contains(text(),\"Alert\")]"));
		explicitWaitFunction(alertTab);
		alertTab.click();
		WebElement windownAlertOne = driver.findElement(By.xpath("(//button[contains(text(),\"Window Alert\")])[1]"));
		explicitWaitFunction(windownAlertOne);
		windownAlertOne.click();
		
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		Thread.sleep(2000);
		WebElement windownAlertTwo = driver.findElement(By.xpath("(//button[contains(text(),\"Window Alert\")])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", windownAlertTwo);
		Thread.sleep(2000);
		windownAlertTwo.click();
		Thread.sleep(1000);
		al.accept();
		
		WebElement PromtAlert = driver.findElement(By.xpath("//button[contains(text(),\"Promt Alert\")]"));
		PromtAlert.click();
		Thread.sleep(1000);
		al.sendKeys("Janice");
		System.out.println(al.getText());
		Thread.sleep(1000);
		al.accept();
		*/
		//Windows
		
		WebElement eleWindowButton = driver.findElement(By.xpath("//a[contains(text(),\"Window\")]"));
		explicitWaitFunction(eleWindowButton);
		eleWindowButton.click();
		
		WebElement eleButtonNewTab = driver.findElement(By.xpath("//button[contains(text(),\"Tab\")]"));
		explicitWaitFunction(eleButtonNewTab);
		eleButtonNewTab.click();
		eleButtonNewTab.click();
		eleButtonNewTab.click();
		Thread.sleep(1000);
		
		WebElement eleButtonNewWindow = driver.findElement(By.xpath("(//button[@class=\"bootbutton\"])[2]"));
		explicitWaitFunction(eleButtonNewWindow);
		
		eleButtonNewWindow.click();
		Thread.sleep(1000);
		eleButtonNewWindow.click();
		Thread.sleep(1000);
		eleButtonNewWindow.click();
		Thread.sleep(1000);
		
		
		ArrayList<String> windowTabs = new ArrayList (driver.getWindowHandles());
		System.out.println(windowTabs.size());
		driver.switchTo().window(windowTabs.get(2));
		Thread.sleep(2000);
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.close();
		System.out.println(windowTabs.size());
		driver.switchTo().window(windowTabs.get(4));
		Thread.sleep(2000);
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);
		driver.switchTo().window(windowTabs.get(0));
		System.out.println(eleButtonNewWindow.getText());
		
		
		//WebElement eleButtonNewWindow = driver.findElement(By.xpath("(//button[@class=\"bootbutton\"])[2]"));
		
		
		
		
		
		
		
		
	}

}
