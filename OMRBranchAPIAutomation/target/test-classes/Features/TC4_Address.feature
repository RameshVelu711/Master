@Address
Feature: Address Module API Automation

  Scenario Outline: Verify add user address to the application through api
    Given User add headers and bearer authorization for accessing add address endpoint
    When User add request body for add new address "<first_name>","<last_name>","<mobile>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>" and "<address_type>"
    And User send "POST" request for addUserAddress endpoint
    Then User verify the status code is 200
    Then User verify the addUserAddress response message matches "Address added successfully"

    Examples: 
      | first_name | last_name | mobile      | apartment  | state | city | country | zipcode | address | address_type |
      | Ramesh     | Velu      | 95666164877 | Casa grand |    35 | 3659 |     103 |  600039 | Chennai | Home         |

  Scenario Outline: Verify update user address to the application through api
    Given User add headers and bearer authorization for accessing update address endpoint
    When User add request body for update address  "<address_id>","<first_name>","<last_name>","<mobile>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>" and "<address_type>"
    And User send "PUT" request for updateUserAddress endpoint
    Then User verify the status code is 200
    Then User verify the updateUserAddress response message matches "Address updated successfully"

    Examples: 
      | address_id | first_name | last_name | mobile      | apartment  | state | city | country | zipcode | address | address_type |
      |      46877 | Ramesh     | Velu      | 95666164877 | Casa grand |    35 | 3659 |     103 |  600039 | Chennai | Home         |

  Scenario: Verify get user address to the application through api
    Given User add headers and bearer authorization for accessing get address endpoint
    And User send "GET" request for getUserAddress endpoint
    Then User verify the status code is 200
    Then User verify the getUserAddress response message matches "OK"

  Scenario Outline: Verify delete user address to the application through api
    Given User add headers and bearer authorization for accessing delete address endpoint
    When User add request body for delete address "<address_id>"
    And User send "DELETE" request for deleteUserAddress endpoint
    Then User verify the status code is 200
    Then User verify the deleteUserAddress response message matches "Address deleted successfully"

    Examples: 
      | address_id |
      |      46877 |
