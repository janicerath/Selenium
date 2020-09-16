package com.ta.selenium;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yahooMail extends BrowserUtility{;
	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		driver.get("https://mail.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (driver.findElement(By.xpath("//a//span[contains(text(),'Sign in')]/..")).isDisplayed())
		{
			driver.findElement(By.xpath("//a//span[contains(text(),'Sign in')]/..")).click();
		
		}
		
		driver.findElement(By.id("login-username")).sendKeys("tse.janice@yahoo.com");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='persistent']"));
		if (checkBox.isSelected() == true) {
			driver.findElement(By.xpath("//input[@id='persistent']/..")). click(); 
		}
		Thread.sleep(1000);
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("Danielle1019");
		driver.findElement(By.id("login-signin")).click();
		
//		WebElement composeBtn = driver.findElement(By.xpath("//a[@data-test-id='compose-button']"));
//		explicitWaitFunction(composeBtn);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-test-folder-name='Inbox']")).click();
		
		
		/* Send email: Pass
		composeBtn.click();
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("janice_wmtse@yahoo.ca, papoo_rath@yahoo.com");
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Automated Email");
		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
		*/
		
		
//		explicitWaitFunction(driver.findElement(By.xpath("//ul[@class='M_0 P_0 ']")));
//		driver.findElement(By.xpath("//ul[@class='M_0 P_0 ']"));
//		
/*	for (int i=1; i<10; i++) {
			try {
				driver.findElement(By.xpath("//div[@data-test-id='mail-reader-sticky-header']//div[contains(text(),'June')]")).isDisplayed();
				System.out.println("June displayed");
				
			} catch (Exception e){
				((JavascriptExecutor) driver).executeScript("//ul[@class='M_0 P_0 ']").animate({scrollTop:\”100px\”});
						
			}
			
		}
		for(int i=1;i<=10;i++){
	        try{
		clickElementWhenClickable(By.xpath("//*[@id,'ui-id-2']/li[contains(text(),'test1@webkul.com']"), 2, driver);
		break;
	        }  
	        catch(TimeoutException e){
		js = (JavascriptExecutor) driver;
		js.executeScript("$(\"#ui-id-2\").animate({ scrollTop: \""+100*i+"px\" })");
	        }
	        }
	        */
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//div[@data-test-id='mail-reader-sticky-header']//div[contains(text(),'June')]")));
		
		
		System.out.println("Done");
		
	}	
}
