Feature: Successful order for the site SauceDemo

  Background:
    Given open browser
    And open login page

  Scenario:
    When user "standard_user" with password "secret_sauce" logged in
    And user added the item to cart
    And user went to the cart page
    And user clicked on the checkout button
    And user enters the data to be sent: FirstName "Egor" , LastName "Olegovich" , ZipCode "12345"
    And user successfully paid for the order
    Then page with the successful order is open





