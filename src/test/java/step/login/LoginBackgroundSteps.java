package step.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginBackgroundSteps {

    @And("I click on the Login and registration link")
    public void iClickOnTheLoginAndRegistrationLink() {
        System.out.print("Here");
//        $(By.xpath("//*[@class='header-actions']/li[3]")).click();
    }

    @And("I see the login form")
    public void iSeeTheLoginForm() {
        System.out.print("Here");
//        $(".modal__holder_show_animation[_ngcontent-rz-client-c5]").shouldBe(Condition.visible);
    }
}
