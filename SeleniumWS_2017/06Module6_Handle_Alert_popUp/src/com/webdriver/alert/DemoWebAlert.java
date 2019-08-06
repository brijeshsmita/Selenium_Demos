package com.webdriver.alert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author Smita B Kumar 
 */
public class DemoWebAlert {
	WebDriver driver;
	/**
	 * Constructor
	 */
	public DemoWebAlert() {                                  

	}
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
	 * Test to check Select functionality
	 * @throws InterruptedException
	 */
	@Test
	public void testWebAlert() throws InterruptedException{ 
		driver.get("file:///D:/Selenium/SeleniumWS/06Module6_Handle_Alert_popUp/DemoWebAlert.html");
		System.out.println("DemoWebAlert.html file opened in firefox browser");
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     
		// clicking on try it button
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
        		By.xpath("//button[contains(text(),'Try it')]")));
		// accepting javascript alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// clicking on try it button
		driver.findElement(
				By.xpath("//button[contains(text(),'Try it')]"))
				.click();
		// accepting javascript alert
		driver.switchTo().alert().dismiss();
		driver.findElement(
				By.xpath("//button[contains(text(),'Try it')]"))
				.click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	/**
	 * Tear down the setup after test completes	 */

	@After
	public void tearDown() {             
		driver.quit();
	}
}
