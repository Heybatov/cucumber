Feature: Wikipedia search and verification

  Scenario: Search functionality result title validation
    Given user is on Wikipedia home page
    When user searches "Steve Jobs" in the wiki search box
    Then user should see "Steve Jobs - Wikipedia" is in the wiki title

  Scenario: Search functionality result header validation
    Given user is on Wikipedia home page
    When user searches "Steve Jobs" in the wiki search box
    Then user should see "Steve Jobs" is in the main header

  Scenario: Search functionality result header validation
    Given user is on Wikipedia home page
    When user searches "Steve Jobs" in the wiki search box
    Then user should see "Steve Jobs" is in the image header


  Scenario Outline:
    Given The user is on Wikipedia home page

    When the user types "<name>" in the wiki search box

    Then user sees the "<name>" in "<verification>"

    Examples:
      | name       | verification |
      | Steve Jobs | Title        |
      | Steve Jobs | Header       |
      | Steve Jobs | Image Header |