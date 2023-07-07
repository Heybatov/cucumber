Feature: Received and upload documents

  @login
  Scenario Outline: Login as a different users
    Given user is on Docuport login page
    When user enters "<username>" and "<password>"
    And user clicks on "Received docs"
    And user sees "Search" is displayed
    And user sees "Download" is displayed
    And user sees "Received docs" is displayed
    And user clicks on "My uploads"
    Then  user sees "Search" is displayed
    And user sees "Download" is displayed
    And user sees "My uploads" is displayed
    Examples:
      | username                  | password |
      | b1g2_client@gmail.com     | Group2   |
      | b1g2_advisor@gmail.com    | Group2   |
      | b1g2_employee@gmail.com   | Group2   |
      | b1g2_supervisor@gmail.com | Group2   |