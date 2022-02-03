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
Feature: Laptop Section

  @tag1
  Scenario: Checking the functionality of laptop section
    Given user must be on homepage that is url "https://www.demoblaze.com/"
    And Click on Login button,enter the credentials 
    And Click on login button(1)
    When Click on Laptop button
    And Click on sony vaio i5
    
  
    Then Add to cart should be displayed
    

 
