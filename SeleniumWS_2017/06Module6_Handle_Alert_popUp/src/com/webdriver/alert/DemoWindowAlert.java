package com.webdriver.alert;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
/**
 * @author Smita B Kumar 
 */

public class DemoWindowAlert {	
	WebDriver driver;		
	@Before		
	public void setUp()		
	{	
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://gmail.com");		
		driver.manage().window().maximize();
	}		

	@Test		
	public void testWindowAlert() throws Exception{	
		// enter a valid email address		
		driver.findElement(By.id("identifierId")).sendKeys("smitabrijesh@gmail.com");
		// enter a valid password		
		driver.findElement(By.id("Passwd")).sendKeys("pihusia@0507");
		// click on sign in button	
		driver.findElement(By.id("signIn")).click();		
		Thread.sleep(30000);	
		// click on compose button	
		driver.findElement(By.xpath("//div[@class='z0']//div[contains(text(),'COMPOSE')]")).click();		
		// click on attach files icon	
		driver.findElement(By.xpath("//div[contains(@command,'Files')]//div[contains(@class,'aaA')]")).click();		
		// creating instance of Robot class (A java based utility)		
		Robot rb =new Robot();		
		// pressing keys with the help of keyPress and keyRelease events		
		rb.keyPress(KeyEvent.VK_D);		
		rb.keyRelease(KeyEvent.VK_D);		
		Thread.sleep(12000);		
		rb.keyPress(KeyEvent.VK_SHIFT);		
		rb.keyPress(KeyEvent.VK_SEMICOLON);		
		rb.keyRelease(KeyEvent.VK_SEMICOLON);		
		rb.keyRelease(KeyEvent.VK_SHIFT);		
		rb.keyPress(KeyEvent.VK_BACK_SLASH);		
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);		
		Thread.sleep(12000);		
		rb.keyPress(KeyEvent.VK_P);		
		rb.keyRelease(KeyEvent.VK_P);		
		rb.keyPress(KeyEvent.VK_I);		
		rb.keyRelease(KeyEvent.VK_I);		
		rb.keyPress(KeyEvent.VK_C);		
		rb.keyRelease(KeyEvent.VK_C);		
		Thread.sleep(12000);		
		rb.keyPress(KeyEvent.VK_ENTER);		
		rb.keyRelease(KeyEvent.VK_ENTER);		
		Thread.sleep(22000);		
	}	

	@After	
	public void tearDown()		
	{		
		//driver.quit();		
	}	
}		
