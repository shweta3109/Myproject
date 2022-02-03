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
Feature: Signup page feature

  @tag2
  Scenario Outline: Signing up using username and password
    Given User should be on homepage that is url "https://www.demoblaze.com/"
    When Click on Sign up button
    And Enter the value of <username> and <password>
    And Click on Signup
    Then Alert should appear

    Examples: 
      | username      | password |
      | testing       | testing  |
      | testingklmnop | testing  |
