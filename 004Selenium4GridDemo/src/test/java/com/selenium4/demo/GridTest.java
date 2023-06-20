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
class GridTest {

	@Test
	  public void remoteTest(){
	    ChromeOptions chromeOptions = new ChromeOptions();
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability(CapabilityType.BROWSER_NAME,"chrome");

	    caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	    WebDriver driver = null;
	    try {
	      driver = new RemoteWebDriver(URI.create("http://localhost:4444/").toURL(), caps);
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    }
	    driver.navigate().to("https://www.swtestacademy.com");

	    WebElement logo = driver.findElement(By.className("site-logo"));

	    System.out.println(logo.isDisplayed());
	  }

}
