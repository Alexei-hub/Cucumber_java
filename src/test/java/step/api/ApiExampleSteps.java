package step.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiExampleSteps {

    Response response;

    @Given("I am authorized on the site {string}")
    public void iAmAuthorizedOnTheSite(String baseUrl) {
        RestAssured.baseURI = baseUrl;
    }

    @When("I send a GET request to {string}")
    public void iSendGetRequest(String apiEndpoint) {
        response = given().when().get(apiEndpoint);
    }

    @Then("I should receive a status code of {int}")
    public void iShouldGetStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @And("the response body should be empty")
    public void responseBodyShouldBeEmpty() {
        response.then().body(equalTo("{}"));
    }

}
