Feature: purchase a ticket


  Scenario Outline: purchase a ticket
    Given User navigates to Register Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<firstName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User enters State "<state>"
    And User enters ZipCode "<zipCode>"
    And User selects CardType "<cardType>"
    And User enters CreditCardNumber "<CreditCardNumber>"
    And User enters CreditCardMonth "<creditCardMonth>"
    And User enters CreditCardYear "<creditCardYear>"
    And User enters NameOnCard "<nameOnCard>"
    And User clicks RememberMe
    And User clicks Submit button
    Then User verify the message confirmation  "<getMessage>"

    
    Examples: 
      | firstName  | address      | city          | state | zipCode | cardType         | CreditCardNumber | creditCardMonth | creditCardYear | nameOnCard   | getMessage                           |
      | John Cena  | 123 drive st | Clearwater    | FL    |   12345 | Visa             |        123456789 | January         |           2025 | John Cena    | Thank you for your purchase today!   |
      | Hamza  H   | 345 drive st | Safety Harbor | FL    |   78945 | American Express |        456789123 | February        |           2026 | Hamza H      | Thank you for your purchase today!   |
      | Gary   G   | 678 drive st | Pinellas Park | FL    |   14789 | Diner's Club     |        147825293 | March           |           2027 | Gery G       | Thank you for your purchase today!   |
      | Meridian M | 912 drive st | St Pete       | FL    |   96325 | Visa             |        369852789 | April           |           2028 | Meridian M   | Thank you for your purchase today!   |
      | Yuliya   Y | 454 drive st | Dunedin       | FL    |   85296 | American Express |        986748123 | May             | 2029           |  Yulija Y    | Thank you for your purchase today!   |
