package com.webdriver.explicitwait;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author Smita B Kumar
 *
 */

public class TestExplicitWaits
{

	public static void main(String[] args) 
	{// objects and variables instantiation
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jsfiddle.net/tKQFN/");
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		/*An explicit wait is code you define to wait for a certain condition 
         * to occur before proceeding further in the code. 
         * The worst case of this is Thread.sleep(), 
         * which sets the condition to an exact time period to wait. 
         * There are some convenience methods provided 
         * that help you write code that will wait only as long as required. 
         * WebDriverWait in combination with 
         * ExpectedCondition is one way this can be accomplished.*/
		try{
			WebElement myDynamicElement = (new WebDriverWait(driver, 60))
					  .until(ExpectedConditions.elementToBeClickable(
							  By.xpath("//*[@id='register']")));
			}
		catch (TimeoutException e) 
		{
			System.out.println(e);
		}
	}
}
