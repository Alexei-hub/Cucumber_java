package runner.api;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/feature/api/ExampleApi.feature"},
        glue = {"step"})
public class TestApi extends AbstractTestNGCucumberTests {
}
