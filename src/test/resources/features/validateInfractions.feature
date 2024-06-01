Feature: Validate infractions

  me as user 1111 want to validate if i have any infraction

  Scenario: validate infraction
    Given I open the main page of web quipux digital
    When I search for infractions
    Then I check the last infraction that shows
