Feature: Inventory Feature
  As a SalesManager,I should be able
  to check and edit the Inventory of the company.


  Background:   Login as a SalesManager
    Given  User should be able to navigate to webpage
    Given  User should be able to enter username "salesmanager16@info.com"
    Given  User should be able to enter password "salesmanager"
    Given  User clicks the login button
    Given  User is on the homepage


  @UPGNX10-358
    Scenario: 1.Users should be able
    to reach New Products Form by clicking Inventory–> Products --> Create
    When   User clicks on Inventory button
    And    User is on the Inventory landing page
    When   User clicks on the "Products" button in the navigation menu
    Then   User is on the "Products" landing page
    And    User clicks a "Create" button on the same page
    Then   User is able to see the Product Form on the page

    @UPGNX10-359
    Scenario: 2. User should be able to verify
    that if Product name field leaves blank,an error message
    "The following fields are invalid:" is appeared
    and Product Name input box is bordered in red color.
    When  User clicks on Save button without filling the Product Name
    Then  User should be able to see "The following fields are invalid:" error message on the screen
    And   Product Name input box is bordered in red color

      @UPGNX10-360
    Scenario: User should be able to verify
      that after creating a Product,the page title includes
      the Product name.
    When  User is able to create a Product
    And   User  writes a Product Name
    And   User  clicks on Save button
    Then  The page title includes the Product name.

      @UPGNX10-361
     Scenario: Verify that the user should be able to see
     created Product is listed after clicking the Products module.
        When  User clicks on the Products module
        Then  User should be able to see that Product is listed



