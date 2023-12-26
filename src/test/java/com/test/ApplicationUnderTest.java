package com.test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ApplicationUnderTest extends BaseClass {

	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeTest
	public static void reportSetup() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReport\\ExtentReportResults.html");
		test = report.startTest("techment");
	}

	@Test
	private void meht() throws IOException {
		test.log(LogStatus.INFO, "Checking whether the application can read value from excel");
		readExcel(System.getProperty("user.dir")+"\\excel\\Testdate for Techment.xlsx");		
	}
}