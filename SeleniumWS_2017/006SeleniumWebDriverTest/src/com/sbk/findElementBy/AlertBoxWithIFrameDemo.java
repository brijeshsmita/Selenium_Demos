package com.sbk.findElementBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxWithIFrameDemo
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new FirefoxDriver();

		driver.get("file:///D:/SeleniumWebDriverAT/Lesson05/src/AlertBoxWithIFrameDemo.html");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(5000);
		
		Alert confirm=driver.switchTo().alert();
		
		confirm.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(5000);
		
		confirm=driver.switchTo().alert();
		
		confirm.dismiss();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(5000);
		
		Alert prompt=driver.switchTo().alert();
		
		String text=prompt.getText();
		System.out.println(text);
		
		prompt.sendKeys("Shubhasmit");
		
		Thread.sleep(5000);
		
		prompt.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		
		Thread.sleep(5000);
		
		prompt=driver.switchTo().alert();
		
		prompt.dismiss();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
