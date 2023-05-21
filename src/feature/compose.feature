Feature: Verify the gmail compose

  Background:
    Given I launch Chrome browser
    And I navigate to gmail login page
    And I enter username as “username”
    And I click on next
    And I enter password as “password”
    When I click on next
    Then I should be logged in