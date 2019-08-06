package com.sbk.findElementBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPositionDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.get("file:///D:/SeleniumWebDriverAT/Lesson05/src/PopUpWinDemo.html");
		
		Thread.sleep(5000);
		
		driver.manage().window().setPosition(new Point(50, 50));
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}