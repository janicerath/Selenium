package com.ta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sel_accordian extends BrowserUtility{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		login();
		//Accodian
		WebElement eleWidgetButt = driver.findElement(By.xpath("//button[contains(text(),\"Widget\")]"));
		explicitWaitFunction(eleWidgetButt);
		eleWidgetButt.click();
		WebElement eleAccodian = driver.findElement(By.xpath("//a[contains(text(),\"Accordian\")]"));
		explicitWaitFunction(eleAccodian);
		eleAccodian.click();
		
		WebElement section1 = driver.findElement(By.xpath("//button[contains(text(),\"Section 1\")]"));
		explicitWaitFunction(section1);
		section1.click();
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Section 1\")]/../div[1]/p")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Section 1\")]/../div[1]/p")).getText());
		System.out.println("\n\t******************************\n");
		WebElement section2 = driver.findElement(By.xpath("//button[contains(text(),\"Section 2\")]"));
		section2.click();
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Section 2\")]/../div[2]/p")).getText());
		driver.findElement(By.xpath("//button[contains(text(),\"Section 3\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//button[contains(text(),\"Section 3\")]/../div[3]/p")));
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Section 3\")]/../div[3]/p")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Section 3\")]/../div[3]/p")).getText());
		

	}

}
