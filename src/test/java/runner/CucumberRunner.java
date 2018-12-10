package runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty","json:target/cucumber.json"},
        features={"src/test/java/features/"},
        glue = {"src/test/java/steps/"}
)
public class CucumberRunner {
}
