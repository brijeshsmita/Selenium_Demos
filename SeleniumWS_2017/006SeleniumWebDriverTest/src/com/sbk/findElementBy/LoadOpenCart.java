package com.sbk.findElementBy;
//It contains the WebDriver class required to instantiate a new browser loaded with a specific driver.
import org.openqa.selenium.*;

//It contains the FirefoxDriver class required to instantiate a FireFox specific driver into the browser
//instantiated by the WebDriver class
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadOpenCart
{

	public static void main(String[] args) throws InterruptedException
	{
		//A FirefoxDriver class with no parameters means that the default FireFox profile will be launched
		//by our Java program. The default FireFox profile is similar to launching FireFox in safe mode
		//(no extensions are loaded).
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(5000);
		
		//WebDriver's get() method is used to launch a new browser session and directs it to the URL that you
		//specify as its parameter.
		driver.get("http://demo.opencart.com/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//It closes only the browser window that WebDriver is currently controlling.
		//driver.quit();
		
		//It closes all windows that WebDriver has opened.
		driver.close();
	}
}