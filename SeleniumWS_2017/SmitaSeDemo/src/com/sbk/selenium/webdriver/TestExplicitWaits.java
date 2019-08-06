package com.sbk.selenium.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExplicitWaits
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver myTestDriver = new FirefoxDriver();
		myTestDriver.get("http://jsfiddle.net/tKQFN/");
		
		//WebDriverWait wait = new WebDriverWait(myTestDriver,10);
		myTestDriver.manage().window().maximize();

		try{
			WebElement myDynamicElement = (new WebDriverWait(myTestDriver, 60))
					  .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='register']")));
			}
		catch (TimeoutException e) 
		{
			System.out.println(e);
		}
	}
}
