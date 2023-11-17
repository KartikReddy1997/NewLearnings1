package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/Features/Amazon.feature"},
        monochrome = true,
        glue = {"StepDef"},tags = "@DESKTOP",
        plugin = {
                "pretty", "html:target/cucumber-report/single",
        })

public class runner {
}




