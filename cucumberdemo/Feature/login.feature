Feature: TO Test login Functionality

  @SmokeTest
  Scenario Outline: Test login Functionality with valid cardential
    Given open chrome browser and luanch the application
    When Enter the Username "<username>"and Password "<password>"
    Then Login sucessfully
    Examples: 
      | username         | password |
      | jka@narola.email | password |

  
