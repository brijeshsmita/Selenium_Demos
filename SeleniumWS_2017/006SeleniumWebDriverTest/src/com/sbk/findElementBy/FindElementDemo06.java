package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementDemo06
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.opencart.com/");
		
		Thread.sleep(10000);

		//Featured xpath
		String text=driver.findElement(By.xpath("//*[@id='content']/h3")).getText();
		
		System.out.println("Text : "+text);
		
		System.out.println("\n**************\n\nDiv text:");
		
		//1st Featured div
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div")).getText());
		
		driver.quit();

	}
}