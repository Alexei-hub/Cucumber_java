package runner.menu;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/feature/menu/borderMenuCrossBrowser.feature"},
        glue = {"step"},
        tags = "@crossbrowser")
public class TestRunBorderMenuCrossBrowser extends AbstractTestNGCucumberTests {

}
