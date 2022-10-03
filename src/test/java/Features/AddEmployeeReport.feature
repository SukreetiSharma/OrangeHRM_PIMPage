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