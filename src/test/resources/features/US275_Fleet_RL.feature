Feature: US_275 As a user, I should be accessing all the main modules of the app.

  Scenario: As a Store Manager, I should be accessing all the 8 main modules of the app.
    Given the user logged in as "store manager"
    Then user should see eight module names below
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: As a Sales Manager, I should be accessing all the 8 main modules of the app.
    Given the user logged in as "sales manager"
    Then user should see eight module names below
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  @US275RL
  Scenario: As a driver user, I should be accessing all the 4 main modules of the app.
    Given the user logged in as "driver"
    Then driver should see four main modules below
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



