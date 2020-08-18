package com.ta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sel_Tab  extends BrowserUtility {

	public static void main(String[] args)throws Exception{
		launchBrowser("ch");
		login();
		WebElement eleSwitchToTab = driver.findElement(By.xpath("//button[contains(text(),\"Switch To\")]"));
		explicitWaitFunction(eleSwitchToTab);
		eleSwitchToTab.click();
		WebElement eleTabButton = driver.findElement(By.xpath("//a[contains(text(),\"Tabs\")]"));
		explicitWaitFunction(eleTabButton);
		eleTabButton.click();
		
		WebElement LondonTab = driver.findElement(By.xpath("//button[contains(text(),\"London\")]"));
		explicitWaitFunction(LondonTab);
		LondonTab.click();
		System.out.println(driver.findElement(By.xpath("//div[@id=\"London\"]/h3")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id=\"London\"]/p")).getText());
		Thread.sleep(1000);
		WebElement ParisTab = driver.findElement(By.xpath("//button[contains(text(),\"Paris\")]"));
		explicitWaitFunction(ParisTab);
		ParisTab.click();
		System.out.println(driver.findElement(By.xpath("//div[@id=\"Paris\"]/h3")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id=\"Paris\"]/p")).getText());
		WebElement TokyoTab = driver.findElement(By.xpath("//button[contains(text(),\"Tokyo\")]"));
		explicitWaitFunction(TokyoTab);
		TokyoTab.click();
		System.out.println(driver.findElement(By.xpath("//div[@id=\"Tokyo\"]/h3")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id=\"Tokyo\"]/p")).getText());
		

	}

}
