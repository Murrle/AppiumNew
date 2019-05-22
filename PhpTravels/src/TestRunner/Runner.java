package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/Features",glue={"StepDefinition"},plugin={"html:D:\\"},monochrome=true,snippets= SnippetType.CAMELCASE,tags={"@scenario1"})

public class Runner {

	

}
