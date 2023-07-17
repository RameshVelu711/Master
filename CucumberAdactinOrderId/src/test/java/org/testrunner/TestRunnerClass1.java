package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun= false, publish=true,
		stepNotifications = true ,monochrome = true,
    plugin = {"pretty" , "json:target\\cucumber01\\index.json"},
		name = "verifying adactin hotel login with valid data" ,
		features = "src\\test\\resources\\", glue="com.stepdef")
public class TestRunnerClass1 {

	@AfterClass
	public static void afterClass() {

		Reporting.generatejvmreport("");

	}
	
}
