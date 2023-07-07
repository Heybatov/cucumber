Feature: Google search functionality Title Validation

  User story :As a user , when I am on Google searchc page
  I should be able to search whatever I want and see relevant information


  Scenario: Search functionality result title validation
    Given user is on google search page
    When user types Loop Academy in the google search box and clicks enter
    Then user should see Loop Academy - Google Search in the google title



  Scenario: Search functionality result title validation
    Given user is on google search page
    When user types "Loop Academy" in the google search box and clicks enter
    Then user should see "Loop Academy - Google Search" in the google title























