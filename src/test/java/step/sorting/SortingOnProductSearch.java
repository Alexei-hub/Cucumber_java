package step.sorting;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.*;

public class SortingOnProductSearch {

    @And("I sort the laptops by price from low to high")
    public void iSortTheLaptopsByPriceFromLowToHigh() {
        $(By.xpath("//select[contains(@class, 'select-css')]")).selectOptionByValue("1");
    }

    @Then("the laptops should be sorted by price from low to high")
    public void theLaptopsShouldBeSortedByPriceFromLowToHigh() {
        sleep(2000);
        $$(".goods-tile__price-value").
                shouldHave(CollectionCondition.size(60), Duration.ofSeconds(10));
        ElementsCollection prices = $$(".goods-tile__price-value");
        ArrayList<String> priceFromPage = new ArrayList<>();
        for (SelenideElement e : prices) {
            priceFromPage.add(e.getAttribute("innerText"));
        }
        priceFromPage.forEach(System.out::println);
    }
}
