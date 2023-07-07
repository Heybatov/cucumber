Feature:  Passing multiple parameters to the same step


  Scenario: Searching multiple item
    Given user is on google search page
    Then user searches the following item
      | loop academy |
      | java         |
      | selenium     |
      | cucumber bdd |
      | sql          |

