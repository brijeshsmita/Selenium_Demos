package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.opencart.com/");
		
		Thread.sleep(10000);

		//Desktops xpath
		String attrValue=driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a")).getAttribute("href");
		
		System.out.println("href: "+attrValue);
		
		driver.get("http://demo.opencart.com/index.php?route=account/register");
		
		Thread.sleep(10000);
		
		WebElement lastName=driver.findElement(By.name("lastname"));
		
		System.out.println("ID: "+lastName.getAttribute("id"));
		System.out.println("Type: "+lastName.getAttribute("type"));
		System.out.println("Placeholder: "+lastName.getAttribute("placeholder"));
		System.out.println("Class: "+lastName.getAttribute("class"));
		System.out.println("Value: "+lastName.getAttribute("value"));
		
		Thread.sleep(5000);
		
		lastName.sendKeys("Gupta");
		Thread.sleep(2000);
		System.out.println("Value: "+lastName.getAttribute("value"));
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
