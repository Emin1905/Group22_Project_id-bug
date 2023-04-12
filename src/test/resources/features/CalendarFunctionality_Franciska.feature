Feature: User first lands on weekly display


  @UPGNX10-340
  Scenario:  1. User first lands on weekly display
    Given user is on the login page "https://qa.upgenix.net/web/login/".
    When users valid email address "salesmanager15@info.com" and password "salesmanager".
    Then user clicks on the log in button.
    And user is on the homepage.
    Then user clicks to Calendar button.
    And user first lands on weekly display.