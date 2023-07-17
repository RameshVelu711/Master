@City
Feature: City Module API Automation

  Scenario Outline: Verify User Get CityList through api
    Given User add headers for the CityList
    When User send "POST" request for CityList endpoint "<stateId>"
    Then User verify the status code is 200
    Then User verify the CityList response message matches "Chennai" and saved city id

    Examples: 
      | stateId |
      |      35 |
