package com.sbk.findElementBy;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class sample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
			
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Hello.html");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.name("Laptops")); 
		Select se=new Select(element); 
		se.selectByValue("2");


	}

}
