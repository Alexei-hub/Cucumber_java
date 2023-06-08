package step.common;

import bowser.InitBrowsers;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CommonSteps {
    @Given("I am on the {string} page")
    public void iAmOnThePage(String url) {
        new InitBrowsers("safari").initBrowser();
        open(url);
        getWebDriver().manage().window().maximize();
    }

    @Given("I use {string} and open page {string}")
    public void iUseBrowsersAndOpenPage(String browsers, String url) {
        System.out.println(browsers);
        new InitBrowsers(browsers).initBrowser();
        open(url);
        getWebDriver().manage().window().maximize();
    }


}
