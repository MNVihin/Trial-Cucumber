package org.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = "org.stepsdefinition", dryRun = false, monochrome = true, tags = "@smoke",
plugin = {"pretty", "json:target/cucumber-reports/cucumber.json",
        "html:target/cucumber-html-report"})

public class RunnerClass extends AbstractTestNGCucumberTests {

	/*
	 * @DataProvider(parallel = true)
	 * 
	 * @Override public Object[][] scenarios() {
	 * 
	 * return super.scenarios(); }
	 */
}
