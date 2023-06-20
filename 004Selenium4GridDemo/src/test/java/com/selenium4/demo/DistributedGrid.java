package com.selenium4.demo;

import java.net.MalformedURLException;
import java.net.URI;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * 
 * @author smitkuma
 *
 */

class DistributedGrid {

	@Test
	public void testSetUp() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");

		caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = null;
		String node = "http://localhost:4444/";
		caps.setBrowserName("chrome");
		try {
			driver = new RemoteWebDriver(URI.create(node).toURL(), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.navigate().to("https://www.swtestacademy.com");

		WebElement logo = driver.findElement(By.className("site-logo"));

		System.out.println(logo.isDisplayed());
	}

}
