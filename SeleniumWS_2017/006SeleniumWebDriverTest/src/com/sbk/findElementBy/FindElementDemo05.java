package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementDemo05
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.opencart.com/");
		
		Thread.sleep(10000);

		WebElement searchBox=driver.findElement(By.name("search"));
		
		searchBox.sendKeys("Phone");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("input-group-btn")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='search']/span/button")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='search']/span/button")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.name("search")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.name("search")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		
		searchBox=driver.findElement(By.name("search"));
		searchBox.clear();
		searchBox.sendKeys(Keys.chord(Keys.SHIFT,"p"));
		searchBox.sendKeys(Keys.chord("h"));
		searchBox.sendKeys(Keys.chord("one"));
		Thread.sleep(5000);
		
		searchBox.sendKeys(Keys.BACK_SPACE);
		searchBox.sendKeys(Keys.BACK_SPACE);
		searchBox.sendKeys(Keys.BACK_SPACE);
		
		Thread.sleep(5000);
		searchBox.clear();
		
		searchBox.sendKeys(Keys.NUMPAD0);
		searchBox.sendKeys(Keys.NUMPAD1);
		searchBox.sendKeys(Keys.NUMPAD2);
		searchBox.sendKeys(Keys.NUMPAD3);
		
		Thread.sleep(5000);
		searchBox.clear();
		
		searchBox.sendKeys(Keys.F11);
		Thread.sleep(5000);
		searchBox.sendKeys(Keys.F11);
		
		Thread.sleep(5000);
		
		searchBox.sendKeys(Keys.F5);
		
		Thread.sleep(10000);
		
		driver.quit();

	}

}
