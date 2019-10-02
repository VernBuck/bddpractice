Feature: Shopping Cart
  #This is an irrelevant comment, it is just there to show how to make a comment
  Scenario: I buy some apples and bananas
    Given I have the money needed for purchase
    And I am at the grocery store
    And The grocery store has apples and bananas
    When I find apples and bananas in the fruit section
    Then I place them in my cart and proceed to purchase them