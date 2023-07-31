Feature: Ability to change the rows per page as advisor

  @test
  Scenario: change and validate rows per page
    Given user is on Docuport login page
    When the user login as an ADVISOR
      | username | b1g2_advisor@gmail.com |
      | password | Group2                 |
    And the user clicks "LEADS"
    And the user sees that Rows Per Page shows 10
    And the user changes Rows Per Page to 5
    And the user sees that Rows Per Page shows 5
    And the user clicks "USERS"
    And the user sees that Rows Per Page shows 10
    And the user changes Rows Per Page to 5
    Then the user sees that Rows Per Page shows 5

