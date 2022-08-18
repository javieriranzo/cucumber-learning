import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/features/search.feature", glue = "steps")
public class RunCucumberTests extends AbstractTestNGCucumberTests {
	
}
