Feature: Veifying facbook Login page

  Scenario: Veifying facbook Login page
    Given User is on the facebook
    When User should perform Login
      | userName | password |
      | Ramesh   |    12344 |
      | Riyo     |     3556 |
      | Kumar    |      545 |
    Then User should verify after login success message
