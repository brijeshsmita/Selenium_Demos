package com.sbk.findElementBy;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementXpath 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		//Create a new instance of FireFox driver
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();	
		//Use the driver to visit the URL
		driver.get("http://demo.opencart.com/");
				
		//Wait for 10 seconds
		Thread.sleep(10000);
				
		//Find the search box using name
		WebElement searchBox=driver.findElement(By.name("search"));
				
		//Type data in the search box
		searchBox.sendKeys("Phone");
				
		//Wait for 5 seconds
		Thread.sleep(5000);
				
		//Find the search button and click on it
		driver.findElement(By.xpath("//*[@id='search']/span/button")).click();
				
		//Wait for 10 seconds
		Thread.sleep(10000);
						
		//Closing the browser
		driver.quit();

	}
}