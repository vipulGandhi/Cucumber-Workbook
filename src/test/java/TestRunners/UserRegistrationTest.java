// Suffix all class names with "Test"

package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					// features = { "src/test/resources/ApplicationFeatures" },
					features = { "src/test/resources/ApplicationFeatures/Registration.feature" },
					glue = {"StepDefinitions", "ApplicationHooks"},
					// tags = "@Smoke or/and @Regression",		
					tags = "@All",
					plugin = {"pretty",
							  "json:target/Myreports/report.json",
							  "junit:target/Myreports/report.xml"
					         },
					//monochrome = true,
					// Generate cucumber HTML reports
					// HTML report link will be displayed in the console after run
					publish = true
				)
public class UserRegistrationTest
{

}
