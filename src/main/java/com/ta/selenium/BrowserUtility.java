package com.ta.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	
	public static WebDriver driver;
	
	public static void launchBrowser (String browserName) {
		

		switch (browserName) {
		case ("ch"):
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case ("edge"):
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case ("ff"):
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
			default:
				break;
		}
	}
		
		
		public static void explicitWaitFunction(WebElement ele, int iTime) {
			
			WebDriverWait wait = new WebDriverWait(driver, iTime);
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		
		public static void explicitWaitFunction(WebElement ele) {
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		
		public static void login() {
			
			driver.manage().window().maximize();
			driver.get("https://qa-tekarch.firebaseapp.com");
			explicitWaitFunction(driver.findElement(By.xpath("//h3[contains(text(),'Web login')]")), 5);	
			
			driver.findElement(By.id("email_field")).clear();
			driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
			driver.findElement(By.xpath("//input[@id='password_field']")).clear();
			driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[contains(text(), 'Login to Account')]")).click();
			
			explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),\"Home\")]")));
		}
		
		public static void autocompleteSelect (String countryName) {
			try {
			explicitWaitFunction(driver.findElement(By.xpath("//input[@id=\"myInput\"]/../div/div")));
			List<WebElement> autocompleteList = driver.findElements(By.xpath("//input[@id=\"myInput\"]/../div/div"));
			for (WebElement optionToSelect : autocompleteList) 
			{
				if (optionToSelect.getText().equalsIgnoreCase(countryName))
					optionToSelect.click();
			}
			} catch(NoSuchElementException e) {
				System.out.println(e.getStackTrace());
			} 
			
		}
	}


