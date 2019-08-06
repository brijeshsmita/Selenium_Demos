package com.sbk.selenium.webdriver;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SwitchWindow 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		File pathToBinary = new File("C:/Program Files/Mozilla Firefox/firefox.exe");
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		FirefoxBinary binary = new FirefoxBinary(pathToBinary);
				
		WebDriver driver = new FirefoxDriver(binary,firefoxProfile);
		
		driver.get("file:///F:/WebDriverJavaDemos-HTML%20Pages/Lesson%205-HTML%20Pages/PopupWin.html");
		
		String parentWindow = driver.getWindowHandle().toString();
		
		driver.findElement(By.name("Open")).click();
		driver.switchTo().window("PopupWindow");
		driver.close();
		
		driver.switchTo().window(parentWindow);
		driver.close();

	}
}