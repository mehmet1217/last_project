Feature:Log in in the Website

  Background:
    Given The user is on the loginpage

  @wip
  Scenario Outline: As a user I should be log in with vallid credentials
    When The user enters vallid mail adresse "<mail>"
    And The user enters vallid password "<password>"
    And The user click submit button
    Then The user should be see message "<mesage>" on the dashboard page
    Examples:
      | mail           | password | mesage       |
      | alex@gmail.com | Test.123 | Welcome Alex |


