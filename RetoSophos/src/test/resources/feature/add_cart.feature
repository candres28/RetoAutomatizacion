Feature: As a service user
  I need to add products to the cart
  to confirm that it was successfully added

  Scenario: Add to cart
    Given that is in the section of TELEVISORES
    When adding a product to cart LG TV LED SMART 43UM7100
    Then confirm that it was added to the cart with message El producto se agregó al carrito