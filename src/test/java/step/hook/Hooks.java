package step.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        String name = scenario.getName();
        System.out.println("Scenario name - " + name);
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}
