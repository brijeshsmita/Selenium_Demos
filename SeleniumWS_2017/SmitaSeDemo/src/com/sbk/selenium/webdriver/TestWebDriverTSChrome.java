package com.sbk.selenium.webdriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestWebDriverTSChrome 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:/Selenium Libs - Latest/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
	}

}
