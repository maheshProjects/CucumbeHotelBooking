Feature: Verifying OMR Branch Cancel Booking Page Automation


  Scenario Outline: Booking and Change Booking and Cancel Booking
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
    When User select Cancel option
    Then User should verify Success Message after cancel "Your booking cancelled successfully"

    Examples: 
      | userName           | password        | state      | city    | roomType | checkIn    | checkOut   | rooms   | adults | child |  | Salutation | firstName | lastName | mobileNumber | email              | regNo      | companyName            | companyAddress | specialRequest | cardType   | orderId    | modifyDate |
      | tp612000@gmail.com | Prakashtn22@gre | Tamil Nadu | Madurai | Standard | 2023-08-28 | 2023-09-05 | 3-Three | 5-Five |     2 |  | Mr         | Prakash   | Pandi    |   7540068750 | tp612000@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Early Check-In | Debit Card | ECVYG78371 | 2023-08-27 |

  Scenario Outline: Cancel the existing order id (Pass the order id from Examples)
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User navigate to my account page
    Then User should verify Success Message after navigation "Bookings"
    When User search the order id "<orderId>"
    Then User should verify same order id is present or not
    When User select Cancel option
    Then User should verify Success Message after cancel "Your booking cancelled successfully"

    Examples: 
      | userName           | password        | orderId    |
      | tp612000@gmail.com | Prakashtn22@gre | ECVYG78371 |
@CancelBooking
  Scenario Outline: Cancel the First order id
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User navigate to my account page
    Then User should verify Success Message after navigation "Bookings"
    When User select Cancel option
    Then User should verify Success Message after cancel "Your booking cancelled successfully"

    Examples: 
      | userName           | password        |
      | tp612000@gmail.com | Prakashtn22@gre |
