package com.ta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sel_day5_switchTo_iFrame extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		login();
		//iframe
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p")).getText());
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),\"File\")]")).getText());
		
		
		
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
