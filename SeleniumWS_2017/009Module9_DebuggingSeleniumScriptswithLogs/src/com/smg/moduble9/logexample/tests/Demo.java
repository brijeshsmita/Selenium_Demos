/**
 * 
 */
package com.smg.moduble9.logexample.tests;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Smita B Kumar
 *
 */
public class Demo {
	static Logger log = Logger.getLogger(Demo.class.getName());
	@Test
	public void testGmailLogin() throws Exception {
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
		log.info("Launch the FirefoxDriver browser ");
		log.info("Opening - http://www.gcrit.com/build3/admin/login.php");
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		//Note (install firebug plugin in mozilla)
		// Enter User Name
		////Step 3: Finding element by name and sending the key i.e input data
		//driver.findElement(By.name("username")).sendKeys("admin");
		/*OR*/
		// enter a valid email address
		//Note (install firebug plugin in mozilla)
		//Step 3: Finding element by name and sending the key i.e input data
		driver.findElement(By.name("username")).sendKeys("admin");
		log.info("Entered a valid Email Address.");
		driver.findElement(By.name("password")).sendKeys("admi@123");
		log.info("Entered a valid Password.");
		//Step 4: Finding element by id i.e button click
		driver.findElement(By.id("tdb1")).click();
		log.info("Clicked on the Sign In Button.");
		//Step 5: getting the current Url
		String strUrl=driver.getCurrentUrl();
		try {
			// Verify the home page
			assertTrue(
					"Verification Failed: User successfully landed on the Home Page.",
					driver.getTitle().equals("GCR Shop"));
			log.info("Verified that the user landed on the Index Page.");
		} catch (Exception e) {
			log.error("Unsuccessfull Login.");
		}

	}

}
