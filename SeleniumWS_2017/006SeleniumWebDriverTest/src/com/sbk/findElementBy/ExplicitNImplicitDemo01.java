package com.sbk.findElementBy;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitNImplicitDemo01
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.opencart.com/");
		
		//WebElement searchBox=driver.findElement(By.name("search2"));
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		Date strtdate=new Date();
		System.out.println(strtdate);
		WebElement searchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search2")));	
		Date endDate=new Date();
		System.out.println(endDate);
		searchBox.sendKeys("Phone");
		
		driver.findElement(By.className("input-group-btn")).click();
		
		//Thread.sleep(5000);
		
		driver.quit();
	}

}
