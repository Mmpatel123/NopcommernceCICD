Feature: I go to electronics page
  @REG
  Scenario: validation should be successfully done
    Given I am on the home page
    When I click on the "Contact Us" button
    Then I should see "Contact Us" Text on result page
    Then I will wait
    And the url should contain with "/contactus" button
    And i will enter my name "Megha" my Email "Mp@gmail.com" and the enquiry is "About Product"
    And Click on the submit button
    Then I should she "Your enquiry has been successfully sent to the store owner." Text
