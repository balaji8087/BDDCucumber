package stepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\gmailCompose.feature",
                    glue={"stepDefination"},
                    dryRun = true,
                    publish = true,
                    monochrome = true)
public class testRunner {
}
