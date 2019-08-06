package com.sbk.selenium.webdriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExplicitWaitsDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		WebDriver driver;
        String baseUrl; 
        
        driver = new FirefoxDriver();
        baseUrl = "http://www.wikipedia.org/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get(baseUrl + "/wiki/Main_Page");
        WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));
        driver.findElement(By.id("searchInput")).clear();     
        driver.findElement(By.id("searchInput")).sendKeys("India");
        driver.findElement(By.id("searchButton")).click();
        
        //driver.quit(); 
	}
}
