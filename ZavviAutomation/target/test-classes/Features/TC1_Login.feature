@Login
Feature: Verifying Zavvi Login page Module

  Scenario Outline: Verifying homepage of Zavvi with some credential
    Given User is on Zavvi Login page
    When User perform search of product "<searchProduct>"
    Then User verify the searched items are displayed "<expVerification>"

    Examples: 
      | searchProduct | expVerification          |
      | marvel toy    | RESULTS FOR “MARVEL TOY” |
