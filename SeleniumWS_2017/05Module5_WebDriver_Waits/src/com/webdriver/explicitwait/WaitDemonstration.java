package com.webdriver.explicitwait;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*Import above packages prior to the script creation. 
 * The packages refer to the Select class which 
 * is required to handle the dropdown
 * */
/**
 * @author Smita B Kumar
 *
 */

public class WaitDemonstration {
	// created reference variable for WebDriver
	WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {
		// objects and variables instantiation
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");				
		// initializing driver variable using FirefoxDriver
		driver=new FirefoxDriver();
		// launching gmail.com on the browser
		driver.get("https://gmail.com");
		// maximized the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		// saving the GUI element reference into a "username" variable of WebElement type
		WebElement username = driver.findElement(By.id("Email"));
		// entering username
		username.sendKeys("smitabrijesh");
		// entering password
		driver.findElement(By.id("Passwd")).sendKeys("password");
		// clicking signin button
		driver.findElement(By.id("signIn")).click();
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	/*We create a reference variable “wait” for 
	 * WebDriverWait class and instantiate it using WebDriver
	 * instance and maximum wait time for the execution
	 * to layoff. The maximum wait time quoted is 
	 * measured in “seconds”.
	 * */
	}
	@After
	public void teardown() {
		// closes all the browser windows opened by web driver
		driver.quit();         
	}
}














