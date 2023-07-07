Feature: Docuport Login Logout Feature

  Background: will run for each scenario first
    Given user is on Docuport login page


  Scenario: Login as a client
    When  user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should see the home page for client

  Scenario: Login as a employee
    When  user enters username for employee
    And user enters password for employee
    And user clicks login button
    Then user should see the home page for employee

  Scenario: Login as a advisor
    When  user enters username for advisor
    And user enters password for advisor
    And user clicks login button
    Then user should see the home page for advisor

  Scenario: Login as a admin
    When  user enters username for admin
    And user enters password for admin
    And user clicks login button
    Then user should see the home page for admin


  Scenario: Login as a client map practice
    When user enters credentials
      | username | b1g2_client@gmail.com |
      | password | Group2                |
    Then user should see the home page for client