package step.product;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProductSteps {

    @Given("I am on the product page {string}")
    public void iAmOnTheProductPage(String url) {
        open(url);
    }

    @Then("I should see that the product is available")
    public void iShouldSeeThatTheProductIsAvailable() {
        $(".product-button__buy").shouldBe(Condition.visible).shouldHave(Condition.text("Купить"));
    }

}
