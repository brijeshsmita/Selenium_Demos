/**
 * 
 */
package com.sbk.webtable;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sbk.util.DriverUtil;

/**
 * @author Smita B Kumar
 *
 */
public class WebTableDemo3 {

	/** The WebTableDemo2.java example is still easy as 
	 * at-least you know the row number and the column number
	 *  to be fetched from the table and you are able 
	 *  to provide it in the xpath from external excel sheet 
	 *  or any source of data sheet. But what would you 
	 *  do when the row and columns are itself dynamic 
	 *  and all you know is the Text value of any cell only 
	 *  and you like to take out the correspondence values 
	 *  of that particular cell.
	 *  For example all you know is the Text ‘Licensing’ 
	 *  in the 'webtable.html' example and 
	 *  you like to record the value for that particular 
	 *  column only such as 'Free & Paid'. 
	 */
	public static void main(String[] args) {
		WebDriver driver=DriverUtil.getDriver();
		String htmlFilePath="file:///D:/Selenium/SeleniumWS/015ModuleHandlingWebTablesFramesDynamicElements/src/com/sbk/webtable/webtable.html";
		driver.get(htmlFilePath);
		String sColValue = "Licensing";
		 
		//First loop will find the 'ClOCK Tower HOTEL' in the first column
		
		for(int i=1;i<3;i++){
			String sValue = null;
			String xpathStr=".//*[@id='content']/table/tbody/tr[1]/th["+i+"]";
			sValue = driver.findElement(
					By.xpath(xpathStr)
					).getText();
			System.out.println("sValue : "+sValue);
			if(sValue.trim().equalsIgnoreCase(sColValue)){
				
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				for (int j=2;j<4;j++){
					xpathStr=".//*[@id='content']/table/tbody/tr["+j+"]/td["+i+"]";
					String sRowValue= driver.findElement(
					By.xpath(xpathStr)
					).getText();
					System.out.println("Text at row "+sRowValue);
				}
				break;
			}	
			//break;
		}
	}
}
