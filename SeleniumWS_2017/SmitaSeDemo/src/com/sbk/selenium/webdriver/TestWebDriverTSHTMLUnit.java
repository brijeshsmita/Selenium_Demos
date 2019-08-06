package com.sbk.selenium.webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestWebDriverTSHTMLUnit
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// Create a new instance of the HTMLUnit driver
        WebDriver driver = new HtmlUnitDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com/");         
        System.out.println("Page title is: " + driver.getTitle()); 
	}
}