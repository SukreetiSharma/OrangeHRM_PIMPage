Feature: To Test The Functionality of PIM Page

  Scenario: Verify user is able to add Employee Report
    Given user is able to login and redirect to Pim page
    When Go to Employee Report Page to add Employee Report
    And Fill all Required Details to save Report
    Then Verify Employee Report is added and Logout

  Scenario: Verify User is able to add Employee
    Given user is able to login and navigate to Pim page
    When Go to Employee Page to add Employee
    And Fill all Required Details to add Employee
    Then Verify Employee is added and Logout

    Scenario: Verify User is able to add reporting method
      Given User is able to Login and navigate to Pim page
      When Go to Configuration and redirect to Reporting method Page
      And Add reporting  method and fill all required Details
      Then Verify Reporting method is Added and Logout

   Scenario: Verify user able to delete Employee
     Given User is able to login and navigate to Pim page
     When Click on delete Button
     Then Verify User is deleted