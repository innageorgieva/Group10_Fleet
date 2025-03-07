@US05
  Feature: Users with proper access should be able to see expected columns on Vehicles Model page
    And user with no proper access should be able to see error message

  User Story:
  As a user, I want to view 10 columns on the Vehicles Model page with Store manager and Sales manager account.
  And Driver cannot access the Vehicles Model page and see “You do not have permission to perform this action.” message on the screen.

    Scenario Outline: Verify Store manager and Sales manager can access the Vehicles Model page
      Given the user logged in as "<username>"
      When user is on the home page
      And user clicks on "Fleet" menu and selects on "Vehicles Model" option
      Then user should see table with ten columns names
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

      Examples:
        | username      |
        | store manager |
        | sales manager |

    Scenario: Driver cannot access the Vehicles Model page
      Given the user logged in as "driver"
      When user is on the home page
      And user clicks on "Fleet" menu and selects on "Vehicles Model" option
      Then the user should see an error message 'You do not have permission to perform this action.'

