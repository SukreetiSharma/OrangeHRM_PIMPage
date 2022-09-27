Feature: To Add Employee Report

  Scenario: Verify user is able to add Employee Report
    Given user is able to login and redirect to Pim page
    When Go to Employee Report Page to add Employee Report
    And Fill all Required Details to save Report
    Then Verify Employee Report is added and Logout