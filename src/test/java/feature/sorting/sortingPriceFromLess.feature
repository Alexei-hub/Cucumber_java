Feature: Sorting by price
  As a user
  I want to sort laptops by price from low to high

  Scenario: Sort laptops by price from low to high
    Given I am on the "https://rozetka.com.ua/" page
    When I search for "Ноутбуки"
#    And I sort the laptops by price from low to high
    Then the laptops should be sorted by price from low to high