@tag
Feature: Search articles list

  @tag1
  Scenario Outline: Search articles
    Given the user enters in the search articles page
    When the user enters <article> in the search bar
    Then the <article> page appears

  Examples:
    | article   |
    | turrones  |
    | jamon     |
    | chocolate |