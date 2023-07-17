Feature: verify Adactin Hotel login details

  Scenario: verifying adactin hotel login with valid data
    Given user is on adactin hotel page
    When user should enter username and password
    And user should click login button
    Then user should verifying after login succes message
