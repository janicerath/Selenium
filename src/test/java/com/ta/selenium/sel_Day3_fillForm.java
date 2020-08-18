package com.ta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sel_Day3_fillForm extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// Fill in form
		
		launchBrowser("ch");
		login();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("John");
		driver.findElement(By.id("lname")).clear();
		driver.findElement(By.id("lname")).sendKeys("Doe");
		driver.findElement(By.id("postaladdress")).clear();
		driver.findElement(By.id("postaladdress")).sendKeys("PO BOX 123, Houston TX 12345");
		driver.findElement(By.id("personaladdress")).clear();
		driver.findElement(By.id("personaladdress")).sendKeys("1234 abc Ln");
		System.out.println(driver.findElement(By.xpath("//input[@value=\"male\"]")).isSelected());
		driver.findElement(By.xpath("//input[@value=\"female\"]")).click();
		
		//drop down list: using just click, find click vs using Select class
		
		driver.findElement(By.xpath("//select[@id=\"city\"]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//select[@id=\"city\"]//option[contains(text(),\"MUMBAI\")]")));
		driver.findElement(By.xpath("//select[@id=\"city\"]//option[contains(text(),\"MUMBAI\")]")).click();
		Select select = new Select(driver.findElement(By.id("course")));
		select.selectByIndex(2);
		Select select1 = new Select(driver.findElement(By.id("district")));
		select1.selectByValue("patna");
		Select select2 = new Select(driver.findElement(By.id("state")));
		select2.selectByVisibleText("UP");
		driver.findElement(By.id("pincode")).clear();
		driver.findElement(By.id("pincode")).sendKeys("12345");
		driver.findElement(By.id("emailid")).clear();
		driver.findElement(By.id("emailid")).sendKeys("john.doe@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]")).click();
		
		
	}

}
