package com.ta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class whatsApp {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@data-tab='3']")).sendKeys("Srinidhi B"+Keys.ENTER);
		WebElement textBox = driver.findElement(By.xpath("//div[@data-tab='1']"));
		textBox.sendKeys("automated text" + Keys.ENTER);
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Chats')]"))));
//		driver.findElement(By.xpath("//div[@class='eJ0yJ _13opk']/..")).click();
		
		
		System.out.println("Done");
	}

}
