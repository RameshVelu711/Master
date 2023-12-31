package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	/**
	 * @see maintains to generate json to jvm report
	 * @param jsonFile
	 */
	public static void generatejvmreport(String jsonFile) {

		File file = new File("D:\\Roxy\\e\\OMRBranchAPIAutomation\\target");

		Configuration config = new Configuration(file, "API automation");

		config.addClassifications("Browser", "chrome");
		config.addClassifications("platform", "windows");

		List<String> li = new ArrayList<String>();

		li.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(li, config);

		builder.generateReports();

	}
}
