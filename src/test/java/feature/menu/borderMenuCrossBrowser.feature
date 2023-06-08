@crossbrowser
Feature: Check the quantity of categories in the menu on the rozetka.com.ua website

  Scenario Outline: Check the quantity of categories in the menu
    Given I use "<browsers>" and open page "https://rozetka.com.ua"
    Then I should see <countOfCategories> categories

    Examples: Running on different browsers
      | browsers | countOfCategories |
      | safari   | 17                |
      | chrome   | 16                |


