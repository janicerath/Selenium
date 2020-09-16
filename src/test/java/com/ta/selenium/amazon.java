package com.ta.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement labelSignin = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(labelSignin));
		WebElement linkSignIn = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		linkSignIn.click();
		
		WebElement labelSignInPage = driver.findElement(By.xpath("//h1[contains(text(),'Sign-In')]"));
		wait.until(ExpectedConditions.visibilityOf(labelSignInPage));
		WebElement phEmail = driver.findElement(By.xpath("//input[@id='ap_email']"));
		phEmail.clear();
		phEmail.sendKeys("janice_wmtse@yahoo.ca");
		WebElement bContinue = driver.findElement(By.xpath("//input[@id='continue']"));
		bContinue.click();
		WebElement labelPassword = driver.findElement(By.xpath("//label[contains(text(),'Password')]"));
		wait.until(ExpectedConditions.visibilityOf(labelPassword));
		WebElement phPassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
		phPassword.clear();
		phPassword.sendKeys("Danielle1019");
		WebElement bSignin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		bSignin.click();
		Thread.sleep(4000);
		
		//WebElement endOfPage = driver.findElement(By.xpath("//a[contains(text(),'Privacy Notice')]"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", endOfPage);
		WebElement searchPH = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//((JavascriptExecutor) driver).executeScript("argument[0].scrollIntoView()", searchPH);
		//Thread.sleep(2000);
		searchPH.sendKeys("Nathan VaporZach 2.5L Race Vest");
		searchPH.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		WebElement hydraVest = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small']//span[contains(text(),'Nathan VaporZach 2.5L Race Vest')]/.."));
		wait.until(ExpectedConditions.visibilityOf(hydraVest));
		hydraVest.click();
		WebElement sizeDD = driver.findElement(By.xpath("//select[@id='native_dropdown_selected_size_name']"));
		Select select = new Select (sizeDD);
		select.selectByValue("1,B077ZKSXD8");
		WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		wait.until(ExpectedConditions.visibilityOf(addToCart));
		addToCart.click();
		

	}

}
