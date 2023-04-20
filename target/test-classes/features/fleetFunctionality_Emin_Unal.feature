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


@UPGNX10-349
  Scenario: 2. Verify that USER can create a new Contract (User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount)
    Given user goes to the login page and logs in
    When user goes to the vehicle contract creation page
    And user chooses the vehicle
    And user chooses the type
    And user enters the activation cost
    Then user chooses the recurring cost amount


@UPGNX10-363
  Scenario: 3. Verify that if vehicle name field leaves blank, an error message "The following fields are invalid:" is appeared.
    Given user goes to the login page and logs in
    When user goes to the vehicle contract creation page
    And user leaves the vehicle name field blank
    Then user sees the The following fields are invalid error message

