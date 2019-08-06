/**
 * 
 */
package com.sbk.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sbk.util.DriverUtil;

/**
 * @author Smita B Kumar
 *
 */
public class WebTablePractice2 {

	/** 
	 * 1.	Launch new Browser
	 * 2.	Open URL “"file:///D:/Selenium/SeleniumWS/015ModuleHandlingWebTablesFramesDynamicElements/src/com/sbk/webtable/webtablePractice2.html"”
	 * 3.	Get the value from cell ‘Dubai’ with using dynamic xpath
	 * 4.	Print all the column values of row ‘Clock Tower Hotel’
	 */
	public static void main(String[] args) {
		WebDriver driver=DriverUtil.getDriver();
		String htmlFilePath="file:///D:/Selenium/SeleniumWS/015ModuleHandlingWebTablesFramesDynamicElements/src/com/sbk/webtable/webtablePractice2.html";
		driver.get(htmlFilePath);
		//Here we are storing the value from the cell in to the string variable
		/*String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		 */
		String sRow = "1";
		String sCol = "2";
		String strXpath=".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]";
		//Here we are locating the xpath by passing variables in the xpath
		String sCellValue = driver.findElement(By.xpath(strXpath)).getText();
		System.out.println(sCellValue);
		String sRowValue = "Clock Tower Hotel";

		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=5;i++){
			String sValue = null;
			strXpath=".//*[@id='content']/table/tbody/tr[" + i + "]/th";
			sValue = driver.findElement(By.xpath(strXpath)).getText();
			if(sValue.equalsIgnoreCase(sRowValue)){
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row
				
				for (int j=1;j<=5;j++){
					strXpath=".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]";
					String sColumnValue= driver.findElement(By.xpath(strXpath)).getText();
					System.out.println(sColumnValue);
				}
				break;
			}
		}
		driver.close();
	}
}
