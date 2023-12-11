package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to the directory where your feature files are located
    glue = "Stepdefinition", // Package where your step definitions reside
    //tags = "@smokeTest", // Tags to filter which scenarios to run
    plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for reporting
)
public class TestRunner {

}
