Feature: check google search functionality

  @Capgemini
  Scenario Outline: Check google search with chrome
    Given user is on google page
    When user searches for search
    Then user closes the browser
    
    
    @Accenture
    Scenario: Check google search with Mozilla
    Given user is on google page
    When user searches for search
    Then user closes the browser
    

   
