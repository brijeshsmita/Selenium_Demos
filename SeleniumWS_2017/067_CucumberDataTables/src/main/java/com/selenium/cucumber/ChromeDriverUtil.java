/**
 * 
 */
package com.selenium.cucumber;
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
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = getDriver();//new ChromeDriver();
        driver.get("https://www.google.co.in/");
        System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
        driver.close();
	}
}
