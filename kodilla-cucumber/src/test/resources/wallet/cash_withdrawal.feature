Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> effd7a4fa14d445d471d60d5c028afdb563ff58f
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $230
    Then I should be informed that "You don`t have enough money"
    And the balance of my wallet should be $200

  Scenario: Negative deposit
    Given I have deposited $200 in my wallet
    When I request -$200
    Then I should be informed that "You can not request negative value"
<<<<<<< HEAD
    And the balance of my wallet should be $200
=======
    And the balance of my wallet should be $200
=======
    Then $30 should be dispensed
>>>>>>> 3288e951ab0e758ae08719973546f8c8c4c73ab5
>>>>>>> effd7a4fa14d445d471d60d5c028afdb563ff58f
