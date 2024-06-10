@Login
Feature: Verifying OMR Hotel Booking Login Module Automation

  Scenario Outline: Login with valid credentials
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login success message "Welcome AJITHKUMAR"

    Examples: 
      | userName                      | password |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 |

  Scenario Outline: Login with valid credentials using Enterkey
    Given User is on the omr page
    When User login "<userName>" and "<password>" and press enter key
    Then User should verify after login success message "Welcome AJITHKUMAR"

    Examples: 
      | userName                      | password |
      | ajithkumarmoorthy11@gmail.com | Ajith@31 |

  Scenario Outline: Login with invalid credentials
    Given User is on the omr page
    When User login "<userName>" and "<password>"
    Then User should verify after login error message "Invalid Login details or Your Password might have expired"

    Examples: 
      | userName                      | password |
      | ajithkumarmoorthy11@gmail.com | Ajith@   |
