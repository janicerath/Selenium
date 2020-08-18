package com.ta.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;

public class sel_day4_widget extends BrowserUtility{

	public static void main(String[] args) throws Exception {

		launchBrowser("ch");
		login();
		WebElement eleWidgetButton = driver.findElement(By.xpath("//button[contains(text(),\"Widget\")]"));
		explicitWaitFunction(eleWidgetButton);
		eleWidgetButton.click();
		
		/*		//Table
		explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),\"Table\")]")));
		driver.findElement(By.xpath("//a[contains(text(),\"Table\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//p[contains(text(),\"Table\")]")));
		
		List<WebElement> tableRow = driver.findElements(By.xpath("//tr"));
		
		List<WebElement> tableHeader = tableRow.get(0).findElements(By.xpath("//th"));
				for (int thCount= 0; thCount<tableHeader.size(); thCount++)
					System.out.print(tableHeader.get(thCount).getText() +"\t");
				System.out.println();
		
			for (int rowCount=1; rowCount<tableRow.size(); rowCount++)
			{
				List<WebElement> tabledata = tableRow.get(rowCount).findElements(By.xpath("//tr"+"["+(rowCount+1)+"]"+"//td"));
				for (int columnCount = 0; columnCount<tabledata.size(); columnCount++)
				System.out.print(tabledata.get(columnCount).getText() +"\t");
				System.out.println();
			}
		*/
			
		//Autocomplete Textbox
		/*
		explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),\"AutoComplete\")]")));
		driver.findElement(By.xpath("//a[contains(text(),\"AutoComplete\")]")).click();
		WebElement countryPH = driver.findElement(By.id("myInput"));
		explicitWaitFunction(countryPH);
		countryPH.click();
		countryPH.sendKeys("un");
		autocompleteSelect("United States of America");
		Thread.sleep(2000);
	
		countryPH.clear();
		countryPH.sendKeys("co");
		int index = 5;
		List<WebElement> countrytoSelect = driver.findElements(By.xpath("//input[@id=\"myInput\"]/../div/div"));
		if (index < countrytoSelect.size())
		{
			System.out.println(countrytoSelect.get(index).getText());
			countrytoSelect.get(index).click();
		}
		*/
		
		//DatePicker
		/*
		explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),\"Date Picker\")]")));
		driver.findElement(By.xpath("//a[contains(text(),\"Date Picker\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//form[contains(text(),\"Birthday\")]")));
		WebElement dateBar = driver.findElement(By.xpath("//input[@type=\"date\"]"));
		dateBar.click();
		*/
		
		//Accordian
		explicitWaitFunction(driver.findElement(By.xpath("//a[contains(text(),\"Accordian\")]")));
		driver.findElement(By.xpath("//a[contains(text(),\"Accordian\")]")).click();
		WebElement section1 = driver.findElement(By.xpath("//button[contains(text(),\"Section 1\")]"));
		explicitWaitFunction(section1);
		section1.click();
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Section 1\")]/../div[1]/p")).isDisplayed());
		driver.findElement(By.xpath("//button[contains(text(),\"Section 3\")]")).click();
		explicitWaitFunction(driver.findElement(By.xpath("//button[contains(text(),\"Section 3\")]/../div[3]/p")));
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),\"Section 3\")]/../div[3]/p")).isDisplayed());
		
		
		
	}
		
}

	


