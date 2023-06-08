Feature: API Request Validation

  Scenario: Retrieving user information with a non-existent ID
    Given I am authorized on the site "https://reqres.in"
    When I send a GET request to "/api/users/23"
    Then I should receive a status code of 404
    And the response body should be empty
