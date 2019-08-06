package com.sbk.findElementBy;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationAPIDemo
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new FirefoxDriver();
			
		driver.get("http://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//OR
		driver.navigate().to("http://demo.opencart.com/index.php?route=product/category&path=57");
				
		Thread.sleep(5000);
			
		driver.navigate().refresh();
				
		Thread.sleep(5000);
				
		driver.navigate().back();
				
		Thread.sleep(5000);
				
		driver.navigate().forward();
				
		Thread.sleep(5000);
				
		driver.quit();
	}

}
