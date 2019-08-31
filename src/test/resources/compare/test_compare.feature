Feature: Are these words the same
  Sometimes it is useful to know

  Scenario: Exactly the same word
    Given I want to make a comparison
    When When I provide "word1" and "word1"
    Then I should be told "true"

  Scenario: Totally different word
    Given I want to make a comparison
    When When I provide "x" and "word1"
    Then I should be told "false"

  Scenario: Similar enough word
    Given I want to make a comparison
    When When I provide "word1" and "word2" with threshold 0.1
    Then I should be told "true"

  Scenario: Not similar enough word
    Given I want to make a comparison
    When When I provide "word1" and "word2" with threshold 0.9
    Then I should be told "false"