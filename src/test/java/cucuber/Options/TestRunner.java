package cucuber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//, tags =("@DeletePlace")
@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/feature", plugin = "json:target/jsonReports/cucumber-report.json", glue = {
		"stepDefinations" })
public class TestRunner {

}
