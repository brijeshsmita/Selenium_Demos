package com.sbk.findElementBy;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuitDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.popuptest.com/popuptest2.html");
		Thread.sleep(10000);
		
	   //using QUIT all windows will close
	  //driver.quit();
		
		//using close will close current window
	    //driver.close();
	}
}