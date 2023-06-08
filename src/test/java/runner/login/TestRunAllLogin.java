package runner.login;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/login.feature"},
        glue = {"step"})
public class TestRunAllLogin extends AbstractTestNGCucumberTests {
}
