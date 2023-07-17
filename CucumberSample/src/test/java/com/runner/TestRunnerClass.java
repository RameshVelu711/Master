package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Ramesh Riyo\\eclipse-workspace\\CucumberSample\\src\\test\\resources\\Feature\\Login.feature" , glue = "com.stepdefinition")
public class TestRunnerClass {
	
	

}
