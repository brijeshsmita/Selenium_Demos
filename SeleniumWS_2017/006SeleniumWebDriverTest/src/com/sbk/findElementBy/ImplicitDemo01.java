package com.sbk.findElementBy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ImplicitDemo01
{

	public static void main(String[] args) 
	{

		 WebDriver driver;
         String baseUrl; 
         
         driver = new FirefoxDriver();
         baseUrl = "http://www.wikipedia.org/";
         
 	      //implicit wait provide to load DOM object for a particular of time before trying
         //to locate element on page.
 		 //Default implicit wait is 0. We need to set implicit wait once and it apply for
         //whole life of Webdriver object.
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         driver.get(baseUrl + "/wiki/Main_Page");
         driver.findElement(By.id("searchInput")).clear();
         driver.findElement(By.id("searchInput")).sendKeys("India");
         driver.findElement(By.id("searchButton")).click();
         
         driver.quit(); 

	}
}