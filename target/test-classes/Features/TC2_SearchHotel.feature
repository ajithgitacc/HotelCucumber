
Feature: Verifying OMR Hotel Booking Searchhotel module automation
@Search
  Scenario Outline: Enter all field and verify selectHotel message
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |

  Scenario Outline: Enter only the mandatory fields and verify selecthotel message
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<checkIn>","<checkOut>","<noOfRooms>" and "<noOfAdults>"
    Then User should verify after search hotel the success message "Select Hotel"

    Examples: 
      | userName                      | password | state      | city    | checkIn    | checkOut   | noOfRooms | noOfAdults |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |

  Scenario Outline: Without enter any field click search and verify all six error message
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User click the search button
    Then User should verify after search hotel the error messages "Please select state" ,"Please select city" ,"Please select Check-in date" ,"Please select Check-out date" ,"Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName                      | password |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 |

  Scenario Outline: Verify the hotel names ends with selected roomtype
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    And User should verify the searched hotel names ends with "<roomType>"

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |

  Scenario Outline: Enter all the fields and enter all the roomtypes and verify the header contains all the roomtypes
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    And User should verify the header contains "<roomType>"

    Examples: 
      | userName                      | password | state      | city    | roomType                            | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Standard/Deluxe/Suite/Luxury/Studio | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |

  Scenario Outline: verify sorting functionality hotelprice from low to high
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User click the price low to high option
    Then User should verify the hotel list is in the price range of low to high

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |

  Scenario Outline: verify sorting functionality hotelprice from high to low
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User click the price high to low option
    Then User should verify the hotel list is in the price range of high to low

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |

  Scenario Outline: verify sorting functionality hotelname from low to high
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User click the name ascending option
    Then User should verify the hotel list is in the ascending order

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |

  Scenario Outline: verify sorting functionality hotelname from high to low
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User click the name descending option
    Then User should verify the hotel list is in the descending order

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |
