Feature: Verify the gmail Compose
  As a User, I should be able to compose and send an email with subject and body

  Background:
    Given I launch the browser
    And I navigate to gmail login page
    And I enter valid "username" as username
    And I click on next button to enter password
    And I enter valid "password" as password
    When I click on next button to login into gmail
    Then I verify the gmail home page

  Scenario: Verify that user should able to send an email with subject and message body
    #Test-ID: TC_01
    #Priority: High
    #label:GmailCompose
    Given I Click on Compose email
    And I Check new popup is displayed
    And Enter the valid "Email" into To box
    And Enter the email subject "Incubyte Deliverables:1"
    And Enter the valid body "Automation QA test for Incubyte"
    When I click on send button
    Then I verify the gmail home page

