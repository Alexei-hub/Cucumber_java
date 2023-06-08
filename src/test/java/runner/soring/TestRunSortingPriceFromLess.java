package runner.soring;


import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@Test
@CucumberOptions(features = {"src/test/java/feature/sorting/sortingPriceFromLess.feature"}, glue = {"step"})
public class TestRunSortingPriceFromLess extends AbstractTestNGCucumberTests {

    @After
    public void after() {
        closeWebDriver();
    }
}
