package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.AdactinReporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "pretty",
		"json:target/out.json" }, stepNotifications = true, monochrome = true, features = {
				"src\\test\\resources" }, glue = "com.stepdefinition")

public class TestRunnerClass {

	@AfterClass
	
	public static void afterClass() {
		
		AdactinReporting.generateJvmReport("C:\\Users\\Muralikrishna\\eclipse-workspace\\CucumberSample\\target\\out.json");
	}
	
	
}
