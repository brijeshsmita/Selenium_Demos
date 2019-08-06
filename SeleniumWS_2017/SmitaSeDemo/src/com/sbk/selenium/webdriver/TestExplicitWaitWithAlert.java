package com.sbk.selenium.webdriver;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExplicitWaitWithAlert
{

	public static void main(String[] args) throws TimeoutException
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/WebDriverJavaDemos-HTML%20Pages/Lesson%205-HTML%20Pages/AlertExample.html");
		//driver.findElement(By.name("btnAlert")).click();
		
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
