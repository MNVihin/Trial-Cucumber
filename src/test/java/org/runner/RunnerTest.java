package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", 
glue = "org.stepsdefinition", dryRun = false, monochrome = true, tags = "@smoke",
plugin = {
	    "pretty",
	    "json:target/cucumber-reports/cucumber.json",
	    "html:target/cucumber-html-report1"
	})


public class RunnerTest extends AbstractTestNGCucumberTests {

	/*
	 * @DataProvider(parallel = true)
	 * 
	 * @Override public Object[][] scenarios() {
	 * 
	 * return super.scenarios(); }
	 */
}
