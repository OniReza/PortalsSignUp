Feature: Test Signup Functionality for US Members
  Background:
    Given A valid url for desired portal

@starterlite
  Scenario: Test Signup Functionality for Starter Lite plan for US Members
    When user inputs email
    And Clicks Continue
    And user inputs personal details
    And Clicks Continue
    And Subscription page will appear
    And user selects Starter Lite plan
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan1
  Scenario: Test Signup Functionality for First plan for US Members
    When user selects first plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan2
  Scenario: Test Signup Functionality for Second plan for US Members
    When user selects second plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan3
  Scenario: Test Signup Functionality for Third plan for US Members
    When user selects third plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan4
  Scenario: Test Signup Functionality for Fourth plan for US Members
    When user selects fourth plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan5
  Scenario: Test Signup Functionality for Fifth plan for US Members
    When user selects fifth plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan6
  Scenario: Test Signup Functionality for Sixth plan for US Members
    When user selects sixth plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan7
  Scenario: Test Signup Functionality for Seventh plan for US Members
    When user selects seventh plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan8
  Scenario: Test Signup Functionality for Eighth plan for US Members
    When user selects eighth plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK





