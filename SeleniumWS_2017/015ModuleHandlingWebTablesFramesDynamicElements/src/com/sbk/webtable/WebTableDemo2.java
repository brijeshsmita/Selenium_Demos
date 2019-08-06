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
public class WebTableDemo2 {

	/** Table operations are not always so simple like 
	 * WebTableDemo1 because tables can contain a large 
	 * amount of data and may be you need to pass rows 
	 * and columns dynamically in your test case.
	 * In that case you need to build your xpath with 
	 * using variables and you will pass rows 
	 * and columns to your xpath in the form of variables.
	 */
	public static void main(String[] args) {
		WebDriver driver=DriverUtil.getDriver();
		String htmlFilePath="file:///D:/Selenium/SeleniumWS/015ModuleHandlingWebTablesFramesDynamicElements/src/com/sbk/webtable/webtable.html";
		driver.get(htmlFilePath);		
		String sRow = "2";		 
		String sCol = "1";	
		/*If we divide this xpath in to three different parts it will be like this
		•	Part 1 – Location of the table in the webpage </html/body/>
		•	Part 2 – Table body (data) starts from here <table/tbody/>
		•	Part 3 – It says table row 2 and table column 1 tr["+sRow+"]/td["+sCol+"]">
		If you use this xpath you would be able to get the Selenium cell of the table. Now what? How to get the text ‘Selenium’ from the table cell?
		You need to use the ‘getText()’ method of the WebDriver element.*/
		
		String xpathStr="/html/body/table/tbody/tr["+sRow+"]/td["+sCol+"]";
		String data=driver.findElement(By.xpath(xpathStr)).getText();
		System.out.println("Text at row "+sRow+
				"col "+sCol+"  is: "+data);

	}
}
