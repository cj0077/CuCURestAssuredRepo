Feature: F1 circuit limit check

Scenario: Test Ergast Application1
Given I want to open ergast
Then I want to check "30" limit status
Then I want to check "MRData.CircuitTable.Circuits.circuitId[0]" value
