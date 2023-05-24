package stepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\June21_1\\IdeaProjects\\Sel\\src\\test\\resources\\features\\gmailCompose.feature",
                    glue={"stepDefination"},
                    dryRun = false,
                    publish = true,
                    monochrome = true)
public class testRunner {
}
