Feature: As a user I need main page to have tables of tournaments, news and ratings table.

  Scenario Outline: As a user I want to see completed, current and future tournaments tables on the main page
    Given I am on the Main Page
    Then I see <TypeOfTable> table
    Examples:
      | TypeOfTable |
      | currentTournaments     |
#      | futureTournaments      |
#      | lastTournaments   |