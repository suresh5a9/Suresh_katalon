@Login
Feature: Login feature

@Valid_Scenario
  Scenario Outline: Test login with valid credentails
    Given User navigates to Login page
    When User enters <username> and <password>
    And clicks on login button
    Then user is navigated to home page
  
Examples:
        |username|password|
        |John Doe|ThisIsNotAPassword|
      
@invalid_scenario
Scenario Outline: Test login with valid credentails
    Given User navigates to Login page
    When User enters <username> and <password>
    And clicks on login button
    Then Error message is displayed
  
Examples:
        |username|password|
        |John Doe|password|