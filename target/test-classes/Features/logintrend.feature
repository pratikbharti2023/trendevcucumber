Feature: Login
  Scenario: Verify login functionality
    Given I am on the login page
    When I enter valid credentials
    And Click on login button
    Then I should be logged in
