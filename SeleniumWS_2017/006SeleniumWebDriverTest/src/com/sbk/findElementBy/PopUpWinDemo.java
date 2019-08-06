package com.sbk.findElementBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpWinDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();

		driver.get("file:///D:/SeleniumWebDriverAT/Lesson05/src/PopUpWinDemo.html");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("newtab")).click();
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window: "+parentWindow);
		
		for (String childWindow : driver.getWindowHandles())
		{
		  if(!childWindow.equals(parentWindow))
		 {
						driver.switchTo().window(childWindow);
						driver.findElement(By.id("alert")).click();
						Alert alert=driver.switchTo().alert();
						alert.accept();
						System.out.println("Window: "+childWindow);
		}
		}
		
		for (String childWindow : driver.getWindowHandles())
		{
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(childWindow);
				break;
			}
		}
		
		Thread.sleep(5000);

		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}