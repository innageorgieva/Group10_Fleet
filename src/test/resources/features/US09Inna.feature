Feature: As a user, I should see error messages when I enter an invalid integer number
  into the calendar

  Background: User is logged in
    Given the user is on the login page
    Given the user logged in as "driver"

  Scenario: User navigates to Calendar Events page
    When user navigates to Activities dropdown menu IG
    Then user clicks on Calendar Events IG
    And user should see Calendar Events - Activities in the title IG

    When user click on Create Calendar Event button IG
    Then user should see Create Calendar event - Calendar Events - Activities in the title IG

    When user click on Repeat check box IG
    Then more check boxes will appear IG
    And user enters "-1" in Repeat Every box IG
    Then user should see an error msg IG
