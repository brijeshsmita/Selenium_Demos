package com.sbk.findElementBy;
import java.util.concurrent.TimeUnit;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitForPageLoadDemo01
{

	public static void main(String[] args) throws InterruptedException
	{
		Date startdate=new Date();
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.opencart.com/");
		
		//Sets the amount of time to wait for a page load to complete before throwing
		//an error. If the timeout is negative, page loads can be indefinite
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement searchBox=driver.findElement(By.name("search"));
		
		searchBox.sendKeys("Phone");
		
		driver.findElement(By.className("input-group-btn")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		Date enddate=new Date();
		System.out.println(startdate.toLocaleString());
		System.out.println(enddate.toLocaleString());

	}

}
