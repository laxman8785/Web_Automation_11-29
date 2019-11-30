Feature: The booksmart signon page should have verification on all the feilds

  Scenario: Error message should become visible when I try to signon without Password
    Given I am on the booksmart login page
    When I enter username in Username field and leave password as blank
    And I click on Signon button on the Log On Page
    Then Check for error message on the Log On Page should be visible

  Scenario: Error message should become visible when i try to signon without User Name
    Given I am on the booksmart login page
    When I enter password in Password field and leave Username as blank
    And I click on Signon button on the Log On Page
    Then Check for error message on the Log On Page should be visible
    
  Scenario: Error message should become visible when i try to signon without User Name & Password
    Given I am on the booksmart login page
    And I click on Signon button on the Log On Page
    Then Check for error message on the Log On Page should be visible

  Scenario: when I try to signon booksmart logon page with Valid credentials
    Given I am on the booksmart login page
    When I enter username in Username field and password in Password field
    And I click on Signon button on the Log On Page
    Then I should be Log On to the booksmart landing Library Page
