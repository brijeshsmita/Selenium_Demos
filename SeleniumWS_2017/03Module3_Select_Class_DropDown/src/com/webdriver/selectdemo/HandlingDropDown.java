package com.webdriver.selectdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
/*import static org.junit.Assert.*;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



*/
/**
 * @author Smita B Kumar
 *
 */

public class HandlingDropDown{
	WebDriver driver;
	/**
	 * Set up browser settings and open the application
    */
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
	}
	/**
	 * Test to select the dropdown values
	 * @throws InterruptedException
	 */
	@Test
	public void testSelectFunctionality() throws InterruptedException{
		driver.get("file:///D:/Selenium/SeleniumWS/03Module3_Select_Class_DropDown/DemoWebAlert.html");
		System.out.println("DemoWebAlert.html file opened in firefox browser");
		Thread.sleep(5000);
		//goto the google
		driver.findElement(By.linkText("Google")).click();
		System.out.println("Navigated to google page");
		//navigate back to the previous webpage
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("navigate back to the previous webpage");
		Thread.sleep(5000);
		
		//select the first operator using "select by value"
		Select selectByValue=new Select(driver.findElement(By.id("SelectID_One")));
		selectByValue.selectByValue("greenvalue");
		System.out.println("Green Value selected...");
		Thread.sleep(5000);
		
		// select the second dropdown using "select by visible text"
		Select selectByVisibleText =new Select(driver.findElement(By.id("SelectID_Two")));
		selectByVisibleText.selectByVisibleText("Lime");
		System.out.println("Lime selected...");
		Thread.sleep(5000);
		
		// select the third dropdown using "select by index"
		Select selectByIndex =new Select(driver.findElement(By.id("SelectID_Three")));
		selectByVisibleText.selectByIndex(2);
		System.out.println("index 2 selected ...");
		Thread.sleep(5000);
	}
	/**Tear down the setup after test completes
	 * */
	@After
	public void tearDown(){
		driver.quit();
	}
}