package com.sbk.findElementBy;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SyncDemo
{

	
	public static void main(String[] args) throws InterruptedException
	{
		Date startdate=new Date();
		
		//Create a new instance of firefox driver
		WebDriver driver=new FirefoxDriver();
		
		//Use the driver to visit the URL
		driver.get("http://demo.opencart.com/");
		
		//Wait for 10 sec
		Thread.sleep(10000);
		
		//Find the search box using name
		WebElement searchBox=driver.findElement(By.name("search"));
		
		//Type DATA in the search box
		searchBox.sendKeys("Phone");
		
		//Wait for 5 sec
		Thread.sleep(5000);
		
		//Find the search button and click on it
		driver.findElement(By.xpath("//*[@id='search']/span/button")).click();
		
		//Wait for 10 sec
		Thread.sleep(10000);
		
		//Closing the browser
		driver.quit();
		Date enddate=new Date();
		
		System.out.println(startdate.toLocaleString());
		System.out.println(enddate.toLocaleString());
	}

}
