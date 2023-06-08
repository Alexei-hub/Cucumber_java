package step.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


    @When("I enter my email {string}")
    public void iEnterMyEmail(String email) {
        System.out.print("Here");
//        $(By.id("auth_email")).setValue(email);
    }

    @And("I enter my password {string}")
    public void iEnterMyPassword(String pass) {
        System.out.print("Here");
//        $(By.id("auth_pass")).setValue(pass);
    }

    @And("I click on the Log in button")
    public void iClickOnTheButton() {
        System.out.print("Here");
//        $(By.xpath("//*[contains(@class,'auth-modal__submit')]")).click();
    }

    @Then("I should see my nickname {string} in the top right corner of the page")
    public void iShouldSeeMyNicknameInTheTopRightCornerOfThePage(String arg0) {
        System.out.print("ok");
    }

    @When("I enter an incorrect email {string}")
    public void iEnterAnIncorrectEmail(String incorrectMail) {
        System.out.print("Here");
//        $(By.id("auth_email")).setValue(incorrectMail);
    }

    @And("I enter an incorrect password {string}")
    public void iEnterAnIncorrectPassword(String incorrectPass) {
        System.out.print("Here");
//        $(By.id("auth_pass")).setValue(incorrectPass);
    }


    @Then("I should see an error message Incorrect email or password")
    public void iShouldSeeAnErrorMessageIncorrectEmailOrPassword() {
        System.out.print("Here");
//        $(".error-message").shouldHave(Condition.text("Введен неверный адрес эл.почты или номер телефона"));

    }

}
