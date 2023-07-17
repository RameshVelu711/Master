@State
Feature: State Module API Automation

  Scenario: Verify User Get Statelist through api
    Given User add headers for the StateList
    When User send "GET" request for StateList endpoint
    Then User verify the status code is 200
    Then User verify the StateList response message matches "Tamil Nadu" and saved state id
