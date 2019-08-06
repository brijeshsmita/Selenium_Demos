package com.webdriver.explicitwait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
/**
 * @author Smita B Kumar
 *
 */

public class TestImplicitWaits
{
	//implicit wait provide to load DOM object for a particular of time before trying to locate element on page.
	//Default implicit wait is 0. We need to set implicit wait once and it apply for whole life of Webdriver object.

	public static void main(String[] args)
	{
		String baseUrl; // objects and variables instantiation
		baseUrl = "http://www.wikipedia.org/";
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	/*An implicit wait is to tell WebDriver to poll the DOM for a 
	 * certain amount of time when trying to find an element 
	 * or elements if they are not immediately available. 
	 * The default setting is 0. Once set, the implicit wait is 
	 * set for the life of the WebDriver object instance.
	 * */

		driver.get(baseUrl + "/wiki/Main_Page");
		driver.findElement(By.id("searchInput")).clear();
		driver.findElement(By.id("searchInput")).sendKeys("India");
		driver.findElement(By.id("searchButton")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.quit(); 
	}
}
