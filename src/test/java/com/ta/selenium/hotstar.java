package com.ta.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hotstar {

	public static void main(String[] args) throws Exception {
		// automate hotstar.com

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/us");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement popularMovie = driver.findElement(By.xpath("//a[contains(text(),'Popular Movies')]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(popularMovie));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", popularMovie);
		System.out.println("Scrolled to popular movie");
		Thread.sleep(5000);
		
		WebElement scrollRightToEle = driver.findElement(By.xpath("//a[contains(text(),'Popular Movies')]/../../../div[2]/div/div/div/div[@data-index='19']"));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", scrollRightToEle);
		System.out.println("Scrolled to right side RAID movie");
		Thread.sleep(3000);
		WebElement movieRaid = driver.findElement(By.xpath("//a[contains(text(),'Popular Movies')]/../../../div[2]/div/div/div/div[@data-index='19']//a"));
		movieRaid.click();
		System.out.println("movie clicked");
		WebElement actionPlay = driver.findElement(By.xpath("//div[@class='action-holder']//a"));
		wait.until(ExpectedConditions.visibilityOf(actionPlay));
		actionPlay.click();
		System.out.println("watch movie clicked");
		Thread.sleep(3000);
		WebElement trailerHead = driver.findElement(By.xpath("//a[contains(text(),'Trailers')]"));
		wait.until(ExpectedConditions.visibilityOf(trailerHead));
		trailerHead.click();
		System.out.println("Trailer Link clicked");
		Thread.sleep(3000);
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'Trailers')]"));
		wait.until(ExpectedConditions.visibilityOf(header));
		System.out.println("kHeader appeared.");
		WebElement trailerLink = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/a[1]"));
		wait.until(ExpectedConditions.visibilityOf(trailerLink));
		trailerLink.click();
		System.out.println("Trailer played.");
		
//		WebElement endOfPage = driver.findElement(By.xpath("//p[contains(text(),'© 2020 STAR. All Rights Reserved.')]"));
//		wait.until(ExpectedConditions.visibilityOf(endOfPage));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", endOfPage);
//		System.out.println("scrolled to end of page.");
		

	}

}
