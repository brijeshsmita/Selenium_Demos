package com.sbk.findElementBy;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithAlert {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/SeleniumWebDriverAT/Lesson05/src/AlertExample.html");
		driver.findElement(By.name("btnAlert1")).click();
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
			String alrt = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.print(alrt);
			driver.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);	
		}
	}
}