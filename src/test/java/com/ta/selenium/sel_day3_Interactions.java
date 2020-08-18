package com.ta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sel_day3_Interactions extends BrowserUtility {

	public static void main(String[] args) throws Exception {

		launchBrowser("ch");
		login();
		//Mouse Hover
		driver.findElement(By.xpath("//button[contains(text(),\"Intractions\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),\"Mouse Hover\")]")));
		driver.findElement(By.xpath("//a[contains(text(),\"Mouse Hover\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//button[contains(text(),\"mousehover\")]")));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//button[contains(text(),\"mousehover\")]"))).build().perform();
		Thread.sleep(2000);
		
		
		/*
		//Single Click
		driver.findElement(By.xpath("//button[contains(text(),\"Intractions\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),\"Double Click\")]")));
		driver.findElement(By.xpath("//a[contains(text(),\"Double Click\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//button[contains(text(),\"single Click\")]")));
		driver.findElement(By.xpath("//button[contains(text(),\"single Click\")]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"single Click\")]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"single Click\")]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"single Click\")]")).click();
		System.out.println(driver.findElement(By.id("demo1")).getText());
		
		//Double Click
		WebElement eleDC = driver.findElement(By.xpath("//button[contains(text(),\"Double Click\")]"));
		ac.doubleClick(eleDC).build().perform();
		Thread.sleep(2000);
		ac.doubleClick(eleDC).build().perform();
		Thread.sleep(2000);
		ac.doubleClick(eleDC).build().perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("Selenium")).getText());
		*/
		
		//Tool Tip
		driver.findElement(By.xpath("//button[contains(text(),\"Intractions\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),\"Tool Tip\")]")));
		driver.findElement(By.xpath("//a[contains(text(),\"Tool Tip\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//div[contains(text(),\"Right\")]")));
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),\"Right\")]"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//span[@class=\"tooltiptextr\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class=\"tooltiptextr\"]")).isDisplayed());
		
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),\"Left\")]"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//span[@class=\"tooltiptextl\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class=\"tooltiptextl\"]")).isDisplayed());
		
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),\"Top\")]"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//span[@class=\"tooltiptextt\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class=\"tooltiptextt\"]")).isDisplayed());
		
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),\"Bottom\")]"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//span[@class=\"tooltiptextb\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class=\"tooltiptextb\"]")).isDisplayed());

		//Calculator
		driver.findElement(By.xpath("//a[contains(text(),\"Calculator\")]")).click();
		Thread.sleep(1000);
		explicitWaitFunction(driver.findElement(By.id("display")));
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"7\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"x\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"4\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"=\"]")).click();
	}

	
		
}

