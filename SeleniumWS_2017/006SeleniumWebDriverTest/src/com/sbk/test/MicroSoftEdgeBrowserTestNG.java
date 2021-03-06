/**
 * 
 */
package com.sbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

/**
 * @author Smita B Kumar
 *
 */
public class MicroSoftEdgeBrowserTestNG {
	String driverPath = "D:\\Selenium\\Software\\MicrosoftDriver";/*"<path to Microsoft edge driver>"*/
	public WebDriver driver;
	
	@Test(priority=1)
	public void launchBrowser() {
		System.out.println("launching Microsoft Edge browser");
		System.setProperty("webdriver.edge.driver", driverPath+"MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
	}

	@Test(priority=2)
	public void openEdgeBrowser() {
		driver.navigate().to("http://www.google.com");
	}
	
	@Test(priority=3)
	public void closeDriver() {
		if(driver!=null) {
			driver.close();
		}
	}	

}
