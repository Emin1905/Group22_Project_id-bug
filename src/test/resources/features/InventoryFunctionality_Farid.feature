@F
Feature: Inventory Functionality
  User Story: User is able to login and check the Inventory module of the page

   Scenario: 1.Users should be able
   to reach New Products Form by clicking Inventory–> Products --> Create
     Given user  should be able to navigate to the login page
     When  user enters username "posmanager10@info.com" in user box
     And   user enters password "posmanager" in password box
     And   user clicks to Login button
     Then  user is on the homepage
     And user click to the inventory module
     And user landing the Inventory page
     And user clicks to "Products" button at the same page
     And user navigates to "Products" page
     And user clicks to the "create" button on the same page


     Scenario: 2. User should be able to verify
   that if Product name field leaves blank,an error message
    "The following fields are invalid:" is appeared
  and Product Name input box is bordered in red color.

       When user leaves "Product Name" box blank and clicks on save button
       Then user should be able to see "The following fields are invalid:" message on the board

  Scenario:3. User should be able to verify
  that after creating a Product,the page title includes
  the Product name.
    When user creates a product
    And  user enters  a "Product Name"
    And  user clicks to the save button
    Then user should be able to see the page title includes the Product Name



  Scenario: 4. Verify that the user should be able to see
  created Product is listed after clicking the Products module.
    When  User clicks on the Products module
    Then  User should be able to see that Product is listed



