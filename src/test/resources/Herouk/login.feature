@tag
Feature: Login Page

  @tag1
  Scenario: to valid login functionality
    Given User Landed on Herokuapp
    When User enters Username,Password
    And click on Login Page
    Then User should able to login

 # @tag2
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step

   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
