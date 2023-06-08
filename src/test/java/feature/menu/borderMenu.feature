@smoke
Feature: Check category menu on rozetka.com.ua homepage

  As a user of rozetka.com.ua
  I want to see the category menu on the homepage
  So that I can easily navigate to the products I'm interested in

  Scenario: Category menu should be displayed
    Given I am on the "https://rozetka.com.ua/" page
    Then I should see 17 categories
    And I should see the category menu containing the following categories:
      | Ноутбуки и компьютеры          |
      | Смартфоны, ТВ и электроника    |
      | Товары для геймеров            |
      | Бытовая техника                |
      | Товары для дома                |
      | Инструменты и автотовары       |
      | Сантехника и ремонт            |
      | Дача, сад и огород             |
      | Спорт и увлечения              |
      | Одежда, обувь и украшения      |
      | Красота и здоровье             |
      | Детские товары                 |
      | Зоотовары                      |
      | Офис, школа, книги             |
      | Алкогольные напитки и продукты |
      | Нашим защитникам               |
      | Зазеленели скидки до 50%       |

