package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", dryRun = false, snippets = SnippetType.CAMELCASE, glue = "org.stepDef", plugin = {
		"pretty", "json:target\\index.json" }, monochrome = true, stepNotifications = true)
public class TestRunner {

	
	@AfterClass
	public static void afterClass() {

	Report.generateReportBuilder("D:\\Roxy\\e\\ZaaviAutomation\\target\\index.json");
	
	
	}
	
	
}
