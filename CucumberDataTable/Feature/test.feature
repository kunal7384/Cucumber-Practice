Feature: Test Login
@SmokeTest
  Scenario: To test Login Functionality
    Given open chrome browsder and launch application
    When i enter username and password
      | kd@narola.email | password |
    Then user should login

