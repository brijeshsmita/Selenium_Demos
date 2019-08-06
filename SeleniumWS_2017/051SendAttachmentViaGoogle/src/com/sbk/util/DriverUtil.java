/**
 * 
 */
package com.sbk.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Smita B Kumar
 *
 */
public class DriverUtil {
	public static WebDriver getDriver(){
		WebDriver driver;
		String geckoDriverKey="webdriver.gecko.driver";
		String geckoDriverPathValue="E:\\Selenium\\Software\\geckodriver-v0.17.0-win64\\geckodriver.exe";
		
		System.setProperty(geckoDriverKey
				, geckoDriverPathValue);
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

	    capabilities.setCapability("marionette", true);
	    driver = new FirefoxDriver(capabilities);
	   

		return driver;
	}
}
