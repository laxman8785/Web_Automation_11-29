Feature: After Creating New Book Validation of fields and adding Accord XMLs Policies

  Scenario: Launch the booksmart library page and create workbook
   Given I am on the booksmart home page
    When I click on New Book on the Library Page
     And I enter Test_Automation into the text boxes on the New Book Page
     And  I click on Continue and validate New Book is created
     Then I should have an option to import policies and validate policies added to the new book
     
      		