/**
 * First Selenium WebDriver Test Case
 */
package com.sbk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Smita B Kumar
 *
 */
public class AdminLogin {
	public static void main(String[] args) {
		//Step 1: Launch the FirefoxDriver browser 
		//-creating object of FirefoxDriver using WebDriver interface reference.
		//WebDriver driver = new FirefoxDriver();//no need to explicitly download firefox driver as it is default driver
		//now the above code will launch FireFox driver with blank URL.
		//Step 2: Navigate to URL
		//selenium 3.0 
		/*
		 * You are using latest version of Selenium WebDriver i.e. Selenium 3.x, this version of webdriver doesn't support direct firefox launch. You have to set the SystemProperty for webdriver.gecko.driver.

			Replace the Code:-
			
			WebDriver driver;
			driver =new FirefoxDriver();
			With This code:-
			
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "<Path to your WebDriver>");
			driver =new FirefoxDriver();
		 */
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		//Note (install firebug plugin in mozilla)
		//Step 3: Finding element by name and sending the key i.e input data
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		//Step 4: Finding element by id i.e button click
		driver.findElement(By.id("tdb1")).click();
		
		//Step 5: getting the current Url
		String strUrl=driver.getCurrentUrl();
		
		//Step 6 :checking the current url with the expected
		if(strUrl.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Login successfull !!Test Case Pass");
		}else{
			System.out.println("Login unsuccessfull !!Test Case Failed");
		}
		//Step : close the browser
		driver.close();//close the browser
	}
}
