package com.sbk.findElementBy;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InterrogationAPIDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		String url="http://demo.opencart.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		String pageTitle=driver.getTitle();
		
		System.out.println("Page title is: "+pageTitle);
		
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		String pageDOM=driver.getPageSource();
		System.out.println("**********Pgae Source**********");
		System.out.println(pageDOM);
		System.out.println("********************************");
		
		if(pageTitle.equals("Your Store"))
		{
			System.out.println("Expected title is present");
		}
		else
		{
			System.out.println("Expected title is not present");
		}
		
		if(url.equals(driver.getCurrentUrl()))
		{
			System.out.println("URL same");
		}
		else
		{
			System.out.println("URL NOT same");
		}
		
		System.out.println("Page contains 'Featured' :"+pageDOM.contains("Featured"));
			
		driver.quit();
		
	}

}