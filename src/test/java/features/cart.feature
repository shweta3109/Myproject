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
Feature: Add to cart feature

  @tag1
  Scenario: Checking functionality of Add to cart button
    Given User should be on homepage by clicking on url "https://www.demoblaze.com/"
    And Click on login button
    And enter the login credentials
    And Click on Login Button(1),click on laptop, click on sony vaio i5
    When click on Add to cart button
   
    Then Alert should appear indiacting that it is added to cart
  

  
