Feature: to test tags

  @Smoke
  Scenario: scenario1
    Given "user Given"
    When "user when"
    And "user And"
    Then "user Then"

  @Regression
  Scenario: scenario2
    Given "user Given"
    When "user when"
    And "user And"
    Then "user Then"

  @Regression @Smoke
  Scenario: scenario2
    Given "user Given"
    When "user when"
    And "user And"
    Then "user Then"
