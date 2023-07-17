package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true, dryRun = false, plugin = { "pretty",
		"json:target\\index.json" }, monochrome = true, features = "src\\test\\resources",glue="org.stepdefinitions")
public class TestRunnerClass {

}
