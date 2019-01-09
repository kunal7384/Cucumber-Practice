Feature: Test Login
@SmokeTest
  Scenario Outline: To test Login Functionality With Valid Cardential
    Given Open and Launch the Browser
    When i enter Valid"<username>" and "<password>"
    Then user should login Sucessfully

    Examples: 
      | username            | password |
      | kd@narola.email     | password |
      | hap@narola.email    | password |
      | jka@narola.email    | password |
      | bm@narola.email     | password |
      | kunal7384@gmail.com | password |
