Feature:
#
#  Scenario:  test
#    Given I am on rozetka
#    Given I Enter "iPhone" to Search Button
#    When I click on the Search Button
#    Then I check to see the result "iPhone"
##   // And I close the browser
#
#  Scenario:  test
#    Given I am on rozetka
#    Given I Enter "Холодильник" to Search Button
#    When I click on the Search Button
#    Then I check to see the result "Холодильник"
# //   And I close the browser

  Background:
    Given I am on zoo site
  Scenario:  To populate the contact form
    When I click on "Contact"
    And I enter "Name test" into the name field
    And I enter "Address test" into the address field
    And I enter "Postcode test" into the postcode field
    And I enter "Email test" into the email field
    And I submit the contact form
    Then I check I am on the Confirmation page
    And I close the browser