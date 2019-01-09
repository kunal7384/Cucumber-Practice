Feature: TO Test login Functionality

  Scenario Outline: Test login Functionality with valid cardential
    Given open chrome browser and luanch the application
    When Enter the "<Username>"  and "<Password>"
    Then Login sucessfully

    Examples: 
      | Username         | Password |
      | kd@narola.email  | password |
      | mis@narola.email | password |
