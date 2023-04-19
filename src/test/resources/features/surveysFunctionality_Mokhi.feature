@all
Feature: Surveys Functionality
  User Story:
  As a Posmanager, I should be able to create and design a new survey from "Surveys" module


  Scenario: Verify that User can reach New Survey Form by clicking Surveys --> Create
    Given user is on the login page
    And user logins by entering valid username "posmanager10@info.com" and valid password "posmanager"
    Then by clicking the login button user goes to the homepage
    And user clicks More from the menu bar and selects Surveys
    And user goes to Surveys page and clicks on Create button
    Then user should see new survey form


    Scenario: Verify that if Survey Title field leaves blank, an error message "The following fields are
    invalid:" is appeared.
      Given user is on the login page
      And user logins by entering valid username "posmanager10@info.com" and valid password "posmanager"
      Then by clicking the login button user goes to the homepage
      And user clicks More from the menu bar and selects Surveys
      And user goes to Surveys page and clicks on Create button
      And user should see new survey form
      When user leaves the Survey Title field empty
      Then user should see an error message


    Scenario: Verify that the "Survey created" message appears under the survey form sheet
      Given user is on the login page
      And user logins by entering valid username "posmanager10@info.com" and valid password "posmanager"
      Then by clicking the login button user goes to the homepage
      And user clicks More from the menu bar and selects Surveys
      And user goes to Surveys page and clicks on Create button
      And user should see new survey form
      When user enters survey title "Mokhi Survey"
      Then user should see Survey created message


    Scenario: Verify that the user should be able to see created survey is listed after clicking the Surveys module
      Given user is on the login page
      And user logins by entering valid username "posmanager10@info.com" and valid password "posmanager"
      Then by clicking the login button user goes to the homepage
      And user clicks More from the menu bar and selects Surveys
      And user goes to Surveys page and clicks on Create button
      And user should see new survey form
      When user enters survey title "Mokhi Survey"
      And user clicks on Surveys module
      Then user should see created survey is listed







