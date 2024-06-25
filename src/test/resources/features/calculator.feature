Feature: Calculator
  Scenario Outline: Addition
    Given a calculator
    When add <a> and <b>
    Then the result <sum>

    Examples:
      | a | b | sum |
      | 1 | 1 | 2   |
      | 2 | 3 | 5   |
      | 7 | 8 | 15  |
