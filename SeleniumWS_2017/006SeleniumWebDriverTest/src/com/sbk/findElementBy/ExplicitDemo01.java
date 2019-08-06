package com.sbk.findElementBy;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		Date startdate=new Date();
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.opencart.com/");

		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		WebElement searchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
		
		searchBox.sendKeys("Phone");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("input-group-btn"))).click();
		
		driver.quit();
		
		Date enddate=new Date();
		System.out.println(startdate.toLocaleString());
		System.out.println(enddate.toLocaleString());

	}

}
