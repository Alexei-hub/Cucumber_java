package step.menu;

import com.codeborne.selenide.CollectionCondition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class MenuSteps {

    By borderMenu = By.xpath("//ul[contains(@class,'menu-categories_type_main')]/li");

    @Then("I should see {int} categories")
    public void iShouldSeeCategories(int categorySize) {
        $$(borderMenu).shouldHave(CollectionCondition.size(categorySize));
    }

    @And("I should see the category menu containing the following categories:")
    public void iShouldSeeTheCategoryMenuContainingTheFollowingCategories(List<String> categoriesMenu) {
        $$(borderMenu).shouldHave(CollectionCondition.texts(categoriesMenu));
    }

}
