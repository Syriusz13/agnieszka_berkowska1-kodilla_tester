Feature: Fizz or Buzz

  Scenario Outline: Is the number divisible by 3 or 5?
    Given Number is <number>
    When I ask, is this number divisible by three or five?
    Then I should be said <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 4 | "Nope" |

