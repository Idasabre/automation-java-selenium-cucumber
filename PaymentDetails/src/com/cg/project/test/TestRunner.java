package com.cg.project.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features"
				,glue="com.cg.project.stepdef"
				, tags="@SmokeTest"
				//,plugin="html:reports"
				//,plugin="json:reports/PaymentDetailsJSONReport.json"
				//,plugin="junit:reports/PaymentDetailsXMLReport.xml"
				,plugin="com.cucumber.listener.ExtentCucumberFormatter:reports/PaymentDetailsExtentReport.html"
		)
public class TestRunner {

}
