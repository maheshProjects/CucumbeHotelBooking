Feature: Verifying OMR Branch Hotel Booking Automation

  #1
  @BookHotel
  Scenario Outline: Book Hotel Including GST and debit card with Special Request
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<emailId>"
    And User add the GST details "<gstNo>","<companyName>" and "<companyAdd>"
    And User add the special request "<specialReq>"
    And User add the card details "<cardType>"
      | card       | cardNo           | cardHolderName | month | year | cvv |
      | Visa       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Amex       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Mastercard | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Discover   | 5555555555552222 | Prakash        | May   | 2036 | 123 |
    Then User should verify after booking success msg "Booking is Confirmed" and save the booking id
    And User should verify same hotel booking or not

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | salutaion | firstName | lastName | mobileNo   | emailId                   | gstNo      | companyName            | companyAdd   | specialReq        | cardType |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 | Mr        | Prakash   | Arulraj  | 9176183235 | prakasharultn22@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Late CheckIn Need | Debit    |

  #2
  Scenario Outline: Book Hotel Including GST and Credit card with Special Request
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<emailId>"
    And User add the GST details "<gstNo>","<companyName>" and "<companyAdd>"
    And User add the special request "<specialReq>"
    And User add the card details "<cardType>"
      | card       | cardNo           | cardHolderName | month | year | cvv |
      | Visa       | 5555555555552223 | Prakash        | May   | 2036 | 123 |
      | Amex       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Mastercard | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Discover   | 5555555555552222 | Prakash        | May   | 2036 | 123 |
    Then User should verify after booking success msg "Booking is Confirmed" and save the booking id
    And User should verify same hotel booking or not

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | salutaion | firstName | lastName | mobileNo   | emailId                   | gstNo      | companyName            | companyAdd   | specialReq        | cardType |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 | Mr        | Prakash   | Arulraj  | 9176183235 | prakasharultn22@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Late CheckIn Need | Credit   |

  #3
  Scenario Outline: Book Hotel Including GST and Debit card without Special Request
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<emailId>"
    And User add the GST details "<gstNo>","<companyName>" and "<companyAdd>"
    And User add the card details "<cardType>"
      | card       | cardNo           | cardHolderName | month | year | cvv |
      | Visa       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Amex       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Mastercard | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Discover   | 5555555555552222 | Prakash        | May   | 2036 | 123 |
    Then User should verify after booking success msg "Booking is Confirmed" and save the booking id
    And User should verify same hotel booking or not

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | salutaion | firstName | lastName | mobileNo   | emailId                   | gstNo      | companyName            | companyAdd   | cardType |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 | Mr        | Prakash   | Arulraj  | 9176183235 | prakasharultn22@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Debit    |

  #4
  Scenario Outline: Book Hotel Including GST and Credit card without Special Request
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<emailId>"
    And User add the GST details "<gstNo>","<companyName>" and "<companyAdd>"
    And User add the card details "<cardType>"
      | card       | cardNo           | cardHolderName | month | year | cvv |
      | Visa       | 5555555555552223 | Prakash        | May   | 2036 | 123 |
      | Amex       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Mastercard | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Discover   | 5555555555552222 | Prakash        | May   | 2036 | 123 |
    Then User should verify after booking success msg "Booking is Confirmed" and save the booking id
    And User should verify same hotel booking or not

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | salutaion | firstName | lastName | mobileNo   | emailId                   | gstNo      | companyName            | companyAdd   | cardType |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 | Mr        | Prakash   | Arulraj  | 9176183235 | prakasharultn22@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Credit   |

  #5
  Scenario Outline: Book Hotel Without GST and Payment is Debit card with Special Request
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<emailId>"
    And User add the special request "<specialReq>"
    And User add the card details "<cardType>"
      | card       | cardNo           | cardHolderName | month | year | cvv |
      | Visa       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Amex       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Mastercard | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Discover   | 5555555555552222 | Prakash        | May   | 2036 | 123 |
    Then User should verify after booking success msg "Booking is Confirmed" and save the booking id
    And User should verify same hotel booking or not

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | salutaion | firstName | lastName | mobileNo   | emailId                   | specialReq        | cardType |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 | Mr        | Prakash   | Arulraj  | 9176183235 | prakasharultn22@gmail.com | Late CheckIn Need | Debit    |

  #6
  Scenario Outline: Book Hotel Without GST and Payment is Credit card without Special Request
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<emailId>"
    And User add the card details "<cardType>"
      | card       | cardNo           | cardHolderName | month | year | cvv |
      | Visa       | 5555555555552223 | Prakash        | May   | 2036 | 123 |
      | Amex       | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Mastercard | 5555555555552222 | Prakash        | May   | 2036 | 123 |
      | Discover   | 5555555555552222 | Prakash        | May   | 2036 | 123 |
    Then User should verify after booking success msg "Booking is Confirmed" and save the booking id
    And User should verify same hotel booking or not

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | salutaion | firstName | lastName | mobileNo   | emailId                   | cardType |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 | Mr        | Prakash   | Arulraj  | 9176183235 | prakasharultn22@gmail.com | Credit   |

  #7
  
  Scenario Outline: Book Hotel With GST and without Payment with Special Request and verify error message
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakash"
    When User enter all fields "<state>","<city>","<roomType>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify success message after search hotel "Select Hotel"
    When User save the first Hotel name and price and select first hotel
    And User accept alert message
    Then User should verify success message after select hotel "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<emailId>"
    And User add the GST details "<gstNo>","<companyName>" and "<companyAdd>"
    And User add the special request "<specialReq>"
    And User proceed booking without enter any payment details
    Then User should verify after booking Error Msg "Please select your card type" and "Please select your card" and "Please provide your card number" and "Please provide name on your card" and "Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName           | password        | state  | city               | roomType | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | salutaion | firstName | lastName | mobileNo   | emailId                   | gstNo      | companyName            | companyAdd   | specialReq        |
      | tp612000@gmail.com | Prakashtn22@gre | Kerala | Thiruvananthapuram | Standard | 2023-08-30  | 2023-09-10   | 3-Three   | 3-Three    |         1 | Mr        | Prakash   | Arulraj  | 9176183235 | prakasharultn22@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Late CheckIn Need |
