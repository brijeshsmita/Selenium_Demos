package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;;

public class SwitchWindow
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Selenium%20Latest%20Demos/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/PopupWin.html");
		String parentWindow = driver.getWindowHandle().toString();
		Thread.sleep(5000);
		
		driver.findElement(By.name("Open")).click();
		Thread.sleep(5000);
		
		driver.switchTo().window("PopupWindow");
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		driver.close();

	}

}
