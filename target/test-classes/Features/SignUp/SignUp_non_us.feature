Feature: Test Signup Functionality for Non-US Members
  Background:
    Given A valid url for desired portal

    @plan1
  Scenario: Test Signup Functionality for First plan for Non-US Members
    When user inputs email for non-us
    And Clicks Continue
    And user inputs personal details for non-us members
    And Clicks Continue
    And Subscription page will appear
    And user selects first plan non-us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan2
  Scenario: Test Signup Functionality for Second plan for Non-US Members
    When user selects second plan non-us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan3
  Scenario: Test Signup Functionality for Third plan for Non-US Members
    When user selects third plan non-us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan4
  Scenario: Test Signup Functionality for Forth plan for Non-US Members
    When user selects fourth plan non-us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan5
  Scenario: Test Signup Functionality for Fifth plan for Non-US Members
    When user selects fifth plan non-us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan6
  Scenario: Test Signup Functionality for Sixth plan for Non-US Members
    When user selects sixth plan non-us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan7
  Scenario: Test Signup Functionality for Seventh plan for Non-US Members
    When user selects seventh plan non-us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @plan8
  Scenario: Test Signup Functionality for Eighth plan for Non-US Members
    When user selects eighth plan non-us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK















