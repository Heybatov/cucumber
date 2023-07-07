Feature: sample feature to demo soft assertions
  @soft
  Scenario: sample scenarios for soft assertions
    Given user is on Docuport login page
    When user enters credentials
      | username | b1g2_client@gmail.com |
      | password | Group2                |
    And user validate choose account pop up is visible
    And user chooses account from dropdown
    And user clicks "login" button


