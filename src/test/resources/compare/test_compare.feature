Feature: Are these words the same
  Sometimes it is useful to know

  Scenario: Exactly the same word
    Given I do not provide a threshold
    When When I provide "word1" and "word1"
    Then I should be told "true"

  Scenario: Totally different word
    Given I do not provide a threshold
    When When I provide "x" and "word1"
    Then I should be told "false"