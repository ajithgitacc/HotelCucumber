Feature: Verifying OMR Hotel Booking book hotel module automation
@Book
  Scenario Outline: Book hotel including GST- Card(Debit Card-VISA)- with special request
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User saves the first hotelname and price
    And User select the first hotel
    And User accept the alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add guest details "<selectSalutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add GST details "<enterRegistrationNo>","<enterCompanyName>" and "<enterCompanyAddress>"
    And User click first next option
    And User add special request "<specialRequest>"
    And User click second next option
    And User add payment details,proceed with cardtype "<cardType>"
      | selectCard | cardNo           | cardName | month  | year | cvv |
      | Visa       | 5555555555552222 | Bala     | August | 2024 | 321 |
      | Mastercard | 5555555555554444 | Bala     | August | 2024 | 321 |
      | Amex       | 5555555555550000 | Bala     | August | 2024 | 321 |
      | Discover   | 5555555555556666 | Bala     | August | 2024 | 321 |
    Then User should verify after hotel booking the success message "Booking is Confirmed" and save the order id
    And User should verify the booked hotel name is same as the hotel name which was saved

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren | selectSalutation | firstName | lastName | mobileNo   | email             | enterRegistrationNo | enterCompanyName       | enterCompanyAddress | specialRequest     | cardType   |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 | Mr.              | Bala      | Murugan  | 8794561235 | bala123@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Parking Availabity | Debit Card |

  Scenario Outline: Book hotel including GST- Card(Credit Card-VISA)- with special request
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User saves the first hotelname and price
    And User select the first hotel
    And User accept the alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add guest details "<selectSalutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add GST details "<enterRegistrationNo>","<enterCompanyName>" and "<enterCompanyAddress>"
    And User click first next option
    And User add special request "<specialRequest>"
    And User click second next option
    And User add payment details,proceed with cardtype "<cardType>"
      | selectCard | cardNo           | cardName | month  | year | cvv |
      | Visa       | 5555555555552223 | Bala     | August | 2024 | 321 |
      | Mastercard | 5555555555554444 | Bala     | August | 2024 | 321 |
      | Amex       | 5555555555550000 | Bala     | August | 2024 | 321 |
      | Discover   | 5555555555556666 | Bala     | August | 2024 | 321 |
    Then User should verify after hotel booking the success message "Booking is Confirmed" and save the order id
    And User should verify the booked hotel name is same as the hotel name which was saved

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren | selectSalutation | firstName | lastName | mobileNo   | email             | enterRegistrationNo | enterCompanyName       | enterCompanyAddress | specialRequest     | cardType    |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 | Mr.              | Bala      | Murugan  | 8794561235 | bala123@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Parking Availabity | Credit Card |

  Scenario Outline: Book hotel including GST- Card(Debit Card-VISA)- without special request
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User saves the first hotelname and price
    And User select the first hotel
    And User accept the alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add guest details "<selectSalutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add GST details "<enterRegistrationNo>","<enterCompanyName>" and "<enterCompanyAddress>"
    And User click first next option
    And User click second next option
    And User add payment details,proceed with cardtype "<cardType>"
      | selectCard | cardNo           | cardName | month  | year | cvv |
      | Visa       | 5555555555552222 | Bala     | August | 2024 | 321 |
      | Mastercard | 5555555555554444 | Bala     | August | 2024 | 321 |
      | Amex       | 5555555555550000 | Bala     | August | 2024 | 321 |
      | Discover   | 5555555555556666 | Bala     | August | 2024 | 321 |
    Then User should verify after hotel booking the success message "Booking is Confirmed" and save the order id
    And User should verify the booked hotel name is same as the hotel name which was saved

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren | selectSalutation | firstName | lastName | mobileNo   | email             | enterRegistrationNo | enterCompanyName       | enterCompanyAddress | cardType   |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 | Mr.              | Bala      | Murugan  | 8794561235 | bala123@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Debit Card |

  Scenario Outline: Book hotel including GST- Card(Credit Card-VISA)- without special request
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User saves the first hotelname and price
    And User select the first hotel
    And User accept the alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add guest details "<selectSalutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add GST details "<enterRegistrationNo>","<enterCompanyName>" and "<enterCompanyAddress>"
    And User click first next option
    And User click second next option
    And User add payment details,proceed with cardtype "<cardType>"
      | selectCard | cardNo           | cardName | month  | year | cvv |
      | Visa       | 5555555555552223 | Bala     | August | 2024 | 321 |
      | Mastercard | 5555555555554444 | Bala     | August | 2024 | 321 |
      | Amex       | 5555555555550000 | Bala     | August | 2024 | 321 |
      | Discover   | 5555555555556666 | Bala     | August | 2024 | 321 |
    Then User should verify after hotel booking the success message "Booking is Confirmed" and save the order id
    And User should verify the booked hotel name is same as the hotel name which was saved

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren | selectSalutation | firstName | lastName | mobileNo   | email             | enterRegistrationNo | enterCompanyName       | enterCompanyAddress | cardType    |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 | Mr.              | Bala      | Murugan  | 8794561235 | bala123@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Credit Card |

  Scenario Outline: Book hotel without GST- Card(Debit Card-VISA)- with special request
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User saves the first hotelname and price
    And User select the first hotel
    And User accept the alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add guest details "<selectSalutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User click first next option
    And User add special request "<specialRequest>"
    And User click second next option
    And User add payment details,proceed with cardtype "<cardType>"
      | selectCard | cardNo           | cardName | month  | year | cvv |
      | Visa       | 5555555555552222 | Bala     | August | 2024 | 321 |
      | Mastercard | 5555555555554444 | Bala     | August | 2024 | 321 |
      | Amex       | 5555555555550000 | Bala     | August | 2024 | 321 |
      | Discover   | 5555555555556666 | Bala     | August | 2024 | 321 |
    Then User should verify after hotel booking the success message "Booking is Confirmed" and save the order id
    And User should verify the booked hotel name is same as the hotel name which was saved

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren | selectSalutation | firstName | lastName | mobileNo   | email             | specialRequest     | cardType   |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 | Mr.              | Bala      | Murugan  | 8794561235 | bala123@gmail.com | Parking Availabity | Debit Card |

  Scenario Outline: Book hotel without GST- Card(Credit Card-VISA)- without special request
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User saves the first hotelname and price
    And User select the first hotel
    And User accept the alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add guest details "<selectSalutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User click first next option
    And User click second next option
    And User add payment details,proceed with cardtype "<cardType>"
      | selectCard | cardNo           | cardName | month  | year | cvv |
      | Visa       | 5555555555552223 | Bala     | August | 2024 | 321 |
      | Mastercard | 5555555555554444 | Bala     | August | 2024 | 321 |
      | Amex       | 5555555555550000 | Bala     | August | 2024 | 321 |
      | Discover   | 5555555555556666 | Bala     | August | 2024 | 321 |
    Then User should verify after hotel booking the success message "Booking is Confirmed" and save the order id
    And User should verify the booked hotel name is same as the hotel name which was saved

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren | selectSalutation | firstName | lastName | mobileNo   | email             | cardType    |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 | Mr.              | Bala      | Murugan  | 8794561235 | bala123@gmail.com | Credit Card |

  
  Scenario Outline: Without entering any field book hotel and verify error messages
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User saves the first hotelname and price
    And User select the first hotel
    And User accept the alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add guest details "<selectSalutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add GST details "<enterRegistrationNo>","<enterCompanyName>" and "<enterCompanyAddress>"
    And User click first next option
    And User add special request "<specialRequest>"
    And User click second next option
    And User click the submit button without entering the payment details
    Then User should verify after submit the error messages "Please select your card type", "Please select your card", "Please provide your card number", "Please provide name on your card", "Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren | selectSalutation | firstName | lastName | mobileNo   | email             | enterRegistrationNo | enterCompanyName       | enterCompanyAddress | specialRequest     |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 | Mr.              | Bala      | Murugan  | 8794561235 | bala123@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Parking Availabity |
