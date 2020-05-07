Feature: Shopping

  Scenario: Buying a new sweaters
    Given User is logged in to CodersLab shop and search Hummingbird Printed Sweater
    When User chooses Hummingbird Printed Sweater
    And User checks the discount
    And User select M size
    And User select 5 pieces
    And User click ADD TO CART
    And User click Proceed to Checkout
    And User select an Address
    And User select Shipping Method
    And User select Payment Method
    Then User sees "Information successfully updated."
    And User close window

