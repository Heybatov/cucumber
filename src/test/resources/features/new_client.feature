Feature: I WANT to create a new CLIENT in the DOCUPORT and verify it
  Background:
    Given The user is on DOCUPORT login page


  @smoke
  Scenario:Create new client
    When they visit the URL: Docuport

    And the webpage should load successfully.

    And the user types LOGIN and PASSWORD for ADVISOR

    And they click LOGIN button,

    And the user sees home page.

    And the user clicks CLIENTS button

    And they click “Create new client” button and choose PERSONAL,

    And the user sees client creation pop up window.

    And the user filled all the information about new client

    And they click SAVE button

    And the user sees Confirmation text - “<CLIENT FULL NAME> been created successfully”

    And  the user is redirected to “EDIT CLIENT” page.

    And the user filled out all fields

    And they click SAVE button

    And the user sees Confirmation “ <CLIENT FULL NAME> has been updated successfully”

    And the user LOG OUT of the APP

    And they LOG IN as a new client which was created

    Then the user should see the home page



