package org.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	public static void generateReportBuilder(String jsonFile) {

		File file = new File("D:\\Roxy\\e\\ZaaviAutomation\\target");

		Configuration config = new Configuration(file, "Zavvi");

		List<String> li = new ArrayList<String>();
		li.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(li, config);
		builder.generateReports();

	}
}