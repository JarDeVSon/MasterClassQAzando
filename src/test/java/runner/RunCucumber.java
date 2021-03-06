package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        plugin = {"json:target/report/cucumber.json","pretty","html:target/report/report.html"},
        publish = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@login"
)
public class RunCucumber {

}
