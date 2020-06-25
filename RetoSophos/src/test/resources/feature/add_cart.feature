Feature: As a service user
  I need to add products to the cart
  to confirm that it was successfully added

  Scenario: Add to cart
    Given that is in the section of Televisores
    When adding a product to cart LG TV LED
    Then confirm that it was added to the cart with message El producto se agregó al carrito