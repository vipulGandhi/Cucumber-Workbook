
@All
Feature: Login

  Scenario Outline: Login with valid usernme and password
    Given User is at the login page
    When User enter valid username "<username>" and password <password>
    Then Webpage redirects to user dashboard

    Examples: 
      | username   | password |
      | username_A | 123456   |
      | username_B | 123456   |
      | username_C | 123456   |
      | username_D | 123456   |
     	| username_E | 123456   |