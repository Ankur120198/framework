package Assignment1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Assignment1.feature", glue = {"Assignment1" }
, monochrome = true,
plugin = { "pretty", "html:Reports/htmlReport/html",
				"json:Reports/jsonReport/Cucumber.json", "junit:Reports/junitReport/report.xml" },
tags= "@Capgemini or @Accenture")



public class TestRunnerAssignment {

}
