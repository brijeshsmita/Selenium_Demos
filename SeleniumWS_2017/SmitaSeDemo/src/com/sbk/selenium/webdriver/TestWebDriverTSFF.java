package com.sbk.selenium.webdriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;
import java.io.*;

public class TestWebDriverTSFF 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Hello Selenium");
		
		File pathToBinary = new File("C:/Program Files/Mozilla Firefox/firefox.exe");
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		FirefoxBinary binary = new FirefoxBinary(pathToBinary);
		WebDriver driver = new FirefoxDriver(binary,firefoxProfile);
		
		driver.get("https://www.google.co.in/");

	}

}
