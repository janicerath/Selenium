package com.ta.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sel_day1 {

	public static void main(String[] args) throws Exception {
		
		
		/*first way or the smart way to launch browser is to use the webdrivermanager tool
		 * the code is converted to JSON wire protocol over HTTP and sent to respective browser driver
		 * it then gets the action, in this case setup() response back from browserdriver and it gets launched.
		 * smart way because we dont have to download the driver .exe therefore we dont have to worry about brwoser version.
		 * 
		 * WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(); */
		
		/* second way to launch browser by physically downloading the browser driver.exe from seleniumhq wesbsite,
		 * then use System.getProperty() to open the browser driver .exe file
		 * not a great way to lauch browser because whenever a browser is updated, we have to download the update .exe file for the browser.
		 * 
		WebDriver driver;
		System.getProperty("webdriver.chrome.driver", "user.dir","\\chromedriver.exe");
		driver = new ChromeDriver();
		*/
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielle's Ideapad\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://qa-tekarch.firebaseapp.com");
		
		
		/*
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		
		
		driver.findElement(By.id("email_field")).click();
		driver.findElement(By.id("email_field")).clear();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).clear();
		driver.findElement(By.id("password_field")).sendKeys("admin123");;
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Home')]"))));
		
		
		
		//System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/a[1]")).isDisplayed());  //home page after login
		
		*/
	}

}
