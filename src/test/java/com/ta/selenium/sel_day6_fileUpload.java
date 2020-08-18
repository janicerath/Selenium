package com.ta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sel_day6_fileUpload extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		/*
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement eleChooseFile = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		explicitWaitFunction(eleChooseFile);
		
		eleChooseFile.sendKeys("C:\\Users\\Danielle's Ideapad\\eclipse-workspace\\jpeg\\S3Q5.jpg");
		explicitWaitFunction(driver.findElement(By.xpath("//input[@value=\"Press\"]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Press\"]")).click();
		*/
		login();
		WebElement eleFileUpload = driver.findElement(By.xpath("//a[contains(text(),\"File Upload\")]"));
		explicitWaitFunction(eleFileUpload);
		eleFileUpload.click();
		WebElement eleChooseFile = driver.findElement(By.id("logo"));
		explicitWaitFunction(eleChooseFile);
		eleChooseFile.sendKeys("C:\\Users\\Danielle's Ideapad\\eclipse-workspace\\jpeg\\S3Q5.jpg");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//img[contains(@src,\'data\')]")).isDisplayed());
		Thread.sleep(2000);
		System.out.println("**********************");
		System.out.println(driver.findElement(By.xpath("//img[contains(@src,\'data\')]")).getAttribute("src"));
		System.out.println("**********************");
		WebElement eleClear = driver.findElement(By.xpath("//button[contains(text(),\"Clear\")]"));
		explicitWaitFunction(eleClear);
		eleClear.click();
		

	}

}
