package com.webdriver.explicitwait;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author Smita B Kumar
 */
public class TestExplicitWaitWithAlert
{

	public static void main(String[] args) throws TimeoutException
	{
		// objects and variables instantiation
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium/SeleniumWS/05Module5_WebDriver_Waits/src/com/webdriver/explicitwait/AlertExample.html");
		driver.findElement(By.name("btnAlert")).click();

		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());

			String alrt = driver.switchTo().alert().getText();
			System.out.print(alrt);
		}
		catch(Exception ex)
		{
			System.out.println(ex);	
		}
	}
}
