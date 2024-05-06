@Select
Feature: Verifying OMR Branch Select Hotel Booking Automation

  Scenario Outline: Select Hotel and Verify Navigate to Book Hotel upon Accepting the Alert
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 |

  Scenario Outline: Select Hotel and Verify Navigate in the Same Page upon Dismiss the Alert
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User cancel alert message
    Then User should verify success message after dismiss "Select Hotel"

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 |
