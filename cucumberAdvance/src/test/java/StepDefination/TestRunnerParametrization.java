package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/parametrization.feature", glue = {"StepDefination" }
, monochrome = true, plugin = { "pretty", "html:Reports/htmlReport/html",
				"json:Reports/jsonReport/Cucumber.json", "junit:Reports/junitReport/report.xml" })

public class TestRunnerParametrization {

}
