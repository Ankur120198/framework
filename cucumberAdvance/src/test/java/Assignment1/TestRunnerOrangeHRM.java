package Assignment1;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/orangeHRM.feature", glue = {"Assignment1" }
, monochrome = true,
plugin = { "pretty", "html:Reports1/htmlReport/html",
				"json:Reports1/jsonReport/Cucumber.json", "junit:Reports1/junitReport/report.xml" },
tags= "@Admin or @Leave")

public class TestRunnerOrangeHRM {

}
