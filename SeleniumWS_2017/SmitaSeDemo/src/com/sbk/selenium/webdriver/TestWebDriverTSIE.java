package com.sbk.selenium.webdriver;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.*;

public class TestWebDriverTSIE 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","F:/Selenium Libs - Latest/IEDriverServer_Win32_2.39.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com/");
	}
}