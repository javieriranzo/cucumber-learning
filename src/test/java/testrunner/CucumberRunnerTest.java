package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/search.feature", glue = "src/test/java/steps")
public class CucumberRunnerTest extends AbstractTestNGCucumberTests{
	
}
