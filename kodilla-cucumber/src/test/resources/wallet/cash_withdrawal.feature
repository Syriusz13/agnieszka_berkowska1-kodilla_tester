Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
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
    And the balance of my wallet should be $200