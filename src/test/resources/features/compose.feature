Feature: Verify the gmail compose

  Background:
    Given I navigate to gmail login page
    And I enter username as "balajipk8767@gmail.com"
    And I click on next to enter password
    And I enter password as "Kamble@8087"
    When I click on next
    Then I should be logged in

    Scenario: Verify that the popup is displaying on clicking on the Compose email button
      Given Click on compose

    Scenario: Verify that the email ids can be entered in the fields To, CC, and BCC
      Given Click on compose
      And Enter "abc@gmail.com" into To box
      And Click on Cc
      And Enter "xyz@gmail.com" into CC box
      When Click on Bcc
      Then Enter "qwe@gmail.com" into BCC box


   Scenario: Verify that multiple comma seperated email ids can be entered in the To, CC, and BCC sections
     Given Click on compose
     And Enter "abc@gmail.com" "akshy@gmail.com" into Tobox
     And Click on Cc
     And Enter "xyz@gmail.com" "akhjd@gmail.cominto CCbox
     When Click on Bcc
     Then Enter "qwe@gmail.com" "incubyte@gmail.com into BCCbox

  Scenario: Verify that the text can be entered in the Subject text box and in email body area
    Given Click on compose
    And Click on Subject
    And Enter "Text" into Subject
    When Click on Message Body
    Then Enter the "body text" into message body

  Scenario: Verify that the editor options are working and allowing user to format the email body text
    Given Click on compose
    And Click on Subject
    And Enter "Text" into Subject
    And Click on Message Body
    And Enter the "body text" into message body
    When Click on formating option and able to see options such as font-family, font-size, bold, italic, underline, text color, etc
    Then Format email body text with formatting options

  Scenario: Verify that the user can add files in the attachment section and images in the email body area
    Given Click on compose
    And Click on Subject
    And Enter "Text" into Subject
    And Click on Message Body
    When Add a file from attachment option
    Then Add image in email body text area

  Scenario: Verify that the email is delivered to all the users in the To, CC, BCC and sent emails are available in the Sent Mail section
    Given Click on compose
    And Enter "abc@gmail.com" into To box
    And Click on Cc
    And Enter "xyz@gmail.com" into CC box
    And Click on Bcc
    And Enter "qwe@gmail.com" into BCC box
    When Click on send button
    Then click on sent button and able to see sent message

  Scenario: Verify that the email is delivered to all the users with non-gmail ids
    Given Click on compose
    And Enter "abc@yahoo.com" into To box
    And Click on Cc
    And Enter "xyz@hotmail.com" into CC box
    And Click on Bcc
    And Enter "qwe@bingo.com" into BCC box
    When Click on send button
    Then click on sent button and able to see sent message

  Scenario: Verify that the emails composed and not sent are stored in the Draft section
    Given Click on compose
    And Click on Subject
    And Enter "Text" into Subject
    And Click on Message Body
    And Enter the text into message body and do not send email
    When Click on Drafts Section
    Then Check non sent email is present in draft section

  Scenario: Verify whether a warning popup message is displayed when we try to send an email without Subject line
    Given Click on compose
    And Click on Subject
    And Enter "Text" into Subject
    And Click on Message Body
    And Enter the "body text" into message body
    When Click on sent
    Then Check warning message
