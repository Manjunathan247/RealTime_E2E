package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterHelp {
	static ExtentSparkReporter esReporter;
	static ExtentReports reports;
	public static ExtentReports extendReporter()
	{
		String filePath = System.getProperty("user.dir")+"/Reports/index.html";
		esReporter = new ExtentSparkReporter(filePath);
		esReporter.config().setReportName("Amazon Automation");
		
		reports = new ExtentReports();
		reports.attachReporter(esReporter);
		return reports;
	}
	
	
	

}
