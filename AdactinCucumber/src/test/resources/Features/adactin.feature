Feature: verify Adactin Hotel login details

  Scenario Outline: verifying adactin hotel login with valid data
    Given user is on adactin hotel page
    When user should perform login "<userName>","<password>"
    And user should search hotels "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    And user should select hotel
    And user should book a hotel "<firstName>","<lastName>","<address>","<creditCard>","<cardType>","<selectMonth>","<selectYear>","<cvvNo>"
    Then user should get order id

    Examples: 
      | userName      | password | location    | hotels         | roomType | no Of Rooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom | firstName | lastName | address | creditCard       | cardType | selectMonth | selectYear | cvvNo |
      | Rameshriyo711 | 51W0YV   | sydney      | Hotel Creek    | Standard | 1 - One     | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123412341234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | Melbourne   | Hotel Sunshine | Double   | 1 - One     | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | Brisbane    | Hotel Hervey   | Standard | 7 - Seven   | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | Adelaide    | Hotel Cornice  | Deluxe   | 3 - Three   | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | London      | Hotel Creek    | Double   | 1 - One     | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | New York    | Hotel Sunshine | Standard | 1 - One     | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | Los Angeles | Hotel Creek    | Deluxe   | 3 - Three   | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | sydney      | Hotel Hervey   | Double   | 7 - Seven   | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | Melbourne   | Hotel Creek    | Standard | 1 - One     | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | Brisbane    | Hotel Hervey   | Double   | 3 - Three   | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
      | Rameshriyo711 | 51W0YV   | Los Angeles | Hotel Creek    | Deluxe   | 1 - One     | 03/01/2023  | 04/01/2023   | 1 - One       | 1 - One          | Ramesh    | riyo     | chennai | 1234123000041234 | VISA     | September   |       2020 |  1234 |
