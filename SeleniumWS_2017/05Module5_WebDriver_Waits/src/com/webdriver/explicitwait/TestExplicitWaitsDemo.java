package com.webdriver.explicitwait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author Smita B Kumar
 *
 */

public class TestExplicitWaitsDemo 
{

	public static void main(String[] args)
	{
		// objects and variables instantiation
        String baseUrl; 
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
        baseUrl = "http://www.wikipedia.org/";
        driver.get(baseUrl + "/wiki/Main_Page");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        /*An explicit wait is code you define to wait for a certain condition 
         * to occur before proceeding further in the code. 
         * The worst case of this is Thread.sleep(), 
         * which sets the condition to an exact time period to wait. 
         * There are some convenience methods provided 
         * that help you write code that will wait only as long as required. 
         * WebDriverWait in combination with 
         * ExpectedCondition is one way this can be accomplished.*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(
        		By.id("searchInput")));
        driver.findElement(By.id("searchInput")).clear();     
        driver.findElement(By.id("searchInput")).sendKeys("India");
        driver.findElement(By.id("searchButton")).click();
        
        driver.quit(); 
	}
}
