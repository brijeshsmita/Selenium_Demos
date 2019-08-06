/**
 * 
 */
package com.sbk.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * @author Smita B Kumar
 *
 */
public class ChromeDriverUtil {
	public static WebDriver getDriver(){
		WebDriver driver;
		String chromeDriverKey="webdriver.chrome.driver";
		String chromeDriverPathValue="driver\\chromedriver.exe";
		
		System.setProperty(chromeDriverKey, chromeDriverPathValue);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");  
		options.addArguments("--enable-precise-memory-info"); 
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		return driver;
	}
}
