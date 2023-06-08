package runner.login;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = {"src/test/java/feature/login/login.feature"},
        glue = {"step"},
        tags = "@loginNegative",
        dryRun = false,
        monochrome = false)
public class TestRunLoginNegative extends AbstractTestNGCucumberTests {

}
