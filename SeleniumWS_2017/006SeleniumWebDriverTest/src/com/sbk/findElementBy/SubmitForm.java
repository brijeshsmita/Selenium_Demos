package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmitForm
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.opencart.com/index.php?route=account/register");
		
		Thread.sleep(10000);

		driver.findElement(By.id("input-firstname")).sendKeys("Shubhasmit");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("input-lastname")).sendKeys("Gupta");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}
}