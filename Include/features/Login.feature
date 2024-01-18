Feature: Login feature

  Scenario Outline: Test login with valid credentails
    Given User navigates to Login page
    When User enters <username> and <password>
    And clicks on login button
    Then user is navigated to home page
  
Examples:
        |username|password|
        |John Doe|ThisIsNotAPassword|
      