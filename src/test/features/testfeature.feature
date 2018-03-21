Feature: Test Feature

Scenario: User should be able to search on Google
    Given I am on google page
    When I serach for "Test123"
    Then I see search results