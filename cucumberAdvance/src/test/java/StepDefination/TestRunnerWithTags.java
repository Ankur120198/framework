package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/tagsInBDD.feature", glue = {"StepDefination" }
, monochrome = true,
plugin = { "pretty", "html:Reports/htmlReport/html",
				"json:Reports/jsonReport/Cucumber.json", "junit:Reports/junitReport/report.xml" },
tags= "@Regression or  ~@Smoke")

public class TestRunnerWithTags {

}
