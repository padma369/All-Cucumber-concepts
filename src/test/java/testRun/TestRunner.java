package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
		
					
					//features = ".\\Features\\login.feature",
					//features = ".\\Features\\Customers1.feature",
					features = ".\\Features\\Customers2.feature",
					//features = ".\\Features\\",
					glue = "stepDef",
					monochrome = true,
					//dryRun = true,
					plugin = {"pretty", "html:test-output"},
					//tags = {"@ibm_regression"}
					//tags = {"@sanity"}
					tags = {"@regression"}
					
		
				)





public class TestRunner {

}
