@smoke
Feature: User first lands on weekly display


  @UPGNX10-340
  Scenario:  1. User first lands on weekly display
    Given user goes to the login page and logs in
    When user is on the homepage
    Then user clicks to Calendar button.
    And user first lands on weekly display.


  @UPGNX10-341
  Scenario: 2. User can change display between Day-Week-Month
    When user clicks to Month Button
    Then display is changing
    And user clicks to Week Button
    Then display is changing
    And user clicks to Day Button
    Then display is changing


  @UPGNX10-346
  Scenario: 3. User can create event by clicking on time box on daily display
    When user is clicking on time box on daily display
    Then user insert the event name on Summary box
    And user clicks under Create button
    Then user successfully created an event