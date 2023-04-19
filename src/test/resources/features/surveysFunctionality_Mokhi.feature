Feature: Surveys Functionality
  User Story:
  As a Posmanager, I should be able to create and design a new survey from "Surveys" module

  @wip
  Scenario: Verify that User can reach New Survey Form by clicking Surveys --> Create
    Given user is on the login page
    And user logins by entering valid username "posmanager10@info.com" and valid password "posmanager"
    Then by clicking the login button user goes to the homepage
    And user clicks More from the menu bar and selects Surveys
    And user goes to Surveys page and clicks on Create button
    Then user should see new survey form





