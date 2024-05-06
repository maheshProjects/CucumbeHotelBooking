Feature: Verifying OMR Branch Change Booking Page Automation

  Scenario Outline: Booking and Change the Check In Date
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdults>" and "<noOfChil>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<emailId>"
    And User add the GST details "<gstNo>","<companyName>" and "<companyAdd>"
    And User add the special request "<specialReq>"
    And User add the card details "<cardType>"
      | card       | cardNumber       | cardHolderName | month    | year | CVV |
      | VISA       | 5555555555552222 | Prakash        | November | 2028 | 345 |
      | Amex       | 5555555555552222 | Prakash        | May      | 2036 | 123 |
      | Mastercard | 5555555555552222 | Prakash        | May      | 2036 | 123 |
      | Discover   | 5555555555552222 | Prakash        | May      | 2036 | 123 |
    Then User should verify after booking success msg "Booking is Confirmed" and save the booking id
    And User should verify same hotel booking or not
    When User navigate to my account page
    Then User should verify Success Message after navigation "Bookings"
    When User search the order id "<orderId>"
    Then User should  verify selected hotel is present or not
    And User should verify same order id is present or not
    And user should verify same price is present or not
    When User change the Checkin Date "<modifyDate>"
    Then User should verify Success Message after changed Checkin Date "Booking updated successfully"

    Examples: 
      | userName           | password        | state      | city    | roomType | checkIn    | checkOut   | rooms   | adults | child |  | Salutation | firstName | lastName | mobileNumber | email              | regNo      | companyName            | companyAddress | specialRequest | cardType   | orderId    | modifyDate |
      | tp612000@gmail.com | Prakashtn22@gre | Tamil Nadu | Madurai | Standard | 2023-08-25 | 2023-08-28 | 3-Three | 5-Five |     2 |  | Mr         | Prakash   | Pandi    |   7540068750 | tp612000@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Early Check-In | Debit Card | ECVYG78371 | 2023-08-27 |

  Scenario Outline: Change the Checkin Date for existing order id(Pass the order id from examples)
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User navigate to my account page
    Then User should verify Success Message after navigation "Bookings"
    When User search the order id "<orderId>"
    Then User should  verify selected hotel is present or not
    And User should verify same order id is present or not
    And user should verify same price is present or not
    When User change the Checkin Date "<modifyDate>"
    Then User should verify Success Message after changed Checkin Date "Booking updated successfully"

    Examples: 
      | userName           | password        | orderId    | modifyDate |
      | tp612000@gmail.com | Prakashtn22@gre | ECVYG78371 | 2023-08-27 |

  @ChangeBooking
  Scenario Outline: Change the Checkin date for first order id
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User navigate to my account page
    Then User should verify Success Message after navigation "Bookings"
    When User change the Checkin Date "<modifyDate>"
    Then User should verify Success Message after changed Checkin Date "Booking updated successfully"

    Examples: 
      | userName           | password        | modifyDate |
      | tp612000@gmail.com | Prakashtn22@gre | 2023-08-27 |
