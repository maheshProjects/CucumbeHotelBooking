Feature: Verifying OMR Branch Hotel Login Automation

  Scenario Outline: Verifying Login With Valid Credentials
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Antony George"

    Examples: 
      | userName             | password        |
      | nixonaj003@gmail.com | Prakashtn22@gre |

  
  Scenario Outline: Verifying Login with Valid Credentials using Enter Key
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"  with Enter key
    Then User should verify success message after login "Welcome Antony George"

    Examples: 
      | userName             | password        |
      | nixonaj003@gmail.com | Prakashtn22@gre |
	@Login
  Scenario Outline: Verifying Login with InValid Credentials
    Given User is on the Omr branch hotel Login page
    When User login "<userName>" and "<password>"
    Then User should verify Error message after login "Invalid Login details or Your Password might have expired."

    Examples: 
      | userName             | password        |
      | nixonaj003@gmail.com | Nj3GQ2xkGr@CRFA |
