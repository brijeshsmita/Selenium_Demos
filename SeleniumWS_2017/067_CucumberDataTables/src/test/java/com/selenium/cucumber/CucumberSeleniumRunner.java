/**
 * 
 */
package com.selenium.cucumber;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

/**
 * @author smita
 *
 */// ={"json:target/Destination/cucumber.json"})
	// or -either 1
	// and both
@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:reports/test-report" })
// for html report
// reports->test-reports->index.html
public class CucumberSeleniumRunner {

}
