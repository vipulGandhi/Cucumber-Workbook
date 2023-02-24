@All
Feature: User Registration

  Scenario: User Registration with different data [List Example]
    Given User is on registration page
    When User enter following details [List Example]
      | Abhi  | abhi@gmail.com   | Pune     |
      | Akash | akash@gmail.com  | Delhi    |
      | Aman  | aman@gmail.com   | Mumbai   | 
    Then User registration will be successfull
    
   Scenario: User Registration with different data [Map Example]
    Given User is on registration page
    When User enter following details [Map Example]
      | name  | email            | address  |
      | Abhi  | abhi@gmail.com   | Pune     |
      | Akash | akash@gmail.com  | Delhi    |
      | Aman  | aman@gmail.com   | Mumbai   | 
    Then User registration will be successfull
