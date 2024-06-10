Feature: Verifying OMR Hotel Booking cancel booking module automation
@Cancel
  Scenario Outline: Cancel the new order id
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
    When User navigate into My Bookings page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the saved order id "<savedOrderId>"
    Then User should verify the order id
    And User should verify the booked hotel name
    And User should verify the booked hotel price
    When User modify the checkin date "<modifyCheckIn>"
    Then User should verify after modify checkin date booking success message "Booking updated successfully"
    When User search the saved order id "<savedOrderId>"
    Then User should verify the order id
    And User should verify the booked hotel name
    And User should verify the booked hotel price
    When User cancel the new order id
    Then User should verify the cancelled booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                      | password | state      | city    | roomType | checkIn    | checkOut   | noOfRooms | noOfAdults | noOfChildren | selectSalutation | firstName | lastName | mobileNo   | email             | enterRegistrationNo | enterCompanyName       | enterCompanyAddress | specialRequest     | cardType   | modifyCheckIn | savedOrderId |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | Tamil Nadu | Chennai | Deluxe   | 2024-05-15 | 2024-05-17 | 1-One     | 2-Two      |            1 | Mr.              | Bala      | Murugan  | 8794561235 | bala123@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Parking Availabity | Debit Card | 2024-05-28    | #RRZFH49408  |

  Scenario Outline: Cancel the existing order id
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User navigate into My Bookings page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the existing order id "<existingOrderId>"
    Then User should verify the order id
    When User cancel the existing order id
    Then User should verify the cancelled booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                      | password | existingOrderId |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 | #RRZFH49408     |

  
  Scenario Outline: Cancel the first order id
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"
    When User navigate into My Bookings page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User cancel the first displayed order id
    Then User should verify the cancelled booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                      | password |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 |
