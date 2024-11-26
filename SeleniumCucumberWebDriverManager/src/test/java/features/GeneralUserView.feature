
  Feature: General View

    Scenario: Validate general user is able to view product without logging in
      Given User navigates to Online Product Page
      When User clicks on Formal drop down
      Then User should be able to view the Products