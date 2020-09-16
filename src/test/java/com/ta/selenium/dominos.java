package com.ta.selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dominos extends BrowserUtility{

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dominos.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> windowTabs = new ArrayList (driver.getWindowHandles());
		System.out.println(windowTabs.size());
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(By.xpath("//ul[@data-quid='header-main-navigation-desktop']//a[contains(text(), 'Order Online')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),' Store Locator ')]"))));
		driver.findElement(By.xpath("//span[@class='Carryout c-carryout circ-icons__icon  circ-icons__icon--carryout']")).click();   //carryout button
		driver.findElement(By.xpath("//input[@id='Postal_Code_Sep']")).sendKeys("77433");
		driver.findElement(By.xpath("//button[contains(text(),'Search Locations')]")).click();
		WebElement locationHeader = driver.findElement(By.xpath("//h1[contains(text(),'Location Results')]"));
		
		wait.until(ExpectedConditions.visibilityOf(locationHeader));
		
		driver.findElement(By.xpath("//a[@data-quid='locations-search-6636-order-carryout-button']")).click();  // Barker Cypress store

		WebElement menuHeader = driver.findElement(By.xpath("//h1[contains(text(),'Menu')]"));
		wait.until(ExpectedConditions.visibilityOf(menuHeader));
		driver.findElement(By.xpath("//a[@class='menu-panel__link']//span[contains(text(),'Build Your Own Pizza')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='pizzaCanvas']"))));
		
		driver.findElement(By.xpath("//input[@id='crust_type|14BK']")).click(); //brooklyn crust
		driver.findElement(By.xpath("//button[@id='toppings']")).click();  //toppings
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'No Thanks')]")).click(); //no thanks to cheese

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Premium Chicken')]/../input")).click();
		WebElement pineappleText = driver.findElement(By.xpath("//span[contains(text(),'Pineapple')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", pineappleText );
		
		driver.findElement(By.xpath("//span[contains(text(),'Pineapple')]/..//input")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Mushrooms')]/..//input")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Add to Order')]")).click(); //Add pizza
		
	}

}
