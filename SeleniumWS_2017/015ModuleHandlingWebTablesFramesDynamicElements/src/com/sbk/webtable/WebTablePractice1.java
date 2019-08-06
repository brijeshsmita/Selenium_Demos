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
public class WebTablePractice1 {

	/** Launch new Browser
	 * Open URL “file:///D:/Selenium/SeleniumWS/015ModuleHandlingWebTablesFramesDynamicElements/src/com/sbk/webtable/webtablePractice.html”
	 * Get the value from cell ‘Dubai’ and print it on the console
	 * Click on the link ‘Detail’ of the first row and last column
	 */
	public static void main(String[] args) {
		WebDriver driver=DriverUtil.getDriver();
		String htmlFilePath="file:///D:/Selenium/SeleniumWS/015ModuleHandlingWebTablesFramesDynamicElements/src/com/sbk/webtable/webtablePractice.html";
		driver.get(htmlFilePath);
		//Here we are storing the value from the cell in to the string variable
		/*String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		*/
		String sCellValue="Dubai";
		outer:
		for(int i=1;i<=5;i++){
			String sValue = null;
			String xpathStr=".//*[@id='content']/table/tbody/tr["+i+"]/td["+2+"]";
			sValue = driver.findElement(
					By.xpath(xpathStr)
					).getText();
			System.out.println("sValue : "+sValue);
			if(sValue.trim().equalsIgnoreCase(sCellValue)){
				break outer;
			}
		}
		System.out.println("CellValue :"+sCellValue);		
			
		// Here we are clicking on the link i.e 'a' of first row and the last column
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		driver.close();
	}
}
