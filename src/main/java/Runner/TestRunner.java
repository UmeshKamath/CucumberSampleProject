package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Umesh Kamath\\eclipse-workspace\\CucumberBDDFrameworkDemo\\src\\main\\java\\Features"
				,glue= {"stepDefination"}

		)
public class TestRunner {

}
