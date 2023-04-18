Feature: Employees Functionality

  Scenario: Verify that User can reach New Employee Form by clicking Employees --> Create

    Given user posmanager already logged in
    When user clicks  employees button
    And  user clicks the create button
    Then user can see new employee form

  Scenario: Verify that if Employee's Name field leaves blank, an error message "The following fields are invalid:" is appeared.

    Given user posmanager already logged in
    When user clicks  employees button
    And  user clicks the create button
    And user clicks save button
    Then user should see message


    Scenario:Verify that the "Employee created" message appears under full profile.
      Given user posmanager already logged in
      When user clicks  employees button
      And  user clicks the create button
      And user