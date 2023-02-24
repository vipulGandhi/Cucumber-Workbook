#Tag applied at the feature level by default gets applied to all scenarios

@All
Feature: Amazon Login

Background:
	Given User is on Amazon login page

  @Smoke, @Regression, @UserStory-1001, @Epic-2001
  Scenario: Login to Amazon website with valid credentials
    When User login with valid name "ValidUser" and valid password "ValidPassword"
    Then User is logged into the application "true"
    And The Login page redirects to users dashboard and Valid user name "ValidUser" is displayed
    
  @Sanity
	Scenario: Login to Amazon website with invalid credentials
		When User login with invalid name "InvalidUser" and invalid password "InvalidPassword"
		Then User is logged into the application "false"
		And Error message is displayed
