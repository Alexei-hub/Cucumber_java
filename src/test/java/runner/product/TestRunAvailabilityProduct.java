package runner.product;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"src/test/java/feature/product/availableProduct.feature"}, glue = {"step"})
public class TestRunAvailabilityProduct extends AbstractTestNGCucumberTests {

}
