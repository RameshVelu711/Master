package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generatejvmreport(String jsonFile) {
		
	File file = new File("D:\\Roxy\\e\\CucumberAdactinOrderId\\target");
	
	Configuration config = new Configuration(file, "Adactin automation");
		
		config.addClassifications("Browser", "chrome");
		
		List<String> li = new ArrayList<String>();
		
		li.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(li, config);
		
		builder.generateReports();
		
		
		
	}
}
