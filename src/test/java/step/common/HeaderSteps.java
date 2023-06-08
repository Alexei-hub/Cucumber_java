package step.common;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderSteps {

    @When("I search for {string}")
    public void iSearchFor(String search) {
        $(By.name("search")).setValue(search).pressEnter();
    }
}
