@Select
Feature: Verifying OMR Hotel Booking Select hotel module automation

  Scenario Outline: select hotel and verify navigate to book hotel upon accepting the alert
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    When User saves the first hotelname and price
    And User select the first hotel
    And User accept the alert
    Then User should verify after select hotel the success message "Book Hotel"

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |

  Scenario Outline: select hotel and verify navigating in the samepage upon dismiss the alert
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User search hotels "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noOfRooms>","<noOfAdults>" and "<noOfChildren>"
    Then User should verify after search hotel the success message "Select Hotel"
    And User select the first hotel
    And User cancel the alert
    Then User should verify after cancel the alert it is in the same page message "Select Hotel"

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 |
