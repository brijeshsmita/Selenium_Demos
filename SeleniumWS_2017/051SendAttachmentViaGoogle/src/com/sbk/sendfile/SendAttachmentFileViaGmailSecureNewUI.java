/**
 * 
 */
package com.sbk.sendfile;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sbk.util.ChromeDriverUtil;

/**
 * @author Smita B Kumar
 *
 */
public class SendAttachmentFileViaGmailSecureNewUI {
	public static void main(String[] args) throws InterruptedException, AWTException {
		/*
		 * Scenario:

		Open gmail.com
		Enter username 
		Enter Password
		Click on SignIn
		Click on composeButton
		Add recipent
		Add Subject
		Click on attachment
		Add your File location
		Click on Send Button
		 */
		WebDriver driver=ChromeDriverUtil.getDriver();
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		driver.get("http://www.gmail.com/");
		//open gmail
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Email //or //identifierId
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("umagupta1960@gmail.com");
		//enter emailid
		//next or  //identifierNext
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		//click on next
		Thread.sleep(1500);
		//Passwd or @name='password'
		driver.findElement(By.xpath(".//*[@name='password']")).sendKeys("umagupta1960");
		// enter password
		//passwordNext or signIn
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		Thread.sleep(1500);
		//click on sign in
		driver.findElement(By.xpath("//*[@id=\":jc\"]")).click();
		//click on compose button

		driver.findElement(By.xpath("//*[@id=\":om\"]")).sendKeys("saiakshithreddyg@gmail.com;smitakumar@synergetics-india.com");
		//enter email id where you need to send email

		driver.findElement(By.xpath("//*[@id=\":o4\"]")).sendKeys("Please find Home invitation as attachment");
		//Enter subject
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\":pu\"]")).click();
		//click on attachment icon
		StringSelection ss = new StringSelection("E:\\Selenium\\SeleniumWS_2017\\060SeleniumWebDriver\\src\\Invitation.txt");
		//upload your file using RobotClass
		//attach your path where file is located.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(6000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\":nu\"]")).click();
		//Click on send
		System.out.println("Email Send");
	}
}
