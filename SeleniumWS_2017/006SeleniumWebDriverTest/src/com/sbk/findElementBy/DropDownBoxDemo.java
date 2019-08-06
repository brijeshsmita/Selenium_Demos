package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxDemo
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
		
		Select selectCountry=new Select(driver.findElement(By.id("input-country")));
		
		selectCountry.selectByIndex(2);
		
		Thread.sleep(5000);
		
		selectCountry.selectByValue("38");
		
		Thread.sleep(5000);
		
		selectCountry.selectByVisibleText("India");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
