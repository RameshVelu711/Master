package org.runner;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags= "@Login",features = "src\\test\\resources\\Features", dryRun = false, snippets = SnippetType.CAMELCASE, glue = "org.stepDef", plugin = {
		"pretty", "json:target\\index.json" }, monochrome = true, stepNotifications = true)
public class TestRunner extends BaseClass {

	@AfterClass
	public static void after() throws InterruptedException {

		Report.generateJvmReport("D:\\Roxy\\e\\ZavviAutomation\\target\\index.json");

		Thread.sleep(5000);
		 quitWindow();
	}

}
