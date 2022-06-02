Feature: dis.feature

Scenario: opening home page todo
    Given I have an opned googlechrome navigatore
    When I run website ToDo
    And the logo of the web site exist
    And user can hit character in the search bar 
    Then char hited by user displayed