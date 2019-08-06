package com.sbk.findElementBy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo02 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.opencart.com/");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("alert('Hello world');");
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		WebElement searchBox=driver.findElement(By.name("search"));
		
		searchBox.sendKeys("Phone");
		
		WebElement searchBtn=driver.findElement(By.className("input-group-btn"));
		
		searchBtn.click();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.id("input-search")).clear();
		driver.findElement(By.id("input-search")).sendKeys("Mac");
		Thread.sleep(5000);
		js.executeScript("document.getElementById('button-search').click();");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
		
		searchBox=driver.findElement(By.name("search"));
		
		searchBox.clear();
		
		searchBox.sendKeys("TV");
		Thread.sleep(5000);
		searchBtn=driver.findElement(By.xpath("//*[@id='search']/span/button"));
		
		js.executeScript("arguments[0].click();", searchBtn);
		
		Thread.sleep(5000);
		
		driver.quit();


	}

}
