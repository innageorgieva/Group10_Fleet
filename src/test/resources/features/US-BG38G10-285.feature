@285
Feature: As a user, I want to view car odometer info on the Vehicles Odometer page.

  Background: User is already in the log in page
    Given the user is on the login page

  #@store_manager
  Scenario: Verify that Store manager see the error message “You do not have
  permission to perform this action.” when they click the Vehicle Odometer module.
    #Given the user is on the login page
    #Given the user logged in with username as "storemanager85" and password as "UserUser123"
    When the user logged in as "store manager"
    And user clicks the Vehicle Odometer module.
    Then user should see the error message “You do not have permission to perform this action.”


  #@driver_1
  Scenario: Verify that Drivers see the default page as 1.
    #Given the user is on the login page
    #Given the user logged in with username as "User1" and password as "UserUser123"
    When the user logged in as "driver"
    Then user should see the default page as 1.

  #@driver_25
  Scenario: Verify that Drivers see the View Per Page as 25 by default.
    #Given the user is on the login page
    #Given the user logged in with username as "User1" and password as "UserUser123"
    When the user logged in as "driver"
    Then user should see the default page as 25.


