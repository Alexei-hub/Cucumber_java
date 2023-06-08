Feature: Login to Rozetka website

  As a registered user of the Rozetka website,
  I want to be able to log in to the site.

  Background:
    Given I am on the "https://rozetka.com.ua/" page
    And I click on the Login and registration link
    And I see the login form

  @loginPositive
  Scenario: Successful login
    When I enter my email "my_email@example.com"
    And I enter my password "my_password"
    And I click on the Log in button
    Then I should see my nickname "MyNickname" in the top right corner of the page

  @loginNegative
  Scenario: Unsuccessful login with incorrect password
    When I enter my email "my_email@example.com"
    And I enter an incorrect password "wrong_password"
    And I click on the Log in button
    Then I should see an error message Incorrect email or password

  @loginNegative
  Scenario: Unsuccessful login with incorrect email
    When I enter an incorrect email "wrong_email@example.com"
    And I enter my password "my_password"
    And I click on the Log in button
    Then I should see an error message Incorrect email or password
