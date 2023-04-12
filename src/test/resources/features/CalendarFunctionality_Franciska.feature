Feature: User first lands on weekly display


  @UPGNX10-340
  Scenario:  1. User first lands on weekly display
    Given user goes to the login page and logs in
    When user is on the homepage
    Then user clicks to Calendar button.
    And user first lands on weekly display.