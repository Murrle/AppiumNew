

Feature: verify PHP login
  I want to use this template for my feature file
	Background: User is there
	Given user has to login to tester
	
	@scenario1
	  Scenario Outline: login page
    Given user has to login to test
    When i have 10 pens
    Then i have 20 pens are black
    Then i have username and password
    |Fields | Values |
    |Email|php@test.com|
    |Password|test1|
    
  @scenario2
  Scenario: login page
    Given user has to login  

 