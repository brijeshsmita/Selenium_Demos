package com.smg.moduble10.logexample.tests;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
    Demo.class
})

public class TestSuite {
	/**
	 * Setup method to set system properties
	 */
	@BeforeClass
	public static void Setup() {
		//// loading log4j.xml file
        DOMConfigurator.configure("resourses/log4j.xml");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite.class);
		System.out.println("TEST CASES RUN: " + result.getRunCount());
		System.out.println("TEST CASES FAILED: " + result.getFailureCount());
		for (Failure failure : result.getFailures()) {
			System.out.println("\nTEST NAME: " + failure.getTestHeader());
			System.out.println("\nERROR: " + failure.getMessage() + "\n");
			System.out.println(failure.getTrace());
			System.exit(0);
		}
	}
	/**
	 * Report test results
	 */
	@AfterClass
	public static void TearDown() {         
	}
}
