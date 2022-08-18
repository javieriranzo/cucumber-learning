@tag
Feature: Search

  @tag1
  Scenario: Search dresses 
    Given the user enters in the index page
    When the user enters the name of dress in the search bar
    And the user clicks search button
    Then the user goes to dresses page 
