package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class BlockLevelHyperlinkDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		String baseURL = "file:///D:/SeleniumWebDriverAT/Lesson05/src/BlockLevelHyperlinkDemo.html";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.quit();
	}

}
