@SearchProduct
Feature: Search product Module API Automation

  Scenario Outline: Verify User Get search product through api
    Given User add headers for search product
    And User add request body for search product "<text>"
    And User send "POST" request for search product endpoint
    Then User verify the status code is 200
    Then User verify the search product response body message "OK"

    Examples: 
      | text |
      | nuts |
