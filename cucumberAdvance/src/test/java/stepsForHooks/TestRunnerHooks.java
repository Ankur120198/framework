package stepsForHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/hooksInBDD.feature", glue = {"stepsForHooks" }
, monochrome = true,
plugin = { "pretty", "html:Reports/htmlReport/html",
				"json:Reports/jsonReport/Cucumber.json", "junit:Reports/junitReport/report.xml" })

public class TestRunnerHooks {

}
