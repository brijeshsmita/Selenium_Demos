package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HyperlinkDemo
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver = new FirefoxDriver();
		String baseURL = "file:///D:/SeleniumWebDriverAT/Lesson05/src/HyperlinkDemo.html";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		//Using linkText locator
		driver.findElement(By.linkText("CLICK HERE!")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		//Using partialLinkText locator
		driver.findElement(By.partialLinkText("ME")).click();

		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

}
