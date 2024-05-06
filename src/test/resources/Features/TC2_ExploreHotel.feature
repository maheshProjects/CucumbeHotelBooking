@Explore
Feature: Verifying OMR Branch Explore Hotels Booking Automation

  Scenario Outline: Enter All Fields and verify select Hotel
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Antony George"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"

    Examples: 
      | userName           | password        | state  | city               | roomType                            | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      |nixonaj003@gmail.com | Nj3GQ2xkGr@CRFA | Kerala | Thiruvananthapuram | Standard/Deluxe/Suite/Luxury/Studio | 2023-08-29  | 2023-09-10   | 3-Three   | 3-Three    |         1 |

  Scenario Outline: Enter Mandatory Fields only and verify select Hotel
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Antony George"
    When User enter Mandatory fields "<state>","<city>","<checkInDate>","<checkOutDate>","<noOfAdults>" and "<noOfRooms>"
    Then User should verify success message after search hotel "Select Hotel"

    Examples: 
      | userName           | password        | state  | city               | checkInDate | checkOutDate | noOfRooms | noOfAdults |
      |nixonaj003@gmail.com | Nj3GQ2xkGr@CRFA | Kerala | Thiruvananthapuram | 2023-08-29  | 2023-09-10   | 3-Three   | 3-Three    |

  Scenario Outline: Without Enter Any Fields and Verify All Error Messages
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Antony George"
    When User Search Hotel Without Enter any fields
    Then User should verify Error messages after Search hotel "Please select state" , "Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName           | password        |
      |nixonaj003@gmail.com | Nj3GQ2xkGr@CRFA |

  Scenario Outline: Enter All Fields and Verify Filter Room type and select Hotel
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Antony George"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChil>"
    Then User should verify room fillter "<roomType>"
    And User should verify success message after search hotel "Select Hotel"

    Examples: 
      | userName           | password        | state  | city               | roomType                            | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      |nixonaj003@gmail.com | Nj3GQ2xkGr@CRFA | Kerala | Thiruvananthapuram | Standard/Deluxe/Suite/Luxury/Studio | 2023-08-29  | 2023-09-10   | 3-Three   | 3-Three    |         1 |

  Scenario Outline: Verifying Select Hotel and Click Ascending Order and Verify Hotel Names in Ascending or Not
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Antony George"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChil>"
    Then User should verify success message after search hotel "Select Hotel"
    When User click sort by Name Ascending
    Then User should verify Sorted by Hotel Name in Ascending

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      |nixonaj003@gmail.com | Nj3GQ2xkGr@CRFA | Kerala | Thiruvananthapuram | Standard | 2023-08-29  | 2023-09-10   | 3-Three   | 3-Three    |         1 |

  @Explore
  Scenario Outline: Verifying Select Hotel and Click Price low to high and verify price is low to high or Not
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Antony George"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChil>"
    Then User should verify success message after search hotel "Select Hotel"
    When User click sort by High to Low
    Then User should verify Sorted by Price is High To Low

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      |nixonaj003@gmail.com | Nj3GQ2xkGr@CRFA | Kerala | Thiruvananthapuram | Standard | 2023-08-29  | 2023-09-10   | 3-Three   | 3-Three    |         1 |
