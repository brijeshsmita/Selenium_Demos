package com.sbk.selenium.webdriver;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebDriverTitleDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        File pathToBinary = new File("C:/Program Files/Mozilla Firefox/firefox.exe");
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		FirefoxBinary binary = new FirefoxBinary(pathToBinary);
		WebDriver driver = new FirefoxDriver(binary,firefoxProfile);
		
		String baseUrl = "http://docs.seleniumhq.org/";
        String expectedTitle = "Selenium - Web Browser Automation";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        // get the actual value of the title
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle))
        {
             System.out.println("Test Passed!");
         } 
         else
        {
             System.out.println("Test Failed");
         }      

         //Close browser window 
        // driver.close();
	}

}
