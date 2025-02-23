@US04
Feature: Users should be able to access to Vehicle Contracts page

  User Story:
  As a user, I want to access to Vehicle Contracts page with Store manager account and Sales manager account.
  And Drivers account can not access the Vehicle Contract page and the app displays “You do not have permission to perform this action.”


  Scenario Outline: Verify Store manager and Sales manager can access the Vehicle Contracts page
    Given the user logged in as "<username>"
    When user is on the home page
    And user clicks on "Fleet" menu and selects on "Vehicle Contracts" option
    Then user should see url link
    And user should see "All - Vehicle Contract - Entities - System - Car - Entities - System" in the title

    Examples:
      | username      |
      | store manager |
      | sales manager |


  Scenario: Verify Driver user cannot access the Vehicle Contracts page
    Given the user logged in as "driver"
    When user is on the home page
    And user clicks on "Fleet" menu and selects on "Vehicle Contracts" option
    Then user should see the message "You do not have permission to perform this action."