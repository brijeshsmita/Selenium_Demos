/**
 * 
 */
package com.smg.moduble10.javascript;

/**
 * @author Smita B Kumar
 *
 */
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.smg.moduble10.logexample.tests.Demo;


public class JSClickExample {
	WebDriver driver;
	static Logger log = Logger.getLogger(Demo.class.getName());

	@Test
	public void testClickJS() throws Exception {
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
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.amazon.com/");
		WebElement searchTextBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("Mobiles");
		WebElement goButton = driver.findElement(By.cssSelector("input[value=Go]"));
		safeJavaScriptClick(goButton);
	}
	
	public void safeJavaScriptClick(WebElement element) throws Exception {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click");

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("Unable to click on element");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM "+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to click on element "+ e.getStackTrace());
		}
	}
}
