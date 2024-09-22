
@Ebay
Feature: Advanced Search


  @Positive
  Scenario: To validate the Advanced search functionality
    Given Open the browser, enter the Ebay url.
    And Click on Advanced link
    When Select the appropriate options as displayed in the provided image
    And click on the using advanced search option link
    And user will handle the new window
    Then user will enter the search details
    And enter the inputs as per the provided three images
    And user will perform search
    And user will assert the search results
    And user will close the browser

 # @tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
 #   When I check for the <value> in step
 #   Then I verify the <status> in step

  #  Examples: 
    #  | name  | value | status  |
    #  | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
