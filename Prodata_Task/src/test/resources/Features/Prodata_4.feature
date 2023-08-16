@test4
Feature: Prodata feature #4
  Scenario: Check About Us page elements
    Given Go to prodata.az
    Then Click on About Us
    Then Click on Home button under About Us
    Then Click on About Us
    Then Click on Baku phone number on About Us page
    Then Click on Tel-Aviv phone number on About Us page
    Then Click on Contact Us on About Us page
    Then Click on About Us
    Then Click on News
    # Here is bug: instead of news we see 404 (not found) page
    Then Click on Go Back button
    # Encountered another issue: after clicking main page isn't loaded, though url is https://prodata.az/
    Then Close Browser



