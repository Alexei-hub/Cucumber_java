package runner.menu;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/feature/menu/borderMenu.feature"},
        glue = {"step"},
        tags = "@smoke")
public class TestRunBorderMenu extends AbstractTestNGCucumberTests {
}
