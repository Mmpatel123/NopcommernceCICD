Feature: I go to electronics page
  @REG
  Scenario: validation should be successfully done
    Given I am on the home page
    When I click on the "Contact Us" button
    Then I should see "Contact Us" Text on result page
    Then I will wait
    And the url should contain with "/contactus" button