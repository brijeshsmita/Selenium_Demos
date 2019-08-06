/**
 * 
 */
package com.sbk.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Smita B Kumar
 *
 */
public class DriverUtil {
	public static WebDriver getDriver(){
		WebDriver driver;
		String geckoDriverKey="webdriver.gecko.driver";
		String geckoDriverPathValue="D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe";
		
		System.setProperty(geckoDriverKey
				, geckoDriverPathValue);
		driver =new FirefoxDriver();
		return driver;
	}
}
