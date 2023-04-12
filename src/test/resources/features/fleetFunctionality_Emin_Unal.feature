Feature: Fleet functionality
  User story: As a POSMANAGER, I should be able to create a new Vehicle Contract.


  Scenario: Verify that User can reach New Vehicle Contracts Form by clicking Vehicles --> Vehicles Contracts --> Create
    Given user goes to the login page and logs in
    When user is on the homepage
    And user goes to the Vehicles Contracts in the Vehicles section
    Then user clicks to the create button


