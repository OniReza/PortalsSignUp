Feature: Test Signup Functionality for Non-US Members
  Background:
    Given A valid url for desired portal

    @starter2
  Scenario: Test Signup Functionality for Starter plan for Non-US Members
    When user inputs email for non-us
    And Clicks Continue
    And user inputs personal details for non-us members
    And Clicks Continue
    And Subscription page will appear
    And user selects Starter plan non us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @premier2
  Scenario: Test Signup Functionality for Premier plan for Non-US Members
    When user selects Premier plan non us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

@vip2
  Scenario: Test Signup Functionality for VIP plan for Non-US Members
    When user selects VIP plan non us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

@chairman2
  Scenario: Test Signup Functionality for Chairman plan for Non-US Members
    When user selects Chairman plan non us
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @lyopay @explorer
  Scenario: Test Signup Functionality for Explorer plan for Non-US Members
    When user inputs email for non-us
    And Clicks Continue
    And user inputs personal details for non-us members
    And Clicks Continue
    And Subscription page will appear
    And user selects explorer plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @lyopay @titan
  Scenario: Test Signup Functionality for Titan plan for Non-US Members
    When user selects titan plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @lyopay @signature
  Scenario: Test Signup Functionality for Signature plan for Non-US Members
    When user selects signature plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @lyopay @excellence
  Scenario: Test Signup Functionality for Excellence plan for Non-US Members
    When user selects excellence plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK













