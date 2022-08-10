package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class AdactinReporting {
  public static void generateJvmReport(String jsonReportFile) {


	File file=new File("C:\\Users\\Muralikrishna\\eclipse-workspace\\CucumberSample\\target");
	
	Configuration configuration=new Configuration(file, "Adactin Automation");
	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("Browser version", "104");
	configuration.addClassifications("OS", "Windows 10");
	configuration.addClassifications("Sprint", "25");
	
   List<String> jsonFiles=new ArrayList<String>();
   jsonFiles.add(jsonReportFile);
   
   ReportBuilder builder =new ReportBuilder(jsonFiles, configuration);
   
   builder.generateReports();

}
}