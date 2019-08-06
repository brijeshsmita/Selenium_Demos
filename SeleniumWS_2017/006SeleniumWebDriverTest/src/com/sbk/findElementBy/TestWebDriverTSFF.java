package com.sbk.findElementBy;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriverTSFF
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.out.println("Hello Selenium");
		Thread.sleep(5000);
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		
		driver.get("http://www.seleniumhq.org/");
		Thread.sleep(5000);
		driver.quit();
	}

}
