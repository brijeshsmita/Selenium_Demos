/**
 * 
 */
package com.smgmoduble9.utilities;

import javax.tools.Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Smita B Kumar
 *
 */
public class GcritLogin {
	/**
	 * Login the Test application
	 *
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		try {
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
			// Enter User Name
			////Step 3: Finding element by name and sending the key i.e input data
			//driver.findElement(By.name("username")).sendKeys("admin");
			/*OR*/
			WebElement userName = driver.findElement(By.name("username"));
			userName.clear();
			userName.sendKeys(username);
			// Enter Password
			WebElement passWord = driver.findElement(By.name("password"));
			passWord.clear();
			passWord.sendKeys(password);
			// Click on the Sign In Button
			WebElement signin = driver.findElement(By.id("tdb1"));
			signin.click();
			driver.manage().window().maximize();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
