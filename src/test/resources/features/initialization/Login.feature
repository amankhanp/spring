Feature: Login

  Background:
  User navigates to McDonald's Source2Pay application

  Scenario: Logging into McDonald's Source2Pay with correct username and password
    Given I am on the Login screen
    When I enter the following for Login
      | username     | password |
      | YXV0b3Rlc3Q= | MTIzNDUk |
    And I click on Login button
    Then I should be redirected to the Homepage

  Scenario: Logging into McDonald's Source2Pay with correct username and incorrect password
    Given I am on the Login screen
    When I enter the following for Login
      | username     | password |
      | YXV0b3Rlc3Q= | MTIzNDU= |
    And I click on Login button
    Then I should not be redirected to the Homepage