/**
 * 
 */
package com.sbk.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sbk.util.DriverUtil;

/**
 * @author Smita B Kumar
 *
 */
public class WebTableDemo1 {

	/** we need to inspect the table cell 
	 * and get the HTML location of it.
	 * In most cases tables contain text data 
	 * and we might simply like to extract the data 
	 * given in the each row or column of the table. 
	 * But sometimes tables have link or images as well, 
	 * and you can easily able to perform any action on 
	 * those elements if you can find the 
	 * HTML location of the containing cell.
	 * 
	 * Let’s take an example of above webtable.html
	 * and choose Column 1 of Row 2 which is 
	 * ‘Selenium’ in our webtable.html table:
	 */
	public static void main(String[] args) {
		WebDriver driver=DriverUtil.getDriver();
		String htmlFilePath="file:///D:/Selenium/SeleniumWS/015ModuleHandlingWebTablesFramesDynamicElements/src/com/sbk/webtable/webtable.html";
		driver.get(htmlFilePath);
		/*If we divide this xpath in to three different parts it will be like this
		•	Part 1 – Location of the table in the webpage </html/body/>
		•	Part 2 – Table body (data) starts from here <table/tbody/>
		•	Part 3 – It says table row 2 and table column 1 <tr[2]/td[1]>
		If you use this xpath you would be able to get the Selenium cell of the table. Now what? How to get the text ‘Selenium’ from the table cell?
		You need to use the ‘getText()’ method of the WebDriver element.*/
		String xpathStr="/html/body/table/tbody/tr[2]/td[1]";
		
		String data=driver.findElement(By.xpath(xpathStr)).getText();
		System.out.println("Text at row 2  col 1 : "+data);
		
	}
}
