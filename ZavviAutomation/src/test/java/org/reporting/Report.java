package org.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	public static void generateJvmReport(String jsonFile) {

		File file = new File("D:\\Roxy\\e\\ZavviAutomation\\target");
		Configuration configuration = new Configuration(file, "zavvi");
		configuration.addClassifications("platform", "windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("sprint", "9.2");

		List<String> list = new ArrayList<String>();
		list.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(list, configuration);
		builder.generateReports();
		
		
	}
}