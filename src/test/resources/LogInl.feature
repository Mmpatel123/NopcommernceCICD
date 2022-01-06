Feature: Log in
  @SMOKE
  Scenario: Log in invalid input
    Given I am on the home page
   And I click on log in on login pages
    And I will Enter Invalid Email "xyz@gmail.com" But Valid Password "Avadh@2009"
    Then I click on the "Log in"
    @Thug
    Scenario: Log in with invalid Password
      Given I am on the home page
      And I click on log in on login page
      And I will Enter valid Email "xmxmyz@gmail.com" But Invalid Password "Avadh@2009"
      Then I click on the "Log in"
      @Hindustan
      Scenario: Log in with Empty Email
        Given I am on the home page
        And I click on log in on login page
        And I will Enter Empty email "" But Valid Password "Avadh@2009"
        Then I click on the "Log in"
        Then I should see "Please enter your email" Text on result pages
        @of
        Scenario: Log in with Empty Password
          Given I am on the home page
          And I click on log in on login page
          And  I will Valid email "xyzy@2009gmail.com" But empty Password " "
          Then I click on the "Log in"
