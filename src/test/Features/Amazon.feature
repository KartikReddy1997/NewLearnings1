Feature: Validating the functionality of Amazon

  @DESKTOP
  Scenario: User visits Amazon application
    Given I am on Amazon application
    When I move to cart
    Then User should see You cart is empty