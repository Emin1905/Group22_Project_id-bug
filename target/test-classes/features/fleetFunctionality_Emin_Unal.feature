@all
Feature: Fleet functionality
  User story: As a POSMANAGER, I should be able to create a new Vehicle Contract.

@UPGNX10-347
  Scenario: Verify that User can reach New Vehicle Contracts Form by clicking Vehicles --> Vehicles Contracts --> Create
    Given user goes to the login page and logs in
    When user is on the homepage
    Then user goes to the fleet page in more menu
    And user goes to the Vehicles Contracts in the Vehicles section
    Then user clicks to the create button


