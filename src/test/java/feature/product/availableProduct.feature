Feature: Check product availability on rozetka.com.ua

  As a user of rozetka.com.ua
  I want to check if products are available on the product pages
  So that I can decide whether to make a purchase

  Scenario Outline: Product should be available
    Given I am on the product page "<product_url>"
    Then I should see that the product is available

    Examples:
      | product_url                                              |
      | https://rozetka.com.ua/solgar_33984033160/p298071413/     |
      | https://rozetka.com.ua/apple-iphone-14-128gb-midnight/p352486566/ |
