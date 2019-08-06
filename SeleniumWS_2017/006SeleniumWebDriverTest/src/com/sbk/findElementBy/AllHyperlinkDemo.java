package com.sbk.findElementBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class AllHyperlinkDemo
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver = new FirefoxDriver();
		//String baseURL = "http://demo.opencart.com/";
		
		String baseURL = "http://demo.opencart.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;
 
        //extract the link texts of each link element
        for (WebElement e : linkElements)
        {
            linkTexts[i] = e.getText();
            System.out.println("The hyperlink-text is " + e.getText());
            i++;
        }
        
        for (String t : linkTexts)
        {
            driver.findElement(By.linkText(t)).click();
            Thread.sleep(5000);
            driver.navigate().back();
        }
        driver.quit();
	}

}
