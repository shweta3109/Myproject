#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login feature

  @tag2
  Scenario Outline: Checking functionality of login
    Given User must be on homepage url is "https://www.demoblaze.com/"
    When click on login button
    And enter <username> and <password>
    And Click on Login Button
    Then Alert should appear showing the relevant messgae

    Examples: 
      | username      | password |
      | testing       | testing  |
      | testingklmnop | testing1 |
      
